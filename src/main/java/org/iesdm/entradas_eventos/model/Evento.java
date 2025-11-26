package org.iesdm.entradas_eventos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Evento {

    private Integer id;
    private String nombre;
    private String descripcion;
    private String lugar;
    private BigDecimal precioBase;
    private BigDecimal recargoVip;
    private BigDecimal recargoGrada;
    private LocalDateTime fechaHora;
    
}
