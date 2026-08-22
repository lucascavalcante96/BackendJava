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

OBS: Acrescentei um desafio a mais no exercicio, onde ele entrevista X pessoas e coloca na lista, foi criado uma classe
Suspeito para armazenar os dados e decidir o grau no assassinato
 */
public class ex003 {
    static void main() {
        String nome;
        char telefonou,esteveNoLocal, moraPerto, devia, jaTrabalhou;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos suspeitos serão entrevistados: ");
        int qtdSuspeitos = sc.nextInt();

        List<Suspeito> suspeitos = new ArrayList<>();

        for (int i = 0; i < qtdSuspeitos; i++) {
            sc.nextLine();

            System.out.print("Digite o nome do suspeito " + (i + 1) + ":");
            nome = sc.nextLine();

            System.out.println("Responda o questionário abaixo com S para SIM ou N para Não");

            telefonou = lerResposta(sc, "Telefonou para a vitima? [S/N]");
            esteveNoLocal = lerResposta(sc,"Esteve no local do crime? [S/N]");
            moraPerto = lerResposta(sc,"Mora perto da vítima?  [S/N]");
            devia = lerResposta(sc,"Devia para a vítima? [S/N]");
            jaTrabalhou = lerResposta(sc,"Já trabalhou com a vítima?  [S/N]");

            Suspeito suspeito = new Suspeito(nome, telefonou, esteveNoLocal, moraPerto, devia, jaTrabalhou);

            suspeitos.add(suspeito);
        }

        for (Suspeito suspeito : suspeitos) {
            System.out.println(suspeito);
        }
        sc.close();
    }
    private static char lerResposta(Scanner sc, String pergunta) {
        System.out.print(pergunta);
        char resposta = sc.next().charAt(0);
        while (Character.toLowerCase(resposta) != 's' && Character.toLowerCase(resposta) != 'n'){
            System.out.print("Digite S ou N");
            resposta = sc.next().charAt(0);
        }
        return resposta;
    }
}
