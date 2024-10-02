package Exercicio04;

public class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularBonus() {
        return 0; // Sem bônus padrão
    }

    public void trabalhar() {
        System.out.println(nome + " está realizando suas atividades de trabalho.");
    }

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: " + salario);
        System.out.println("Bônus: " + calcularBonus());
    }
}

