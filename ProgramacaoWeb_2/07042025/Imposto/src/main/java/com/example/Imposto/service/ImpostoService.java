package com.example.Imposto.service;

import com.example.Imposto.pedidosClientes.Comprovante;
import com.example.Imposto.pedidosClientes.Pedido;
import org.springframework.stereotype.Service;

@Service
public class ImpostoService {
    public Comprovante calcularImposto( Pedido pedido) {
        return new Comprovante ();
    }
}
