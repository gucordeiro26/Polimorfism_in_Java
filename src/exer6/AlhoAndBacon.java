package exer6;

public class AlhoAndBacon implements Pizza{

    @Override
    public void preparar() {
        System.out.println("Bacon, alho, mussarela, azeitona e orégano");
    }

    @Override
    public void assar() {
        System.out.println("20 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$20,00");
    }

    @Override
    public void bordaRecheada() {
        System.out.println("Borda de Mussarela");
    }
}
