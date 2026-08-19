package exerciciosPoo.vetores.entities;

public class Aluno {
    private int idade;
    private double altura;

    public Aluno(int idade, double altura) {
        this.idade = idade;
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "idade " + idade + ", Altura" + altura;
    }
}
