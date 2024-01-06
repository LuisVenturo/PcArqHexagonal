package com.codigo.PcArqHexagonal.domain.ports.in;

import com.codigo.PcArqHexagonal.domain.models.Productos;

import java.util.Optional;

public interface ProductoIn {

    Productos addProducto(Productos productos);
    Optional<Productos> findById(Long id);
    Productos updateProducto(Productos productos, Long id);
    Boolean deleteProductos(Long id);
}
