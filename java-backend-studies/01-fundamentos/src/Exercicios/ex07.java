package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex07 {
    /*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
     Calcule e mostre o total do seu salário no referido mês.
     */
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Quanto que você ganha por hora? ");
        double salarioHora = sc.nextDouble();
        System.out.println("Quantas horas você trabalha por mês? ");
        double horasTrabalhadas = sc.nextDouble();

        double salario = salarioHora * horasTrabalhadas;

        System.out.println("Seu salario é de: " + salario);
    }
}
