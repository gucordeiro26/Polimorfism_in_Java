package exer7;

public class Programa {
    public static void main(String[] args) {
        Venda venda = new Venda();
        double valorCompra = 100.00;

        System.out.println("Com um pagamento de R$" + valorCompra + " as taxas são:");

        venda.vender(new Dinheiro(), valorCompra);
        venda.vender(new CartaoCredito(), valorCompra);
        venda.vender(new Boleto(), valorCompra);
    }
}
