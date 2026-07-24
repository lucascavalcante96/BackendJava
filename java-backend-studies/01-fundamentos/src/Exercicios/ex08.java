package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex08 {
    /*Faça um programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.*/
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        double celsius = (fahrenheit - 32) * 5 / 9;
        System.out.printf("%.2fº F convertido para temperatura em Celsius é %.2f", fahrenheit, celsius);
    }
}
