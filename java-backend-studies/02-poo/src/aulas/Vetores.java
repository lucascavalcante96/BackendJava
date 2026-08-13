package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de pessoas: ");
        int n  = sc.nextInt();

        double[] pessoas = new double[n];

        for(int i=0;i<n;i++) {
            System.out.println("Digite a altura: ");
            pessoas[i] = sc.nextDouble();
        }

        double soma = 0;
        for(int i=0;i<n;i++) {
            soma += pessoas[i];
        }

        double media = soma / n;

        System.out.printf("Média de altura: %.2f", media);
        sc.close();
    }
}
