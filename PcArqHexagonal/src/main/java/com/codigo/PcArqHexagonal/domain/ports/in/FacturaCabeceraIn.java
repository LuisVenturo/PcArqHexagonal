package com.codigo.PcArqHexagonal.domain.ports.in;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;

public interface FacturaCabeceraIn {
    FacturaCabecera addFacturaCabecera(FacturaCabecera facturaCabecera);
    FacturaCabecera findById(Long id);
    FacturaCabecera updateFacturaCabecera(FacturaCabecera facturaCabecera, Long id);
    Boolean deleteFacturaCabecera(Long id);
}
