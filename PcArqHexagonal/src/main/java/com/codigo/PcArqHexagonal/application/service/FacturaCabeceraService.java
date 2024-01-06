package com.codigo.PcArqHexagonal.application.service;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import com.codigo.PcArqHexagonal.domain.ports.in.FacturaCabeceraIn;

public class FacturaCabeceraService implements FacturaCabeceraIn {
    private final FacturaCabeceraIn facturaCabeceraIn;

    public FacturaCabeceraService(FacturaCabeceraIn facturaCabeceraIn) {
        this.facturaCabeceraIn = facturaCabeceraIn;
    }
    @Override
    public FacturaCabecera addFacturaCabecera(FacturaCabecera facturaCabecera) {
        return facturaCabeceraIn.addFacturaCabecera(facturaCabecera);
    }

    @Override
    public FacturaCabecera findById(Long id) {
        return facturaCabeceraIn.findById(id);
    }

    @Override
    public FacturaCabecera updateFacturaCabecera(FacturaCabecera facturaCabecera, Long id) {
        return facturaCabeceraIn.updateFacturaCabecera(facturaCabecera, id);
    }

    @Override
    public Boolean deleteFacturaCabecera(Long id) {
        return facturaCabeceraIn.deleteFacturaCabecera(id);
    }
}
