package aulas.Interface;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Interfaces {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Entre com os dados do Aluguel");
        System.out.print("Modelo do Carro: ");
        String modelo = sc.nextLine();

        System.out.print("retirada (dd/MM/yyyy hh:mm): ");
        LocalDateTime start =  LocalDateTime.parse(sc.nextLine(), dtf);

        System.out.print("devolução (dd/MM/yyyy hh:mm): ");
        LocalDateTime finish =  LocalDateTime.parse(sc.nextLine(), dtf);

        CarRental cr = new CarRental(start, finish, new Vehicle(modelo));

        sc.close();
    }

}
