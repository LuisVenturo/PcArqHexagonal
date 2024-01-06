package com.codigo.PcArqHexagonal.infrastructure.entity;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Table(name = "facturacabecera")
@Entity
@Getter
@Setter
public class FacturaCabeceraEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "factura_id")
    Long id;
    @Column(name = "cliente_nombre")
    String cliente;
    @Column(name = "cliente_num_documento")
    String clienteNumDoc;
    @Column(name = "fecha_emision")
    Date fecha;
    @Column(name = "total")
    float total;

    @OneToMany(mappedBy = "facturaCabecera", cascade = CascadeType.ALL)
    private List<FacturaDetalleEntity> facturaDetalle;

    public static FacturaCabeceraEntity fromDomainModel(com.codigo.PcArqHexagonal.domain.models.FacturaCabecera facturaCabecera) {
        FacturaCabeceraEntity facturaCabeceraEntity = new FacturaCabeceraEntity();
        facturaCabeceraEntity.setId(facturaCabecera.getId());
        facturaCabeceraEntity.setCliente(facturaCabecera.getCliente_nombre());
        facturaCabeceraEntity.setClienteNumDoc(facturaCabecera.getCliente_num_documento());
        facturaCabeceraEntity.setFecha(facturaCabecera.getFecha_emision());
        facturaCabeceraEntity.setTotal(facturaCabecera.getTotal());
        return facturaCabeceraEntity;
    }

    public FacturaCabecera toDomainModel() {
        return ( new FacturaCabecera(
                    this.getId(),
                    this.getCliente(),
                    this.getClienteNumDoc(),
                    this.getFecha(),
                    this.getTotal()));
    }
}