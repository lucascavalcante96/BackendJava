package exerciciosPoo.Exercicio.OrderAndItemSystem;

import exerciciosPoo.Exercicio.OrderAndItemSystem.Entities.Item;
import exerciciosPoo.Exercicio.OrderAndItemSystem.Entities.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Pedido: ");
        System.out.print("Quantos itens deseja adicionar: ");
        int itensPedido = sc.nextInt();


        List<Order> orders = new ArrayList<>();
        for (int i = 1; i <= itensPedido; i++) {
            sc.nextLine();
            System.out.println("Item " + i);
            System.out.print("Nome do produto: ");
            String produto = sc.nextLine();

            System.out.print("Preço: ");
            double preco = sc.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = sc.nextInt();
            Item item = new Item(produto, preco, quantidade);

            orders.add(new Order(i, item));
        }
        double valorTotal;
        for (Order order : orders) {
             valorTotal = order.calcularTotal();
        }

        for (Order order : orders) {
            System.out.println(order.exibirResumo());
        }
        sc.close();

    }
}
