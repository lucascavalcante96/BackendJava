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

        for (int j = 1; j <= numero; j++) {
            if (j % 2 == 1){
                System.out.println(j);
            }
        }
        sc.close();
    }
}
