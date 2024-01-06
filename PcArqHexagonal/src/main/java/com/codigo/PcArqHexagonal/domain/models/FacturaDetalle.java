package com.codigo.PcArqHexagonal.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacturaDetalle {

    private Long id;
    private int cantidad;
    private float precio_unitario;
    private float subtotal;



}
