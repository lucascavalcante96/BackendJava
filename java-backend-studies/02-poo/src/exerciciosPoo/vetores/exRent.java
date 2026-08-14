package exerciciosPoo.vetores;

import exerciciosPoo.vetores.entities.Rent;

import java.util.Locale;
import java.util.Scanner;

public class exRent {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos quantos serão Alugados? ");
        int alugueis = sc.nextInt();

        Rent[] quarto = new Rent[10];
        for (int i = 1; i <= alugueis; i++) {
            System.out.println();
            System.out.printf("Aluguel #%d%n", i);
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Número do quarto: ");
            int numero = sc.nextInt();

            quarto[numero] = new Rent(nome, email);
        }
        System.out.println();
        System.out.println("Quartos Ocupados: ");
        for (int j = 0; j < quarto.length ; j++) {
            if(quarto[j] != null) {
                System.out.println(j + ": " + quarto[j]);
            }
        }
        sc.close();
    }
}
