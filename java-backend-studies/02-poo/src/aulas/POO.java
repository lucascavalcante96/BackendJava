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

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("Area do Triangulo X: %.3f%n", areaX);
        System.out.printf("Area do Triangulo Y: %.3f%n", areaY);
        if (areaX > areaY) {
            System.out.println("Maior area X");
        }  else {
            System.out.println("Maior area: Y");
        }
    }
}
