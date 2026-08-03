package Aulas;

import java.util.Scanner;

public class EstruturaRepetitiva {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: [0 para sair] ");
        int numero = sc.nextInt();
        int soma = 0;

        while ( numero != 0) {
            soma += numero;
            System.out.println("Digite um numero: [0 para sair] ");
            numero = sc.nextInt();

        }
        System.out.println("A soma foi: " + soma);
    }
}
