package exer8;

public class Pedido {
    public void realizarEntrega(TipoEntrega entrega, String endereco){
        entrega.entregar(endereco);
    }
}
