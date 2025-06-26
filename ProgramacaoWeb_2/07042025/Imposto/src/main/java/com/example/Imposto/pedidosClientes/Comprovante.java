package com.example.Imposto.pedidosClientes;

import java.util.List;

public class Comprovante {
    private String cliente;
    private String UF;
    private String regiao;
    private List<String> itens;
    private double subtotal;
    private double imposto;
    private double total;
    private int aliquotaAplicada;

    public String getCliente () {
        return cliente;
    }

    public void setCliente ( String cliente ) {
        this.cliente = cliente;
    }

    public String getUF () {
        return UF;
    }

    public void setUF ( String UF ) {
        this.UF = UF;
    }

    public String getRegiao () {
        return regiao;
    }

    public void setRegiao ( String regiao ) {
        this.regiao = regiao;
    }

    public List<String> getItens () {
        return itens;
    }

    public void setItens ( List<Itens> Itens ) {
        this.itens = itens;
    }

    public double getSubtotal () {
        return subtotal;
    }

    public void setSubtotal ( double subtotal ) {
        this.subtotal = subtotal;
    }

    public double getImposto () {
        return imposto;
    }

    public void setImposto ( double imposto ) {
        this.imposto = imposto;
    }

    public double getTotal () {
        return total;
    }

    public void setTotal ( double total ) {
        this.total = total;
    }

    public int getAliquotaAplicada () {
        return aliquotaAplicada;
    }

    public void setAliquotaAplicada ( int aliquotaAplicada ) {
        this.aliquotaAplicada = aliquotaAplicada;
    }
}