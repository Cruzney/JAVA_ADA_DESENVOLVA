package com.catalogoProdutos.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    private String descricao;

    @Min(value = 0, message = "O preço deve ser positivo")
    private Double preco;

    @Min(value = 0, message = "O estoque não pode ser negativo")
    private Integer estoque;

    public Long getId () {
        return id;
    }

    public void setId ( Long id ) {
        this.id = id;
    }

    public String getNome () {
        return nome;
    }

    public void setNome ( String nome ) {
        this.nome = nome;
    }

    public String getDescricao () {
        return descricao;
    }

    public void setDescricao ( String descricao ) {
        this.descricao = descricao;
    }

    public Double getPreco () {
        return preco;
    }

    public void setPreco ( Double preco ) {
        this.preco = preco;
    }

    public Integer getEstoque () {
        return estoque;
    }

    public void setEstoque ( Integer estoque ) {
        this.estoque = estoque;
    }
}