package org.iesdm.entradas_eventos.service;

import org.iesdm.entradas_eventos.repository.EventoRepository;
import org.springframework.stereotype.Service;

@Service
public class EventoService {

    private EventoRepository eventoRepository;


    public EventoRepository(EventoRepository eventoRepository){this.eventoRepository = eventoRepository;}

}
