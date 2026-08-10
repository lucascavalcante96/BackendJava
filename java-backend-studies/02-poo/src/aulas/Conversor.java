package aulas;

import Entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Conversor {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        double amount = sc.nextDouble();

        double dollars = CurrencyConverter.convert(price, amount);
        System.out.printf("Amount to be paid in reais = %.2f", dollars);

        sc.close();

    }
}
