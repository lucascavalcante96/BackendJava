package aulas;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Digite o nome do produto: ");
        product.nome = sc.nextLine();
        System.out.println("Digite o valor do produto: ");
        product.preco = sc.nextDouble();
        System.out.println("Digite o quantidade do produto: ");
        product.quantidade = sc.nextInt();


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
