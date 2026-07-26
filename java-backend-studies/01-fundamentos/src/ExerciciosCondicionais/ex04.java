package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa para a leitura de duas notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e apresentar:

A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
A mensagem "Reprovado", se a média for menor do que sete;
A mensagem "Aprovado com Distinção", se a média for igual a dez.
 */
public class ex04 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, media;
        System.out.println("Digite sua primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite sua segunda nota: ");
        nota2 = sc.nextDouble();
        media = (nota1 + nota2) / 2;
        if (media >= 7 && media < 10) {
            System.out.println("Aprovado");
        } else if ( media < 7) {
            System.out.println("Reprovado");
        }
        else  {
            System.out.println("Aprovado com Distinção");
        }
        sc.close();
    }
}
