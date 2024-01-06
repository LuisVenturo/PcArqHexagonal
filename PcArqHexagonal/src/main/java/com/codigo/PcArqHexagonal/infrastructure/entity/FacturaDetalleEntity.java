package com.codigo.PcArqHexagonal.infrastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "FacturaDetalle")
public class FacturaDetalleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detalle_id")
    Long id;

    @ManyToOne
    @JoinColumn(name = "factura_id")
    FacturaCabeceraEntity facturaCabecera;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    ProductoEntity producto;

    int cantidad;
    float precio_unitario;
    float subtotal;
}