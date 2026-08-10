package exerciciosPoo;

import Entities.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Salario {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.print("Name: ");
        String name = sc.nextLine();
        employee.setName(name);
        System.out.print("Gross salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        employee.tax = sc.nextDouble();

        System.out.printf("Employee: %s, $ %.2f%n", employee.getName(), employee.netSalary());
        System.out.println("Which percentage to increase salary? ");
        employee.increaseSalary(sc.nextDouble());
        System.out.printf("Updated data: %s, $%.2f %n", employee.getName(), employee.netSalary());


        sc.close();
    }
}
