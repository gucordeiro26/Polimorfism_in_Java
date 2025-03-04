package exer1;

public class Exer1 {
    public static void main(String[] args) {

        // Chamada do método normal
        Torcedor torcedor = new Torcedor();
        torcedor.torcer();

        // Chamada do método polimórfico
        torcedor = new Corinthians();
        torcedor.torcer();

        torcedor = new Palmeiras();
        torcedor.torcer();

        torcedor = new Santos();
        torcedor.torcer();

    }
}