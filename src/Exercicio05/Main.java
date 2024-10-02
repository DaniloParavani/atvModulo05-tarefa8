package Exercicio05;

public class Main {
    public static void main(String[] args) {

        IMeioTransporte[] meiosDeTransporte = {
                new Carro(),
                new Bicicleta(),
                new Trem()
        };

        for (IMeioTransporte transporte : meiosDeTransporte) {
            transporte.acelerar();
            transporte.frear();
            System.out.println();
        }
    }
}
