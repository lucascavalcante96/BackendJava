package exerciciosPoo.Listas;

import exerciciosPoo.Listas.Entities.Suspeito;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Utilizando listas faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:

"Telefonou para a vítima?"
"Esteve no local do crime?"
"Mora perto da vítima?"
"Devia para a vítima?"
"Já trabalhou com a vítima?"
O programa deve no final emitir uma classificação sobre a participação da pessoa no crime.
Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e
5 como "Assassino". Caso contrário, ele será classificado como "Inocente".
 */
public class ex003 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos suspeitos serão entrevistados: ");
        int qtdSuspeitos = sc.nextInt();

        List<Suspeito> suspeitos = new ArrayList<>();

        for (int i = 0; i < qtdSuspeitos; i++) {
            System.out.println("Digite o nome do suspeito " + (i + 1) + ":");
            String nome = sc.nextLine();
            System.out.println("Responda o questionário abaixo com S para SIM ou N para Não");
            System.out.print("Telefonou para a vitima? [S/N]");
            char telefonou = sc.next().charAt(0);
            System.out.print("Esteve no local do crime? [S/N]");
            char esteveNoLocal =sc.next().charAt(0);
            System.out.print("Mora perto da vítima?  [S/N]");
            char moraPerto =sc.next().charAt(0);
            System.out.print("Devia para a vítima? [S/N]");
            char devia =sc.next().charAt(0);
            System.out.print("Já trabalhou com a vítima?  [S/N]");
            char jaTrabalhou =sc.next().charAt(0);

        }

        sc.close();

    }
}
