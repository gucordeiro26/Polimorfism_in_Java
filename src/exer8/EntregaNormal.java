package exer8;

public class EntregaNormal implements TipoEntrega{

    @Override
    public void entregar(String endereco) {
        System.out.println("Entrega normal para o endereço (" + endereco + ") tem um prazo de 7 dias para chegar!");
    }

}
