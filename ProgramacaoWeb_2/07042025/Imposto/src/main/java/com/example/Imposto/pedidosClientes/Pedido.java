package com.example.Imposto.pedidosClientes;

import java.util.List;

public class Pedido {
    private String nomeCliente;
    private String uf;
    private List<Itens> itens;

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public String getUf () {
        return uf;
    }

    public void setUf ( String uf ) {
        this.uf = uf;
    }

    public List<Itens> getItens() {
        return itens;
    }

    public void setItens(List<Itens> itens) {
        this.itens = itens;
    }
}
