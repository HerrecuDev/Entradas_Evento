package org.iesdm.entradas_eventos.repository;

import lombok.extern.slf4j.Slf4j;
import org.iesdm.entradas_eventos.model.Evento;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Slf4j
@Repository
public class EventoRepository {

    private JdbcTemplate jdbcTemplate;

    public EventoRepository(JdbcTemplate jdbcTemplate){this.jdbcTemplate = jdbcTemplate;}

    public List<Evento> getAll(){

        List<Evento> eventos = jdbcTemplate.query("""
                        
                        Select * from evento
                        
                        """,
                (rs , ronNum) -> new Evento(
                        rs.getLong("id"),
                        rs.getString("nombre"),
                        rs.getString("descripcion"),
                        rs.getObject("fecha_hora" , LocalDateTime.class),
                        rs.getString("lugar"),
                        rs.getBigDecimal("precio_base"),
                        rs.getBigDecimal("recargo_grada"),
                        rs.getBigDecimal("recargo_vip"))

                );

        log.info("Devueltos{}" , eventos);
        return eventos;


    }


    /***/

    public Evento findByID(Long id){

        return jdbcTemplate.queryForObject("""
                
                select * from evento where id = ?
                
                """,(rs, ronNum) -> Evento.builder()





        )



    }



}