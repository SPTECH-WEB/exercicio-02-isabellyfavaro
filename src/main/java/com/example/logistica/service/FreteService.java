package com.example.logistica.service;

import com.example.logistica.Strategy.FreteEconomica;
import com.example.logistica.Strategy.FreteExpressa;
import com.example.logistica.Strategy.FreteStrategy;
import com.example.logistica.adapter.FreteTransportadoraExterna;
import com.example.logistica.model.EntregaRequest;
import com.example.logistica.model.EntregaResponse;
import org.springframework.stereotype.Service;

@Service
public class FreteService {

    public EntregaResponse processarEntrega(EntregaRequest request) {
        FreteStrategy strategy = escolherStrategy(request.getModalidade());
        double valor = strategy.calcular(request.getPeso());

        String mensagem = "Entrega com modalidade '" + request.getModalidade() + "' processada com sucesso.";
        return new EntregaResponse(mensagem, valor);
    }

    private FreteStrategy escolherStrategy(String modalidade) {
        return switch (modalidade.toLowerCase()) {
            case "expressa" -> new FreteExpressa();
            case "economica" -> new FreteEconomica();
            case "terceirizada" -> new FreteTransportadoraExterna();
            default -> throw new IllegalArgumentException("Modalidade inválida: " + modalidade);
        };
    }
}
