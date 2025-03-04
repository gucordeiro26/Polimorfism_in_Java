package exer4.v1;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        PizzaCalabresa calabresa = new PizzaCalabresa();
        forno.fabricar(calabresa);

        PizzaNapolitano napolitano = new PizzaNapolitano();
        forno.fabricar(napolitano);
    }
}
