package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class EstruturaRepetitivaDoWhile {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        char continuar;

        do {
            System.out.println("Digite a temperatura em Celsius: ");
            double temperatura = sc.nextDouble();
            double farenheit = (temperatura * 9 / 5) + 32;
            System.out.println("Temperatura em Farenheit: " + farenheit);
            System.out.println("Deseja continuar? [S/N]");
            continuar = sc.next().charAt(0);

        } while (continuar == 's' || continuar == 'S');
    }
}
