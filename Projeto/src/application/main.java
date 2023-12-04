package application;

import java.util.Scanner;
import java.util.Date;
import java.util.Locale;

import entities.Cliente;
import entities.Produto;
import entities.Pedido;
import entities.Pagamento;
import entities.Telefone;
import enums.MetodosPagamento;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int escolha;

        do {
            exibirMenu();
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    realizarCompra(sc);
                    break;
                case 2:
                    // Adicione outras opções conforme necessário
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != 0);

        sc.close();
    }

    private static void exibirMenu() {
        System.out.println("===== MENU =====");
        System.out.println("1. Realizar Compra");
        System.out.println("2. Outra opção");
        System.out.println("0. Sair");
        System.out.println("================");
        System.out.println("Escolha a opção desejada: ");
    }

    private static void realizarCompra(Scanner sc) {
    // Cliente
    System.out.println("Digite id do Cliente: ");
    Integer idCliente = sc.nextInt();
    System.out.println("Digite seu nome do Cliente: ");
    String nome = sc.next(); // Use next() em vez de nextLine() para evitar problemas com quebras de linha
    System.out.println("Digite seu email do Cliente: ");
    String email = sc.next();

    Cliente cliente = new Cliente(idCliente, nome, email);

    // Produto
    System.out.println("Digite o ID do Produto: ");
    int idProd = sc.nextInt();
    System.out.println("Digite o nome do produto: ");
    String nomeProd = sc.next();
    System.out.println("Digite a quantidade do Produto: ");
    int quantProd = sc.nextInt();
    System.out.println("Digite o preço do Produto: ");
    double precoProd = sc.nextDouble();

    Produto product = new Produto(idProd, nomeProd, quantProd, precoProd);

    // Pedido
    System.out.println("Digite o nome do id: ");
    int idPed = sc.nextInt();
    Date dataPed = new Date(); // Renomeei para seguir convenções de nomenclatura

    Pedido pedido = new Pedido(idProd, product.getQuantidade(), product.getPreco(), idPed, dataPed);

    System.out.println(pedido);

    // Pagamento
    System.out.println("Digite o telefone: ");
    int telefone = sc.nextInt();

    Telefone tel = new Telefone(telefone);
    System.out.println("Escolha o método de pagamento (1 - PIX, 2 - BOLETO, 3 - CARTÃO): ");
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
    System.out.println(product.toString());
    System.out.println(pedido.toString());
    System.out.println(tel.toString());
}
