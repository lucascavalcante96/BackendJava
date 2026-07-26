package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que peça dois números e imprima o maior deles
public class ex01 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero1, numero2;
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextDouble();

        if (numero1 > numero2) {
            System.out.printf("O maior numero é %.1f", numero1);
        }
        else {
            System.out.printf("O maior numero é %.1f", numero2);
        }
    }
}
