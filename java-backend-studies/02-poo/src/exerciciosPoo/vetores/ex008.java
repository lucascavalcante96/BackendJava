package exerciciosPoo.vetores;

import java.util.Scanner;

/*
Faça um Programa que leia um vetor A com 10 números inteiros, calcule e mostre a soma dos quadrados dos elementos do vetor.
 */
public class ex008 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %d numero: ", i + 1);
            numeros[i] = sc.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            int multiplicacao = numeros[i] * numeros[i];
            soma += multiplicacao;
        }
        System.out.println("A soma da multiplicação dos números digitados é: " + soma);
    }
}
