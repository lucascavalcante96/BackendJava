package ExerciciosCondicionais;

import java.util.Scanner;

/*
Faça um programa que leia um número e exiba o dia correspondente da semana.
 (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inválido.
 */
public class ex007 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número de 1 a 7: ");

        int opcao = sc.nextInt();
        if (opcao == 1) {
            System.out.println("Esse número equivale a Domingo");
        }
        else if (opcao == 2) {
            System.out.println("Esse número equivale a Segunda-feira");
        }
        else if (opcao == 3) {
            System.out.println("Esse número equivale a Terça-feira");
        }
        else if (opcao == 4) {
            System.out.println("Esse número equivale a Quarta-feira");
        }
        else if (opcao == 5) {
            System.out.println("Esse número equivale a Quinta-feira");
        }
        else if (opcao == 6) {
            System.out.println("Esse número equivale a Sexta-feira");
        }
        else if (opcao == 7) {
            System.out.println("Esse número equivale a Sábado");
        }
        else {
            System.out.println("Opção invalida");
        }
        sc.close();
    }
}
