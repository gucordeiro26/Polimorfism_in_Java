package exer6;

public class Napolitano implements Pizza{

    @Override
    public void preparar() {
        System.out.println("Molho, presunto, queijo, tomate, orégano");
    }

    @Override
    public void assar() {
        System.out.println("19 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$18,00");
    }

    @Override
    public void bordaRecheada() {
        System.out.println("Não tem borda recheada");
    }
}
