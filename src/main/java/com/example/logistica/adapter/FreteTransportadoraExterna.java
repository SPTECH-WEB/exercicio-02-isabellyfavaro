package com.example.logistica.adapter;

import com.example.logistica.Strategy.FreteStrategy;

public class FreteTransportadoraExterna implements FreteStrategy {
    private final TransportadoraExternaAPI api = new TransportadoraExternaAPI();

    @Override
    public double calcular(double peso) {
        return api.calculaCustoExterno(peso);
    }
}
