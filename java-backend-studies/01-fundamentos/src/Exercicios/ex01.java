package Exercicios;

import java.util.Scanner;

public class ex01 {
    static void main() {
        // Faça um programa que peça um número e então mostre a mensagem "O número informado foi [número]"

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();
        sc.close();
        System.out.println("O número informado foi: " + numero);
    }
}
