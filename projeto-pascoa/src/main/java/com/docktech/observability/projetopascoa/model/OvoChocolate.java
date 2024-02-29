package com.docktech.observability.projetopascoa.model;

public class OvoChocolate {
    protected String tipoCasca;
    protected String tipoChocolate;
    protected Double valorTotal;

    public OvoChocolate (String tipoCasca, String tipoChocolate) {
        this.tipoCasca = tipoCasca;
        this.tipoChocolate = tipoChocolate;
        valorTotal = 0.0;
    }

    public String getTipoCasca() {
        return tipoCasca;
    }

    public void setTipoCasca(String tipoCasca) {
        this.tipoCasca = tipoCasca;
    }

    public String getTipoChocolate() {
        return tipoChocolate;
    }

    public void setTipoChocolate(String tipoChocolate) {
        this.tipoChocolate = tipoChocolate;
    }

    public double calcularValor() {
        Double chocAmargo = 51.3;
        Double chocLeite = 41.95;
        Double chocBranco = 53.95;
        Double pesoUnd = 0.25;
    }
}