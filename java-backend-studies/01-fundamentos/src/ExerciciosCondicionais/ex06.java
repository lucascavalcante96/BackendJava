package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia três números e mostre o maior e o menor deles
public class ex06 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double num1, num2, num3, maior, menor;
        System.out.println("Digite o primeiro numero: ");
        num1 = sc.nextDouble();
        System.out.println("Digite o segundo numero: ");
        num2 = sc.nextDouble();
        System.out.println("Digite o terceiro numero: ");
        num3 = sc.nextDouble();
        if (num1 > num2 && num1 > num3) {
            maior = num1;
        }
        else if (num2 > num3) {
            maior = num2;
        } else  {
            maior = num3;
        }

        System.out.println("O maior numero foi: " + maior);
        sc.close();
    }
}
