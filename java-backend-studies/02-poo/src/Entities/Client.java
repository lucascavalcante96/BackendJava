package Entities;

import exerciciosPoo.Account;

import java.util.Locale;
import java.util.Scanner;

public class Client {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter account holder: ");
        sc.nextLine();
        String name = sc.nextLine();

        System.out.println("Is there a initial deposit (y/n)?: ");
        char inital = sc.next().charAt(0);
        double value;

        if (inital == 'y') {
            System.out.println("Enter initial deposit value: ");
            value = sc.nextDouble();
        }
        else {
            value = 0;
        }

        Account account = new Account(name, accountNumber, value);

        System.out.println(account);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();

        account.deposit(depositValue);
        System.out.println(account);

        System.out.print("Enter a withdrawal value: ");
        double withdrawalValue = sc.nextDouble();

        account.withdrawal(withdrawalValue);
        System.out.println(account);
        sc.close();
    }

}
