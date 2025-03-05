package exer7;

public class Venda {
    public void vender(TipoPagamento pago, double valor){
        pago.pagar(valor);
    }
}
