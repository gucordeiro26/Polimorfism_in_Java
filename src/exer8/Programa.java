package exer8;

public class Programa {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();
        String endereco = "Rua Fictícia 5 de Mentira, 123";

        System.out.println("Opções de entrega ou retirada do produto:\n");

        pedido.realizarEntrega(new EntregaNormal(), endereco);
        pedido.realizarEntrega(new EntregaExpressa(), endereco);
        pedido.realizarEntrega(new RetirarNaLoja(), endereco);
    }
}
