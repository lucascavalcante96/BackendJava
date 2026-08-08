package exerciciosPoo;

import Entities.Notas;

import java.util.Locale;
import java.util.Scanner;

public class Aluno {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Notas notas = new Notas();
        System.out.println("Digite o nome do aluno: ");
        notas.name = sc.nextLine();
        System.out.println("Digite a primeira nota do aluno: ");
        notas.nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        notas.nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota do aluno: ");
        notas.nota3 = sc.nextDouble();

        System.out.printf("Nota Final: %.2f%n", notas.notaFinal());
        notas.aprovado();
        sc.close();
    }
}
