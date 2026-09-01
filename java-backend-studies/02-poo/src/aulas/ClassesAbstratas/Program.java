package aulas.ClassesAbstratas;

import aulas.ClassesAbstratas.Entities.Circle;
import aulas.ClassesAbstratas.Entities.Enum.Color;
import aulas.ClassesAbstratas.Entities.Rectangle;
import aulas.ClassesAbstratas.Entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<Shape>();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char choice = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());
            if (Character.toLowerCase(choice) == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                Shape shape = new Rectangle(color, width, height);
                shapes.add(shape);

            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Shape shape = new Circle(color,radius);
                shapes.add(shape);
            }
        }
        System.out.println();
        System.out.println("SHAPES AREAS:");
        for (Shape shape : shapes) {
            System.out.printf("%.2f\n",shape.area());
        }
        sc.close();
    }
}
