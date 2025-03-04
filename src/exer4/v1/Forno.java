package exer4.v1;

public class Forno {
    public void fabricar(PizzaCalabresa calabresa){
        calabresa.preparar();
        calabresa.assar();
        calabresa.cobrar();
    }

    public void fabricar(PizzaNapolitano napolitano){
        napolitano.preparacao();
        napolitano.assamento();
        napolitano.valor();
    }
}
