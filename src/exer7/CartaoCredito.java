package exer7;

public class CartaoCredito implements TipoPagamento{

    @Override
    public void pagar(double valor) {
        double taxa = valor * .2;
        System.out.println("Pagamento em Cartão de Crédito. Valor da taxa é R$" + taxa);
    }
}
