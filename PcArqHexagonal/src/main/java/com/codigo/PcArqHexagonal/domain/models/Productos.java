package com.codigo.PcArqHexagonal.domain.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Productos {

    private Long id;
    private String nombre;
    private String descripcion;
    private float precio;
    private int stock;

    public Productos(Long id, String nombre, String descripcion, float precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }
}
