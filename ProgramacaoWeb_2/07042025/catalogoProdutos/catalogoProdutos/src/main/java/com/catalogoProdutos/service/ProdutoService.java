package com.catalogoProdutos.service;

import com.catalogoProdutos.domain.Produto;
import com.catalogoProdutos.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public ProdutoService(ProdutoRepository repository) {
        this.repository = repository;
    }

    public Produto cadastrarProduto(Produto produto) {
        return repository.save(produto);
    }

    public List<Produto> listarProdutos() {
        return repository.findAll();
    }

    public Produto buscarProdutoPorNome(String nome) {
        return repository.findByNome(nome)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));
    }

    public void atualizarEstoque(Long id, Integer quantidade) {
        Produto produto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Produto não encontrado"));

        if (produto.getEstoque() < quantidade) {
            throw new RuntimeException("Estoque insuficiente");
        }

        produto.setEstoque(produto.getEstoque() - quantidade);
        repository.save(produto);
    }
}