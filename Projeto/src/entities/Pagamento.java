package entities;
import enums.MetodosPagamento;

public class Pagamento{

    public void realizarPagamento(MetodosPagamento metodo) {
        switch (metodo) {
            case BOLETO:
                pagarBoleto();
                break;
            case PIX:
                pagarPix();
                break;
            case CARTAO:
                pagarCartao();
                break;
            default:
                throw new IllegalArgumentException("Método de pagamento inválido");
        }
    }

    private void pagarBoleto() {
        System.out.println("Pagamento via boleto realizado.");
    }

    private void pagarPix() {
        System.out.println("Pagamento via Pix realizado.");
    }

    private void pagarCartao() {
        System.out.println("Pagamento via cartão realizado.");
    }
    @Override
    public String toString() {
        return "Pagamento via ";
    }
}

