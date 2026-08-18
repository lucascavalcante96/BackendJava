package exerciciosPoo.vetores;

import java.util.Scanner;

/*
Faça um programa que leia um vetor de 5 números inteiros, mostre a soma, a multiplicação e os números.
 */
public class ex006 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[5];

        for (int i= 0; i < numeros.length; i++){
            System.out.printf("Digite o %d numero: ", i+1);
            numeros[i] = sc.nextInt();
        }

        // SOMA DOS NUMEROS DO VETOR

        int soma = 0;
        for (int i = 0; i < numeros.length; i++){
            soma += numeros[i];
        }

        // MULTIPLICACAO DOS NUMEROS DO VETOR
        int multiplicacao = 1;
        for (int j = 0; j < numeros.length; j++){
            multiplicacao *= numeros[j];
        }

        System.out.println("A soma dos números digitados é: " + soma);
        System.out.println("A multiplicação dos números digitados é: " + multiplicacao);
        System.out.print("Os números digitados foram: ");

        for (int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] + " ");
        }
        sc.close();
    }
}
