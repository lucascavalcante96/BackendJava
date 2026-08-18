package exerciciosPoo.vetores;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
 */
public class Ex002 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vector =  new int[10];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }
        System.out.println("Vetor Original: ");
        for (int v : vector) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("O vetor na ordem inversa digitada: ");
        for (int i = vector.length -1; i >=0; i--) {
            System.out.print(vector[i] + " ");
        }
        sc.close();
    }
}
