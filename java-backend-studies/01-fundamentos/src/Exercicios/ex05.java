package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex05 {
    static void main() {
        //Faça um programa que peça o raio de um círculo, calcule e mostre sua área
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double pi = 3.14;
        double area;
        double raio;
        System.out.println("Digite o raio do circulo: ");
        raio = sc.nextDouble();
        area = pi * Math.pow(raio, 2);
        System.out.println("A area do  circulo é: " + area);
    }
}
