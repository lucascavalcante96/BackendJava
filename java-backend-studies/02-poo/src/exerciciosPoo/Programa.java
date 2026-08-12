package exerciciosPoo;

import Entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Programa {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Entre com a altura do retangulo: ");
        double height = sc.nextDouble();

        System.out.println("Entre com a largura do retangulo: ");
        double width = sc.nextDouble();

        Rectangle retangulo = new Rectangle();
        retangulo.setHeight(height);
        retangulo.setWidth(width);
        System.out.printf("AREA = %.2f%n", retangulo.area());
        System.out.printf("PERIMETRO = %.2f%n", retangulo.perimeter());
        System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
        sc.close();
    }
}
