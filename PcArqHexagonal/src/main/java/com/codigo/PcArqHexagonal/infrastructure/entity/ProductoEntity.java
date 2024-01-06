package com.codigo.PcArqHexagonal.infrastructure.entity;

import com.codigo.PcArqHexagonal.domain.models.Productos;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Productos")
@AllArgsConstructor
@NoArgsConstructor
public class ProductoEntity {
    @Id
    @Column(name = "producto_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    @Column(name = "descripcion")
    String descripcion;
    @Column(name = "precio")
    float precio;
    @Column(name = "stock")
    int stock;


    @OneToMany(mappedBy = "producto", cascade = CascadeType.ALL)
    private List<FacturaDetalleEntity> facturaDetalle;

    public ProductoEntity(Long id, String nombre, String text, float decimal, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = text;
        this.precio = decimal;
        this.stock = stock;
    }
    public static ProductoEntity fromModel(com.codigo.PcArqHexagonal.domain.models.Productos productos) {
        return new ProductoEntity(productos.getId(), productos.getNombre(), productos.getDescripcion(), productos.getPrecio(), productos.getStock());
    }

    public Productos toModel() {
        return new Productos(this.id, this.nombre, this.descripcion, this.precio, this.stock);
    }
}