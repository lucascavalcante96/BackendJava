package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex11 {
    /*Tendo como dados de entrada um arquivo em Gigabytes, construa um algoritmo que faça a conversão para Megabytes*/
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos Gigabytes tem o arquivo: ");
        double gigabytes = sc.nextDouble();
        double megabytes = gigabytes * 1024;

        System.out.printf("%.2f Gigabytes convertidos para Megabytes são: %.2f", gigabytes, megabytes);
    }
}
