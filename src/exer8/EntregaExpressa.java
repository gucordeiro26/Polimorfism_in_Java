package exer8;

public class EntregaExpressa implements TipoEntrega{

    @Override
    public void entregar(String endereco) {
        System.out.println("Entrega expressa para o endereço (" + endereco + ") tem um prazo de 3 dias para chegar!");
    }

}
