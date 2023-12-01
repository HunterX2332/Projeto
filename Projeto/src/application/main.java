package application;

import java.util.Scanner;
import java.util.Locale;

import entities.Cliente;
import entities.Produto;
import entities.Endereco;
import entities.Pedido;
import entities.ItemPedido;
import entities.Pagamento;
import entities.Telefone;
import enums.MetodosPagamento;

/* Sistema de Compra de produtos */

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Cliente
		System.out.println("Digite seu nome: ");
		String Nome = sc.nextLine();
		System.out.println("Digite seu email: ");
		String Email = sc.nextLine();

		Cliente cliente = new Cliente(Nome, Email);

		// Produto
		System.out.println("Digite o nome do produto: ");
		String produto = sc.nextLine();
		System.out.println("Digite seu ID: ");
		int Id = sc.nextInt();
		System.out.println("Digite a quantidade: "); // Consumir a quebra de linha pendente
		int Quantidade = sc.nextInt();
		System.out.println("Digite o preço: ");
		double Preco = sc.nextDouble();

		Produto Product = new Produto(Id, produto, Quantidade, Preco);

		// Endereço
		System.out.println("Digite sua rua: ");
		sc.next();
		String rua = sc.nextLine();
		System.out.println("Digite o numero: ");
		int numerocomp = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o complemento: ");
		String complemento = sc.nextLine();
		System.out.println("Digite o bairro: ");
		String bairro = sc.nextLine();

		Endereco Endereco = new Endereco(rua, numerocomp, complemento, bairro);

		// Item Pedido
		System.out.println("Digite o Codigo: ");
		int codigo = sc.nextInt();
		System.out.println("Digite o item: ");
		sc.next();
		String Item = sc.nextLine();
		Produto item = new Produto(Item);
		System.out.println("Digite a quantidade pedida: ");
		int quantidadePedida = sc.nextInt();

		ItemPedido ItemPedido = new ItemPedido(codigo, item, quantidadePedida);

		// Pedido
		System.out.println("Digite o nome do vendedor: ");
		sc.next();
		String vendedor = sc.nextLine();
		System.out.println("Digite o status: ");
		boolean status = sc.nextBoolean();
		System.out.println("Digite as observações: ");
		sc.next();
		String observacao = sc.nextLine();

		Pedido Pedido = new Pedido(vendedor, status, observacao);

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
				metodoEscolhido = MetodosPagamento.BOLETO;
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
		System.out.println(Endereco.toString());
		System.out.println(ItemPedido.toString());
		System.out.println(Pedido.toString());
		System.out.println(Telefone.toString());
		sc.close();
	}
}