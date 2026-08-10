package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Digite o nome do produto: ");
        String nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        double preco = sc.nextDouble();
        System.out.println("Digite o quantidade do produto: ");
        int quantidade = sc.nextInt();

        Product product = new Product(nome, preco, quantidade);

        System.out.println(product);

        System.out.println("Digite a quantidade que deseja adicionar: ");
        int qtde = sc.nextInt();

        product.adicionar(qtde);
        System.out.println(product);

        System.out.println("Digite a quantidade que deseja remover: ");
        qtde = sc.nextInt();

        product.subtrair(qtde);
        System.out.println(product);

        sc.close();
    }
}
