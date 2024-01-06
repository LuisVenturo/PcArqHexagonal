package com.codigo.PcArqHexagonal.infrastructure.repository;

import com.codigo.PcArqHexagonal.infrastructure.entity.ProductoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoJpaRepository extends JpaRepository<ProductoEntity, Long> {
}
