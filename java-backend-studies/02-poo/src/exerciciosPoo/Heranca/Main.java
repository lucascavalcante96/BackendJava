package exerciciosPoo.Heranca;

import exerciciosPoo.Heranca.Entities.Employee;
import exerciciosPoo.Heranca.Entities.OutsourcedEmployee;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();

        List<Employee> employees = new ArrayList<Employee>();
        for (int i = 1; i <= n; i++) {
            System.out.printf("Employee #%d data:%n", i);
            System.out.print("Outsourced (y/n)? ");
            char ch = sc.next().charAt(0);
            sc.nextLine();
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            if (Character.toLowerCase(ch) == 'y') {
                System.out.print("Additional charge: ");
                double additionalCharge = sc.nextDouble();
                Employee oue = new OutsourcedEmployee(name,hours,valuePerHour,additionalCharge);
                employees.add(oue);
            } else {
                Employee e = new Employee(name,hours,valuePerHour);
                employees.add(e);
            }

        }
        System.out.println();
        System.out.println("PAYMENTS:");
        for (Employee e : employees) {

            System.out.printf("%s - $ %.2f %n", e.getNome(), e.payment());
        }

        sc.close();
    }
}
