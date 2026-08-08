package exerciciosPoo;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Rectangle retangulo = new Rectangle();

        System.out.println("Entre com a altura do retangulo: ");
        retangulo.height = sc.nextDouble();

        System.out.println("Entre com a largura do retangulo: ");
        retangulo.width = sc.nextDouble();

        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        sc.close();
    }
}
