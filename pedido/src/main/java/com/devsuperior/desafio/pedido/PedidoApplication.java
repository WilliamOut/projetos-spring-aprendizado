package com.devsuperior.desafio.pedido;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.desafio.pedido.models.Pedido;
import com.devsuperior.desafio.pedido.services.DescontoService;
import com.devsuperior.desafio.pedido.services.FreteService;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner{

	@Autowired
	DescontoService descontoService;

	@Autowired
	FreteService freteService;
	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Scanner sc = new Scanner(System.in);
		Pedido p1 = new Pedido();

		System.out.println("Digite o código: ");
		p1.setCodigo(sc.nextInt());

		System.out.println("Digite o valor básico: ");
		p1.setValorBasico(sc.nextDouble());

		System.out.println("Digite a porcentagem: ");
		p1.setPorcentagemDesconto(sc.nextInt());

		System.out.println("Pedido código " + p1.getCodigo());

		Double valorFrete = freteService.aplicarFrete(p1);
		Double descontoAplicado = descontoService.aplicarDesconto(p1);
		
		System.out.println("Valor total: R$ " + (valorFrete + descontoAplicado));
		
		
		sc.close();

		
	}

}
