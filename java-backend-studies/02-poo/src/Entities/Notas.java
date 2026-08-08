package Entities;

public class Notas {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;

    public double notaFinal(){
        return nota1 + nota2 + nota3;
    }
    public void aprovado(){
        double nota = notaFinal();
        if (nota < 60){
            System.out.println("FAILED");
            double diferenca = 60 - nota;
            System.out.printf("MISSING %.2f POINTS%n", diferenca);
        } else {
            System.out.println("PASSED");
        }
    }
}
