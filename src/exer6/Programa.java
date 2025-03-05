package exer6;

public class Programa {
    public static void main(String[] args) {
        Forno forno = new Forno();

        Calabresa calabresa = new Calabresa();
        Napolitano napolitano = new Napolitano();
        AlhoAndBacon alhoAndBacon = new AlhoAndBacon();

        forno.fabricar(calabresa);
        forno.fabricar(napolitano);
        forno.fabricar(alhoAndBacon);
    }
}
