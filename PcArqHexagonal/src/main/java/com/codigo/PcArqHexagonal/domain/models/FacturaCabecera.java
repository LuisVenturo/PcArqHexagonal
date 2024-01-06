package com.codigo.PcArqHexagonal.domain.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class FacturaCabecera {

    private Long id;
    private String cliente_nombre;
    private String cliente_num_documento;
    private Date fecha_emision;
    private float total;

    public FacturaCabecera(Long id, String cliente_nombre, String cliente_num_documento, Date fecha_emision, float total) {
        this.id = id;
        this.cliente_nombre = cliente_nombre;
        this.cliente_num_documento = cliente_num_documento;
        this.fecha_emision = fecha_emision;
        this.total = total;
    }
}
