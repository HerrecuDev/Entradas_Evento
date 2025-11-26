package org.iesdm.entradas_eventos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CompraEntrada {

    private int id;
    private int eventoId;
    private String nombreComprador;
    private String emailComprador;
    private int numeroEntradas;
    private BigDecimal precioUnitario;
    private BigDecimal precioTotal;
    private LocalDateTime fechaCompra;
    
}
