package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex06 {
    static void main() {
        //Faça um programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro lado do quadrado: ");
        double lado1 = sc.nextDouble();
        System.out.println("Digite o segundo lado do quadrado: ");
        double lado2 = sc.nextDouble();
        double area = lado1 * lado2;
        double areaAoQuadrado = area *2;
        System.out.println("o dobro da area do quadrado fornecido é de: " + areaAoQuadrado);
    }
}
