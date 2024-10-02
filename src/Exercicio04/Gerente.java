package Exercicio04;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20;
    }

    @Override
    public void trabalhar() {
        System.out.println(nome + " está gerenciando a equipe e tomando decisões estratégicas.");
    }
}

