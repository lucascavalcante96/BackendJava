package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior deles:
public class ex05 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double numero1, numero2, numero3;
        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        numero3 = sc.nextDouble();
        if (numero1 > numero2 && numero1 >numero3) {
            System.out.println("O maior numero foi: " + numero1);
        }
        else if (numero2 > numero1 && numero2 > numero3) {
            System.out.println("O maior numero foi: " + numero2);
        }
        else{
            System.out.println("O maior numero foi: " + numero3);
        }
    }
}
