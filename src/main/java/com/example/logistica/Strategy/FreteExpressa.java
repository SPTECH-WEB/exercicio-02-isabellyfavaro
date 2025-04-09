package com.example.logistica.Strategy;

public class FreteExpressa implements FreteStrategy {
    @Override
    public double calcular(double peso) {
        return peso * 1.5 + 10;
    }
}
