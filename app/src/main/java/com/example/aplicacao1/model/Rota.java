package com.example.aplicacao1.model;

public class Rota {
    private final String consumo;
    private final String km_rodado;
    private final int gasto;
    private final String nome_rota;

    public Rota(String nome_rota, String consumo, String km_rodado, int gasto) {
        this.consumo = consumo;
        this.km_rodado = km_rodado;
        this.gasto = gasto;
        this.nome_rota= nome_rota;
    }

    @Override
    public String toString() {
        return "Litros de gasolina gastos na rota"+nome_rota+": "+gasto;
    }
}
