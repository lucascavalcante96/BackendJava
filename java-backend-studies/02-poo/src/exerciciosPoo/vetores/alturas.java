package exerciciosPoo.vetores;

import exerciciosPoo.vetores.entities.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class alturas {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        Pessoa[] p = new Pessoa[n];
        for (int i = 0; i < p.length; i++) {
            System.out.printf("Dados da %da pessoa%n",i+1);
            sc.nextLine();
            System.out.print("Nome: ");
            String nome = sc.nextLine();

            System.out.print("Idade:");
            int idade = sc.nextInt();

            System.out.print("Altura:");
            sc.nextLine();
            double altura = sc.nextDouble();
            p[i] = new Pessoa(nome, idade, altura);

        }

        // ALTURA MEDIA DAS PESSOAS
        double soma = 0.0;
        for (int i = 0; i < p.length; i++) {
            soma += p[i].getAltura();
        }

        double mediaAltura = soma / p.length;
        System.out.printf("A media de altura é: %.2f%n", mediaAltura);

        int contador = 0;
        for (int i = 0; i < p.length; i++) {
            if(p[i].getIdade() <16){
                contador+=1;
            }
        }


        double porcentagemMenoresDe16 = ((double) contador / p.length) * 100;
        System.out.printf("Pessoas com menos de 16 anos: %.1f %% %n",porcentagemMenoresDe16);
        System.out.println("Nome das pessoas com menos de 16 anos: ");
        for (int i = 0; i < p.length; i++) {
            if(p[i].getIdade() <16){
                System.out.println(p[i].getNome());
            }
        }

        sc.close();
    }
}
