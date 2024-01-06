package com.codigo.PcArqHexagonal.domain.ports.out;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;

public interface FacturaCabeceraOut {
    FacturaCabecera addFacturaCabecera(FacturaCabecera facturaCabecera);
    FacturaCabecera findById(Long id);
    FacturaCabecera updateFacturaCabecera(FacturaCabecera facturaCabecera, Long id);
    Boolean deleteFacturaCabecera(Long id);
}
