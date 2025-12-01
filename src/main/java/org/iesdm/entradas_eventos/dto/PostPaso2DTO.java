package org.iesdm.entradas_eventos.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PostPaso2DTO {

    private long evento;
    private int camtidad_entradas;
}
