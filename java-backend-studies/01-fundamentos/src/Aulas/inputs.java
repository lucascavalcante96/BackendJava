package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class inputs {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String nome;
        System.out.println("Digite seu nome: ");
        nome = sc.next();

        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = sc.nextDouble();
        sc.close();
    }
}
