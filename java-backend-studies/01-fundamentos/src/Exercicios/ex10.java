package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex10 {
    /*Faça um programa que peça 2 números inteiros e um número real. Calcule e mostre:
        O produto do dobro do primeiro com metade do segundo .
        A soma do triplo do primeiro com o terceiro.
        O terceiro elevado ao cubo.*/
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        double numero3;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();
        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextDouble();

        double resultado1 = ((double) numero1 * 2) + ((double)numero2 / 2);
        double resultado2 = ((double) numero1 * 3 ) + numero3;
        double resultado3 = Math.pow(numero3, 3);

        System.out.printf("O produto do dobro do primeiro com metade do segundo %.2f %n", resultado1);
        System.out.printf("A soma do triplo do primeiro com o terceiro %.2f %n", resultado2);
        System.out.printf("O terceiro elevado ao cubo %.2f %n", resultado3);
    }
}
