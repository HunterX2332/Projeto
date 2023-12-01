package application;

import java.util.Scanner;
import java.util.Date;
import java.util.Locale;

import entities.Cliente;
import entities.Produto;
import entities.Endereco;
import entities.Pedido;
import entities.Pagamento;
import entities.Telefone;
import enums.MetodosPagamento;

/* Sistema de Compra de produtos */

public class main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cliente
		System.out.println("Digite id do Cliente: ");
		Integer idCliente = sc.nextInt();
		System.out.println("Digite seu nome do Cliente: ");
		String nome = sc.nextLine();
		System.out.println("Digite seu email do Cliente: ");
		String email = sc.nextLine();

		Cliente cliente = new Cliente(idCliente, nome, email);

		// Produto
		System.out.println("Digite o ID do Produto: ");
		int idProd = sc.nextInt();
		System.out.println("Digite o nome do produto: ");
		String nomeProd = sc.nextLine();
		System.out.println("Digite a quantidade do Produto: "); // Consumir a quebra de linha pendente
		int quantProd = sc.nextInt();
		System.out.println("Digite o preço do Produto: ");
		double precoProd = sc.nextDouble();

		Produto Product = new Produto(idProd, nomeProd, quantProd, precoProd);

		// Pedido
		System.out.println("Digite o nome do id: ");
		int idPed = sc.nextInt();
		System.out.println("Digite o id do produto: ");
		int idProdBusca = sc.nextInt();
		if(idProdBusca == idProd){
			idProdBusca = idProd;
		}
		Date DataPed = new Date();

		Pedido Pedido = new Pedido(idProdBusca, Product.getQuantidade(), Product.getPreco(), idPed, DataPed);

		System.out.println(Pedido);

		// Pagamento
		System.out.println("Digite o telefone: ");
		int telefone = sc.nextInt();

		Telefone Telefone = new Telefone(telefone);
		System.out.println("Escolha o método de pagamento(1 - PIX, 2 - BOLETO, 3 - CARTÃO): ");
		int escolha = sc.nextInt();

		MetodosPagamento metodoEscolhido;

		switch (escolha) {
			case 1:
				metodoEscolhido = MetodosPagamento.PIX;
				break;
			case 2:
				metodoEscolhido = MetodosPagamento.DINHEIRO;
				break;
			case 3:
				metodoEscolhido = MetodosPagamento.CARTAO;
				break;
			default:
				throw new IllegalArgumentException("Opção de pagamento inválida");
				
		}
		Pagamento pagamento = new Pagamento();
		pagamento.realizarPagamento(metodoEscolhido);

		System.out.println(cliente.toString());
		System.out.println(Product.toString());
		System.out.println(Pedido.toString());
		System.out.println(Telefone.toString());
		sc.close();
	}
}