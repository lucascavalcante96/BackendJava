package exerciciosPoo.vetores;

/*
Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex001 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce vai digitar? ");
        int qtd = sc.nextInt();
        boolean numeroNegativo = false;

        int [] vetor = new int[qtd];
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
            if (vetor[i] < 0){
                numeroNegativo = true;
            }
        }
        if (numeroNegativo == true){
            System.out.println("NUMEROS NEGATIVOS");
        }
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }

        sc.close();
    }
}
