package Exercicio05;

public class Trem implements IMeioTransporte {
    @Override
    public void acelerar() {
        System.out.println("O trem está acelerando gradualmente.");
    }

    @Override
    public void frear() {
        System.out.println("O trem está freando lentamente.");
    }
}

