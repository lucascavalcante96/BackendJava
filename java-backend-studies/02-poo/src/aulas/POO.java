package aulas;

import java.util.Locale;
import java.util.Scanner;

public class POO {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangulo x, y;
        x = new Triangulo();
        y = new Triangulo();

        System.out.println("Digite o valor do triangulo: ");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();
        System.out.println("Digite o valor do triangulo: ");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p * (p - x.a) *(p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p * (p - y.a) *(p - y.b) * (p - y.c));

        System.out.printf("Area do Triangulo X: %.3f%n", areaX);
        System.out.printf("Area do Triangulo Y: %.3f%n", areaY);

    }
}
