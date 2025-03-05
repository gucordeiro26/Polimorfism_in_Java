package exer8;

public class RetirarNaLoja implements TipoEntrega{

    @Override
    public void entregar(String endereco) {
        System.out.println("Pedido pronto para ser retirado na loja mais próxima!");
    }

}
