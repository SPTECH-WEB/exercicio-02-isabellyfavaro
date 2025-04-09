package com.example.logistica.model;

public class EntregaResponse {
    private String mensagem;
    private double valorFrete;

    public EntregaResponse(String mensagem, double valorFrete) {
        this.mensagem = mensagem;
        this.valorFrete = valorFrete;
    }

    public String getMensagem() { return mensagem; }
    public void setMensagem(String mensagem) { this.mensagem = mensagem; }

    public double getValorFrete() { return valorFrete; }
    public void setValorFrete(double valorFrete) { this.valorFrete = valorFrete; }
}
