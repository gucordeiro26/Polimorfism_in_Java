package exer5.v1;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        Calabresa calabresa = new Calabresa();
        Napolitano napolitano = new Napolitano();

        forno.fabricar(calabresa);
        forno.fabricar(napolitano);
    }
}
