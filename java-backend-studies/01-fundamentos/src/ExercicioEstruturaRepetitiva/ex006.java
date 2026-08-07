package ExercicioEstruturaRepetitiva;

import java.util.Scanner;

// Faça um programa que leia 5 números e informe o maior número.
public class ex006 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        double maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int numero = sc.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número digitado foi: " + maior);
    }
}
