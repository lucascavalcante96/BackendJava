package exerciciosPoo.vetores;
/*
Faça um programa que peça a idade e a altura de 5 pessoas, armazene cada informação no seu respectivo vetor.
Imprima a idade e a altura na ordem inversa a ordem lida.
 */

import java.util.Locale;
import java.util.Scanner;

public class ex007 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] idade = new int[2];
        double[] altura =  new double[2];

        // LENDO OS DADOS E COLOCANDO NOS RESPECTIVOS VETORES
        for (int i = 0; i < idade.length; i++){
            System.out.printf("Digite a idade da %d pessoa: ", i + 1);
            idade[i] = sc.nextInt();
            System.out.printf("Digite a altura da %d pessoa: ", i + 1);
            altura[i] = sc.nextDouble();
        }
        // IMPRIMINDO A IDADE NA ORDEM INVERSA DIGITADA
        System.out.print("Idade na ordem inversa digitada: ");
        for (int i = idade.length -1; i >=0 ; i--){
            System.out.print(idade[i] + " ");
        }
        System.out.println();
        //IMPRIMINDO A ALTURA NA ORDEM INVERSA DIGITADA
        System.out.print("Altura na ordem inversa digitada: ");
        for(int i = altura.length -1; i >=0 ; i--){
            System.out.print(altura[i] + " ");
        }

        sc.close();
    }
}
