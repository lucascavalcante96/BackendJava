/*João, um pescador, comprou um microcomputador para controlar
    o rendimento diário de seu trabalho. Toda vez que ele traz um
    peso de peixes maior que o estabelecido pelo regulamento de
    pesca do estado de São Paulo (50 quilos) deve pagar uma multa
    de R$ 4,00 por quilo excedente. João precisa que você faça um
    programa que leia a variável peso (peso de peixes) e calcule
    o excesso. Gravar na variável excesso a quantidade de quilos
    além do limite e na variável multa o valor da multa que João
    deverá pagar. Imprima os dados do programa com as mensagens adequadas.*/
package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex12 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double peso;
        double excedente;

        System.out.println("Digite o peso: ");
        peso = sc.nextDouble();

        excedente = peso - 50;

        double multa = excedente * 4.0;

        System.out.println("Você pescou: " + peso + "Kg's");
        System.out.printf("O excedente foi de: %.2f%n", excedente);
        System.out.printf("O multa foi de: %.2f%n", multa);
    }

}
