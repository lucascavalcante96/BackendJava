package aulas;

import Entities.Product2;

import java.util.Locale;
import java.util.Scanner;

public class Vetores2 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos produtos deseja inserir: ");
        int n = sc.nextInt();

        Product2[] vect = new Product2[n];
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.println("Nome do produto: ");
            String nome = sc.nextLine();
            System.out.println("Preco do produto: ");
            double preco = sc.nextDouble();

            vect[i] = new Product2(nome, preco);
        }

        double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        double media = soma / vect.length;
        System.out.printf("MEDIA = %.2f", media);
        sc.close();
    }
}
