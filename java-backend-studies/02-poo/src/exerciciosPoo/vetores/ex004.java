package exerciciosPoo.vetores;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia 20 números inteiros e armazene-os num vetor. Armazene os números pares no
vetor PAR e os números IMPARES no vetor impar. Imprima os três vetores.
 */
public class ex004 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[]vector = new int[20];
        for (int i = 0; i < vector.length; i++) {
            System.out.print("Digite um número: ");
            vector[i] = sc.nextInt();
        }
        int contadorPar = 0;
        int contadorImpar = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2==0){
                contadorPar ++;
            } else {
                contadorImpar ++;
            }
        }
        int[]vetorPar = new int[contadorPar];
        int[]vetorImpar = new int[contadorImpar];
        int contImpar = 0;
        int contPar = 0;
        for (int i = 0; i < vector.length; i++) {
            if(vector[i]%2==0){
                vetorPar[contPar] = vector[i];
                contPar++;
                }
            else {
                vetorImpar[contImpar] = vector[i];
                contImpar++;
            }
            }
        System.out.println("Vetor Original: ");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
        System.out.println("Vetor Impar: ");
        for (int v : vetorImpar) {
            System.out.print(v + " ");
        }
        System.out.println();
        System.out.println("Vetor Par: ");
        for (int v : vetorPar) {
            System.out.print(v + " ");
        }
        sc.close();
        }
}


