package Exercicios;

import java.util.Scanner;

public class ex02 {
    static void main() {
        //Faça um programa que peça dois números e imprima a soma:
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextDouble();

        double soma = numero1 + numero2;
        System.out.println("A soma entre " + numero1 + " e " + numero2 + " = " + soma);

    }
}
