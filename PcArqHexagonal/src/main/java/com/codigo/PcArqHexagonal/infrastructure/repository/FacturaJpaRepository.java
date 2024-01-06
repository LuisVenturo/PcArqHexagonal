package com.codigo.PcArqHexagonal.infrastructure.repository;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import com.codigo.PcArqHexagonal.infrastructure.entity.FacturaCabeceraEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaJpaRepository extends JpaRepository<FacturaCabeceraEntity, Long> {

}
