package com.codigo.PcArqHexagonal.domain.ports.out;

import com.codigo.PcArqHexagonal.domain.models.Productos;

import java.util.Optional;

public interface ProductoOut {
    Productos crearProducto(Productos productos);
    Optional<Productos> encontrarId(Long id);
    Productos actualizarProducto(Productos productos, Long id);
    Boolean eliminarProductos(Long id);
}
