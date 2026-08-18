package exerciciosPoo.vetores;

import java.util.Locale;
import java.util.Scanner;

/*
Faça um programa que leia um vetor de 10 caracteres, e diga quantas consoantes foram lidas. Imprima as consoantes.
 */
public class ex003 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        char[] vector = new char[10];
        for(int i = 0; i < vector.length; i++) {
            System.out.println("Digite um caracter: ");
            vector[i] = sc.next().charAt(0);
        }
        int contador = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 'a' &&  vector[i]!= 'e' && vector[i] != 'i' && vector[i] != 'o' && vector[i] != 'u') {
                contador++;
            }
        }
        System.out.printf("Foram digitadas %d consoantes\n", contador);
        System.out.println("As consoantes foram: ");
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] != 'a' &&  vector[i]!= 'e' && vector[i] != 'i' && vector[i] != 'o' && vector[i] != 'u') {
                System.out.print(vector[i] + " ");
            }
        }
        sc.close();
    }

}
