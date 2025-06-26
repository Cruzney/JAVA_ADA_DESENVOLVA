package com.catalogoProdutos.controller;

import com.catalogoProdutos.domain.Produto;
import com.catalogoProdutos.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    public ProdutoController(ProdutoService service) {
        this.service = service;
    }

    @PostMapping
    public Produto cadastrarProduto(@RequestBody Produto produto) {
        return service.cadastrarProduto(produto);
    }

    @GetMapping
    public List<Produto> listarProdutos() {
        return service.listarProdutos();
    }

    @GetMapping("/{nome}")
    public Produto buscarProduto(@PathVariable String nome) {
        return service.buscarProdutoPorNome(nome);
    }

    @PutMapping("/{id}/estoque")
    public void atualizarEstoque(@PathVariable Long id, @RequestParam Integer quantidade) {
        service.atualizarEstoque(id, quantidade);
    }
}