package exerciciosPoo.vetores;

/*
Faça um programa que peça as quatro notas de 10 alunos, calcule e armazene
 num vetor a média de cada aluno, imprima o número de alunos com média maior ou igual a 7.0.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double[]notas = new double[10];
        for (int i = 0; i < notas.length; i++) {
            double nota1, nota2, nota3, nota4;
            System.out.printf("Digite a nota do %d° aluno %n", (i+1));

            System.out.print("Digite a primeira nota: ");
            nota1 = sc.nextDouble();

            System.out.print("Digite a segunda nota: ");
            nota2 = sc.nextDouble();

            System.out.print("Digite a terceira nota: ");
            nota3 = sc.nextDouble();

            System.out.print("Digite a quarta nota: ");
            nota4 = sc.nextDouble();

            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            notas[i] = media;
            System.out.println();
        }

        int contador = 0;
        System.out.println();
        for(int i = 0; i < notas.length; i++) {
            if(notas[i] >= 7.0) {
                System.out.println(notas[i]);
                contador++;
            }
        }
        System.out.println();
        System.out.println("Total de alunos com media maior ou igual a 7.0: " + contador);

        sc.close();
    }
}
