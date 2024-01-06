package com.codigo.PcArqHexagonal.application.userCase;

import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import com.codigo.PcArqHexagonal.domain.ports.in.FacturaCabeceraIn;
import com.codigo.PcArqHexagonal.domain.ports.out.FacturaCabeceraOut;

public class FacturaCabeceraServiceImpl implements FacturaCabeceraIn {
    private final FacturaCabeceraOut facturaCabeceraOut;

    public FacturaCabeceraServiceImpl(FacturaCabeceraOut facturaCabeceraOut) {
        this.facturaCabeceraOut = facturaCabeceraOut;
    }
    @Override
    public FacturaCabecera addFacturaCabecera(FacturaCabecera facturaCabecera) {
        return facturaCabeceraOut.addFacturaCabecera(facturaCabecera);
    }

    @Override
    public FacturaCabecera findById(Long id) {
        return facturaCabeceraOut.findById(id);
    }

    @Override
    public FacturaCabecera updateFacturaCabecera(FacturaCabecera facturaCabecera, Long id) {
        return facturaCabeceraOut.updateFacturaCabecera(facturaCabecera, id);
    }

    @Override
    public Boolean deleteFacturaCabecera(Long id) {
        return facturaCabeceraOut.deleteFacturaCabecera(id);
    }
}
