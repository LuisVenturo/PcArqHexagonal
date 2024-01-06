package com.codigo.PcArqHexagonal.infrastructure.config;

import com.codigo.PcArqHexagonal.application.service.FacturaCabeceraService;
import com.codigo.PcArqHexagonal.application.service.ProductoService;
import com.codigo.PcArqHexagonal.application.userCase.FacturaCabeceraServiceImpl;
import com.codigo.PcArqHexagonal.application.userCase.ProductoServiceImpl;
import com.codigo.PcArqHexagonal.domain.models.FacturaCabecera;
import com.codigo.PcArqHexagonal.domain.ports.out.FacturaCabeceraOut;
import com.codigo.PcArqHexagonal.domain.ports.out.ProductoOut;
import com.codigo.PcArqHexagonal.infrastructure.repository.FacturaJpaRepository;
import com.codigo.PcArqHexagonal.infrastructure.repository.impl.FacturaJpaRepositoryAdapter;
import com.codigo.PcArqHexagonal.infrastructure.repository.impl.ProductoJpaRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
    @Bean
    public ProductoService productoService(ProductoOut productoOut){
        return new ProductoService((new ProductoServiceImpl(productoOut)));
    }
    @Bean
    public ProductoOut productoOut(ProductoJpaRepositoryAdapter productoJPARepositoryAdapter){
        return productoJPARepositoryAdapter;
    }
    @Bean
    public FacturaCabeceraService facturaCabeceraService(FacturaCabeceraOut facturaCabeceraOut){
        return new FacturaCabeceraService(new FacturaCabeceraServiceImpl(facturaCabeceraOut));
    }
    @Bean
    public FacturaCabeceraOut facturaCabeceraOut(FacturaJpaRepositoryAdapter facturaJpaRepositoryAdapter){
        return facturaJpaRepositoryAdapter;
    }
}
