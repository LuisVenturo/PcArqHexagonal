package com.codigo.PcArqHexagonal.infrastructure.controller;

import com.codigo.PcArqHexagonal.application.service.FacturaCabeceraService;
import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/factura")
public class FacturaController {
    private final FacturaCabeceraService facturaCabeceraService;

    public FacturaController(FacturaCabeceraService facturaCabeceraService) {
        this.facturaCabeceraService = facturaCabeceraService;
    }
    @PostMapping
    public FacturaCabecera crearFacturaCabecera(@RequestBody FacturaCabecera facturaCabecera){
        return facturaCabeceraService.addFacturaCabecera(facturaCabecera);
    }
}
