package TP3;

// A classe Produto representa um item no supermercado.
// Cada produto possui três atributos essenciais: nome, preço e quantidade em estoque.
// 1 - nome (String): Representa o nome do produto, essencial para identificar e diferenciar os itens no supermercado.
// 2 - preco (double): Armazena o valor do produto, fundamental para calcular o custo total e registrar os preços corretamente no sistema.
// 3 - quantidadeEmEstoque (int): Indica quantas unidades do produto estão disponíveis, ajudando no controle do estoque e na reposição dos itens.

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEmEstoque;

    // Construtor da classe Produto
    // Este construtor recebe os parâmetros nome, preco e quantidadeEmEstoque para inicializar
    // os atributos do produto no momento da criação do objeto.
    // Usar o construtor facilita a criação de objetos pois centraliza a inicialização dos atributos obrigatórios
    // e evita a necessidade de chamadas separadas aos métodos set.
    // Assim, podemos criar produtos de forma mais concisa e com menos chances de erro ao não inicializar os atributos corretamente.
    public Produto(String nome, double preco, int quantidadeEmEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEmEstoque = quantidadeEmEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidadeEmEstoque() {
        return quantidadeEmEstoque;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void setQuantidadeEmEstoque(int novaQuantidade) {
        this.quantidadeEmEstoque = novaQuantidade;
    }

    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEmEstoque);
    }

    public static void main(String[] args) {
        Produto produto = new Produto("Arroz", 25.50, 100);

        produto.exibirInformacoes();

        produto.setPreco(22.75);
        produto.setQuantidadeEmEstoque(120);
        produto.setNome("Arroz Integral");

        produto.exibirInformacoes();
        System.out.println();

        System.out.println("Nome do Produto: " + produto.getNome());
        System.out.println("Preço do Produto: R$ " + produto.getPreco());
        System.out.println("Quantidade em Estoque: " + produto.getQuantidadeEmEstoque());


    }
}
