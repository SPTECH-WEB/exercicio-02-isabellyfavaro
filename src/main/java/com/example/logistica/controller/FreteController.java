package com.example.logistica.controller;

import com.example.logistica.model.EntregaRequest;
import com.example.logistica.model.EntregaResponse;
import com.example.logistica.service.FreteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frete")
public class FreteController {

    private final FreteService freteService;

    @Autowired
    public FreteController(FreteService freteService) {
        this.freteService = freteService;
    }

    @PostMapping("/calcular")
    public EntregaResponse calcularFrete(@RequestBody EntregaRequest request) {
        return freteService.processarEntrega(request);
    }
}
