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
        while (true) {
            if (opcao == 1) {
                System.out.println("Esse número equivale a Domingo");
                break;
            }
            else if (opcao == 2) {
                System.out.println("Esse número equivale a Segunda-feira");
                break;
            }
            else if (opcao == 3) {
                System.out.println("Esse número equivale a Terça-feira");
                break;
            }
            else if (opcao == 4) {
                System.out.println("Esse número equivale a Quarta-feira");
                break;
            }
            else if (opcao == 5) {
                System.out.println("Esse número equivale a Quinta-feira");
                break;
            }
            else if (opcao == 6) {
                System.out.println("Esse número equivale a Sexta-feira");
                break;
            }
            else if (opcao == 7) {
                System.out.println("Esse número equivale a Sábado");
                break;
            }
            else {
                System.out.println("Opção invalida");
                System.out.println("Digite novamente: ");
                opcao = sc.nextInt();
            }
        }

        sc.close();
    }
}
