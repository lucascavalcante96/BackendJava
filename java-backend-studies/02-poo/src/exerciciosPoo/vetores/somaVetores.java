package exerciciosPoo.vetores;

import java.util.Locale;
import java.util.Scanner;

public class somaVetores {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        double[] vetor = new double[n];
        System.out.println("Digite os valores do vetor A: ");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sc.nextDouble();
        }

        System.out.println("Digite os valores do vetor B: ");
        double[] vetor2 = new double[n];
        for (int i = 0; i < vetor2.length; i++) {
            vetor2[i] = sc.nextDouble();
        }

        double[] vetor3 = new double[n];
        for (int i = 0; i < n; i++) {
            double soma = vetor[i] + vetor2[i];
            vetor3[i] = soma;
        }
        System.out.println();
        System.out.println("VETOR RESULTANTE: ");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println(vetor3[i]);
        }

        sc.close();
    }
}
