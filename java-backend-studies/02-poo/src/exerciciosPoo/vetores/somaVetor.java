package exerciciosPoo.vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
 */
public class somaVetor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros você vai digitar? ");
        int qtd = sc.nextInt();

        double[] vetor = new double[qtd];
        for(int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
        }
        System.out.print("VALORES = ");
        for(int j = 0; j < vetor.length; j++) {
            System.out.print(vetor[j] + " ");
        }
        System.out.println();
        double soma = 0.0;
        for(int i = 0; i < vetor.length; i++) {
            soma += vetor[i];
        }
        System.out.printf("SOMA = %.2f%n", soma);

        double media = soma / vetor.length;
        System.out.printf("MEDIA = %.2f%n", media);
        sc.close();
    }
}
