package Exercicio02;

public class MainProduto {
    public static void main(String[] args) {
        Produto produto = new Produto("Smartphone", 1000, 10);

        produto.exibirInformacoes();

        try {
            produto.aplicarDesconto(25);
            produto.exibirInformacoes();

            produto.aplicarDesconto(60);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
