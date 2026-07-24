package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex04 {

    static void main() {
        //Faça um programa que converta metros para centímetros:
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);


        double metros;
        double centimetros;
        System.out.println("Digite quantos metros deseja converter: ");
        metros = input.nextDouble();
        centimetros =  metros * 100;
        System.out.println(metros + " convertidos para centimetros: " + centimetros);
    }
}
