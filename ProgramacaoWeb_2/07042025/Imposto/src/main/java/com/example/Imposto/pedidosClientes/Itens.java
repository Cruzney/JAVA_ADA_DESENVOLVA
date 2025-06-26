package com.example.Imposto.pedidosClientes;

public class Itens {
    private String descricao;
    private Integer quantidade;
    private double preco;

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public Integer getQuantidade () {
        return quantidade;
    }

    public void setQuantidade ( int quantidade ) {
        this.quantidade = quantidade;
    }

    public double getPreco () {
        return preco;
    }

    public void setPreco ( double preco ) {
        this.preco = preco;
    }
}
