package com.codigo.PcArqHexagonal.application.service;

import com.codigo.PcArqHexagonal.domain.models.Productos;
import com.codigo.PcArqHexagonal.domain.ports.in.ProductoIn;

import java.util.Optional;

public class ProductoService implements ProductoIn {

    private final ProductoIn productoIn;

    public ProductoService(ProductoIn productoIn) {
        this.productoIn = productoIn;
    }

    @Override
    public Productos addProducto(Productos productos) {
        return productoIn.addProducto(productos);
    }

    @Override
    public Optional<Productos> findById(Long id) {
        return productoIn.findById(id);
    }

    @Override
    public Productos updateProducto(Productos productos, Long id) {
        return productoIn.updateProducto(productos, id);
    }

    @Override
    public Boolean deleteProductos(Long id) {
        return productoIn.deleteProductos(id);
    }
}
