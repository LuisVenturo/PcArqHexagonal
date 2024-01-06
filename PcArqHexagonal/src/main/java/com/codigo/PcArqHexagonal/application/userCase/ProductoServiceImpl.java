package com.codigo.PcArqHexagonal.application.userCase;

import com.codigo.PcArqHexagonal.domain.models.Productos;
import com.codigo.PcArqHexagonal.domain.ports.in.ProductoIn;
import com.codigo.PcArqHexagonal.domain.ports.out.ProductoOut;

import java.util.Optional;

public class ProductoServiceImpl implements ProductoIn {

    private final ProductoOut productoOut;

    public ProductoServiceImpl(ProductoOut productoOut) {
        this.productoOut = productoOut;
    }

    @Override
    public Productos addProducto(Productos productos) {
        return productoOut.crearProducto(productos);
    }

    @Override
    public Optional<Productos> findById(Long id) {
        return productoOut.encontrarId(id);
    }

    @Override
    public Productos updateProducto(Productos productos, Long id) {
        return productoOut.actualizarProducto(productos,id);
    }

    @Override
    public Boolean deleteProductos(Long id) {
        return productoOut.eliminarProductos(id);
    }
}
