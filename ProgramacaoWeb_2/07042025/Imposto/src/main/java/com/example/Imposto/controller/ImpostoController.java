package com.example.Imposto.controller;


import com.example.Imposto.pedidosClientes.Comprovante;
import com.example.Imposto.pedidosClientes.Pedido;
import com.example.Imposto.service.ImpostoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
public class ImpostoController {

    @Autowired
    private ImpostoService impostoService;

    @PostMapping
    public Comprovante calcularImposto( @RequestBody Pedido pedido) {
        Comprovante comprovante = new Comprovante ();
        comprovante.setCliente ( pedido.getNomeCliente ( ) );
        comprovante.setUF ( pedido.getUf ( ) );
        comprovante.setItens ( pedido.getItens ( ) );

        if (norte(pedido)){
            montaComprovante(pedido, comprovante, 45, "Norte");
        }
        if (nordeste(pedido)) {
            montaComprovante(pedido, comprovante, 40, "Nordeste");
        }
        if (centroeste(pedido)) {
            montaComprovante(pedido, comprovante, 50, "Centro Oeste");
        }
        if (sudeste(pedido)) {
            montaComprovante(pedido, comprovante, 60, "Sudeste");
        }
        if (sul(pedido)) {
            montaComprovante(pedido, comprovante, 65, "Sul");
        }

        return comprovante;
    }

    private boolean nordeste (Pedido pedido) {
        switch (pedido.getUf ( ).toUpperCase ( )) {
            case "AL": // Alagoas
            case "BA": // Bahia
            case "CE": // Ceará
            case "MA": // Maranhão
            case "PB": // Paraíba
            case "PE": // Pernambuco
            case "PI": // Piauí
            case "RN": // Rio Grande do Norte
            case "SE": // Sergipe
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    private boolean norte (Pedido pedido) {
        switch (pedido.getUf ( ).toUpperCase ( )) {
            case "AC": // Acre
            case "AP": // Amapá
            case "AM": // Amazonas
            case "PA": // Pará
            case "RO": // Rondônia
            case "RR": // Roraima
            case "TO": // Tocantins
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    private boolean sul (Pedido pedido) {
        switch (pedido.getUf ( ).toUpperCase ( )) {
            case "PR": // Paraná
            case "RS": // Rio Grande do Sul
            case "SC": // Santa Catarina
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }

    private boolean sudeste (Pedido pedido){
        switch (pedido.getUf ( ).toUpperCase ( )) {
            case "ES": // Espírito Santo
            case "MG": // Minas Gerais
            case "RJ": // Rio de Janeiro
            case "SP": // São Paulo
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }
    private boolean centroeste(Pedido pedido) {
        switch (pedido.getUf().toUpperCase()) {
            case "DF":
            case "GO":
            case "MT":
            case "MS":
                return Boolean.TRUE;
            default:
                return Boolean.FALSE;
        }
    }
    private static void montaComprovante(Pedido pedido, Comprovante comprovante, Integer aliquota, String regiao) {
        comprovante.setRegiao(regiao);
        Double subtotal = pedido.getItens ().stream()
                .mapToDouble( Itens -> Itens.getQuantidade () * Itens.getPreco ())
                .sum();
        double imposto = subtotal * aliquota / 100.0;
        double total = subtotal + imposto;

        comprovante.setSubtotal(subtotal);
        comprovante.setAliquotaAplicada(aliquota);
        comprovante.setTotal(total);
        comprovante.setImposto(imposto);
    }
}



