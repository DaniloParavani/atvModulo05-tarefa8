package Exercicio04;

public class Main {
    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Carlos", 5000);
        Funcionario desenvolvedor = new Desenvolvedor("Ana", 3000);

        gerente.trabalhar();
        desenvolvedor.trabalhar();
    }
}
