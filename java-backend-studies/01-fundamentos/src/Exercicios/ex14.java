/*Faça um programa para uma loja de tintas. O programa deverá pedir o tamanho
 em metros quadrados da área a ser pintada. Considere que a cobertura da tinta
 é de 1 litro para cada 3 metros quadrados e que a tinta é vendida em latas de 18
 litros, que custam R$ 80,00. Informe ao usuário a quantidades de latas de tinta a
 serem compradas e o preço total.*/

package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex14 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantos metros tem a area a ser pintada: ");
        double area = sc.nextDouble();

        double latas =  area / (18 * 3);
        int latasArredondadas = (int) Math.ceil(latas);

        double valor = latasArredondadas * 80.0;
        System.out.printf("Serão necessárias %d latas para pintar %.1f metros. %n",latasArredondadas, area);
        System.out.println("O valor fica: R$ " + valor);

    }
}
