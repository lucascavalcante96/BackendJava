package exerciciosPoo.Listas.Entities;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;

    public Funcionario(int id, String nome,  double salario) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public double aumentoSalario(double porcentagem){
        return salario += (salario * (porcentagem / 100));
    }

    @Override
    public String toString() {
        return id + ", Nome: " + nome + " Salario: " + String.format("%.2f",salario);
    }
}
