package aulas;

public class Product {
    public String nome;
    public double preco;
    public int quantidade;

    public Product(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    public double valorDoEstoque(){
        return preco*quantidade;
    }
    public void adicionar(int qtde){
        quantidade += qtde;
    }
    public void subtrair(int qtde){
        quantidade -= qtde;
    }
    public String toString(){
        return "Produto: " + nome + ", Preço R$: " + String.format("%.2f", preco) + ", Quantidade " + quantidade + " Valor total: " + String.format("%.2f",valorDoEstoque());
    }
}
