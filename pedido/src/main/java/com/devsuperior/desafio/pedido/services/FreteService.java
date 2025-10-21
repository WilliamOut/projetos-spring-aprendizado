package com.devsuperior.desafio.pedido.services;

import org.springframework.stereotype.Service;

import com.devsuperior.desafio.pedido.models.Pedido;


@Service
public class FreteService {
    public Double aplicarFrete(Pedido pedido) {
        if (pedido.getValorBasico() < 100.0) return 20.0;
        if (pedido.getValorBasico() >= 100 && pedido.getValorBasico() <= 200) return 12.0;
        return 0.0;
    }
}
