package exer6;

public class Calabresa implements Pizza{

    @Override
    public void preparar() {
        System.out.println("Molho, queijo, calabresa, cebola e tomate");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$12,00");
    }

    @Override
    public void bordaRecheada() {
        System.out.println("Borda de Catupiry");
    }
}
