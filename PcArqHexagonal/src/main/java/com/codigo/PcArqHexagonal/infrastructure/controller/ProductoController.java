package com.codigo.PcArqHexagonal.infrastructure.controller;

import com.codigo.PcArqHexagonal.application.service.ProductoService;
import com.codigo.PcArqHexagonal.domain.models.Productos;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/producto")
public class ProductoController {
    private final ProductoService productoService;
    public ProductoController(ProductoService productoService) {
        this.productoService = productoService;
    }
    @PostMapping
    public Productos addProducto(@RequestBody Productos productos){
        return productoService.addProducto(productos);
    }
    @GetMapping("/{id}")
    public Optional<Productos> getTodos(@PathVariable Long id){
        return productoService.findById(id);
    }
}
