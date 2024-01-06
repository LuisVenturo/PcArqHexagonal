package com.codigo.PcArqHexagonal.infrastructure.repository.impl;

import com.codigo.PcArqHexagonal.application.service.ProductoService;
import com.codigo.PcArqHexagonal.domain.models.Productos;
import com.codigo.PcArqHexagonal.domain.ports.out.ProductoOut;
import com.codigo.PcArqHexagonal.infrastructure.entity.ProductoEntity;
import com.codigo.PcArqHexagonal.infrastructure.repository.ProductoJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Repository
public class ProductoJpaRepositoryAdapter implements ProductoOut {
    private final ProductoJpaRepository productoJpaRepository;

    public ProductoJpaRepositoryAdapter(ProductoJpaRepository productoJpaRepository) {
        this.productoJpaRepository = productoJpaRepository;
    }

    @Override
    public Productos crearProducto(Productos productos) {
        return productoJpaRepository.save(ProductoEntity.fromModel(productos)).toModel();
    }

    @Override
    public Optional<Productos> encontrarId(Long id) {
        return productoJpaRepository.findById(id).map(ProductoEntity::toModel);
    }
    @Override
    public Productos actualizarProducto(Productos productos, Long id) {
        return null;
    }

    @Override
    public Boolean eliminarProductos(Long id) {
        return null;
    }
}
