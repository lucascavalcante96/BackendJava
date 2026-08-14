package exerciciosPoo.vetores;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
tela todos os números pares, e também a quantidade de números pares.

 */
public class numerosPares {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int qtd = sc.nextInt();

        double[] vetor = new double[qtd];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }

        int contador = 0;
        System.out.println("NUMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                contador++;
                System.out.printf("%.0f ", vetor[i]);
            }
        }
        System.out.println();
        System.out.println("QUANTIDADE DE PARES = " + contador);
        sc.close();
    }
}
