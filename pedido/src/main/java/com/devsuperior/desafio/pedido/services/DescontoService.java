package com.devsuperior.desafio.pedido.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.pedido.models.Pedido;


@Service
public class DescontoService {
    
    public Double aplicarDesconto(Pedido pedido) {
        return pedido.getValorBasico() - (pedido.getValorBasico() * (pedido.getPorcentagemDesconto() / 100.0));
    }
}
