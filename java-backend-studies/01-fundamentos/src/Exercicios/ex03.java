package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex03 {
    static void main() {
        // Faça um programa que peça as 4 notas bimestrais e mostre a média.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double nota1, nota2, nota3, nota4, media;

        System.out.println("Digite a primeira nota: ");
        nota1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.println("Digite a terceira nota: ");
        nota3 = sc.nextDouble();
        System.out.println("Digite a quarta nota: ");
        nota4 = sc.nextDouble();
        media = (nota1 + nota2 + nota3 + nota4) / 4;
        System.out.println("Suas notas foram: [" + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + "] e sua média foi: " + media);
    }
}
