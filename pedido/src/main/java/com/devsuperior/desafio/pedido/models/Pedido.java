package com.devsuperior.desafio.pedido.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Pedido {

    private Integer codigo;
    private Double valorBasico;
    private Integer porcentagemDesconto;

}
