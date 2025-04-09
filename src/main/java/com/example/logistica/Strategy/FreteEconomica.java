package com.example.logistica.Strategy;

public class FreteEconomica implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso * 1.0 + 5;
    }
}
