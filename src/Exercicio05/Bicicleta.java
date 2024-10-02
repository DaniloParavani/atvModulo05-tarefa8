package Exercicio05;

public class Bicicleta implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("A bicicleta está ganhando velocidade devagar.");
    }

    @Override
    public void frear() {
        System.out.println("A bicicleta está freando com força.");
    }
}
