package exerciciosPoo.vetores;

import java.util.Scanner;

/*
Faça um programa que leia dois vetores com 10 elementos cada. Gere um terceiro vetor de 20 elementos,
cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores.
 */
public class ex009 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        int[]numeros = new int[10];
        int[]numeros2 = new int[10];
        int[]vetorFinal = new int[20];
        System.out.println("Adicionando os números ao 1º vetor");
        for(int i = 0; i < numeros.length; i++){
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }
        System.out.println("Adicionando os números ao 2º vetor");
        for(int i = 0; i < numeros2.length; i++){
            System.out.print("Digite um numero: ");
            numeros2[i] = sc.nextInt();
        }

        for(int i = 0; i < vetorFinal.length; i++){
            if (i % 2 == 0){
                vetorFinal[i] = numeros[i /2];

            } else {
                vetorFinal[i] = numeros2[i / 2];

            }
        }

        System.out.println("A junção dos 2 vetores resultou em: ");
        for(int i = 0; i < vetorFinal.length; i++){
            System.out.print(vetorFinal[i] + " ");
        }


        sc.close();
    }

}
