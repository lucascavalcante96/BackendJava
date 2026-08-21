package ExercicioEstruturaRepetitiva;
/*
Faça um programa que mostre todos os números impares entre 1 e N sendo N um número inteiro fornecido pelo usuário.
 */

import java.util.Scanner;

public class ex011 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        for (int i = 1; i <= numero; i++) {
            if (i % 2 == 1){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
