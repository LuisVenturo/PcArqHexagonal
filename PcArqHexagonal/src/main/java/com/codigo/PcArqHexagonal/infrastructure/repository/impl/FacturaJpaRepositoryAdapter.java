package com.codigo.PcArqHexagonal.infrastructure.repository.impl;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import com.codigo.PcArqHexagonal.domain.ports.out.FacturaCabeceraOut;
import com.codigo.PcArqHexagonal.infrastructure.entity.FacturaCabeceraEntity;
import com.codigo.PcArqHexagonal.infrastructure.repository.FacturaJpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

@Repository
public class FacturaJpaRepositoryAdapter implements FacturaCabeceraOut {
    private final FacturaJpaRepository facturaJpaRepository;

    public FacturaJpaRepositoryAdapter(FacturaJpaRepository facturaJpaRepository) {
        this.facturaJpaRepository = facturaJpaRepository;
    }
    @Override
    public FacturaCabecera addFacturaCabecera(FacturaCabecera facturaCabecera) {
        FacturaCabeceraEntity facturaCabeceraEntity = FacturaCabeceraEntity.fromDomainModel(facturaCabecera);
        try
        {
            FacturaCabeceraEntity facturaCabeceraEntitySave = facturaJpaRepository.save(facturaCabeceraEntity);
            return facturaCabeceraEntitySave.toDomainModel();
        }
        catch (Exception e)
        {
            System.out.println(e.getCause());
        }
        return null;
    }

    @Override
    public FacturaCabecera findById(Long id) {
        return facturaJpaRepository.findById(id).map(FacturaCabeceraEntity::toDomainModel).orElse(null);
    }

    @Override
    public FacturaCabecera updateFacturaCabecera(FacturaCabecera facturaCabecera, Long id) {
        return null;
    }

    @Override
    public Boolean deleteFacturaCabecera(Long id) {
        return null;
    }
}
