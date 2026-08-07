package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/*
Altere o programa anterior permitindo ao usuário informar as populações e as taxas de crescimento iniciais.
 Valide a entrada e permita repetir a operação.

 Exercicio anterior:
 Supondo que a população de um país A seja da ordem de 80_000 habitantes com uma taxa anual de crescimento de 3%
 e que a população de B seja 200_000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule
 e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B,
 mantidas as taxas de crescimento.
 */
public class ex005 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double paisA, paisB, taxaCrecimentoA, taxaCrecimentoB;
        System.out.println("Digite a população do primeiro país: ");
        paisA = sc.nextDouble();
        System.out.println("Digite a taxa de crescimento desse país: ");
        taxaCrecimentoA = sc.nextDouble();
        System.out.println("Digite a população do segundo país: ");
        paisB = sc.nextDouble();
        System.out.println("Digite a taxa de crescimento do segundo país:");
        taxaCrecimentoB = sc.nextDouble();
        int count = 0;

        while (paisA <= paisB) {
            paisA = paisA * (taxaCrecimentoA / 100 + 1);
            paisB = paisB * (taxaCrecimentoB / 100 + 1);
            count ++;
        }
        System.out.printf("Após %d anos o pais A ultrapassou o Pais B%n", count);
        System.out.printf("Ao final desses %d anos a população final foi de: Pais A = %.3f e do Pais B foi de: %.3f %n", count, paisA, paisB);
    }
}
