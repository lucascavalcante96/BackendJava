package Aulas;

import java.util.Scanner;

public class EstruturaRepetitivaFor {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos numeros deseja somar: ");
        int qtd = sc.nextInt();
        int soma = 0;
        for (int i = 1; i <= qtd; i++) {
            System.out.println("Digite o " + i + " numero: ");
            int numero = sc.nextInt();
            soma += numero;
        }
        System.out.println("O maior numero foi: " + soma);
    }
}
