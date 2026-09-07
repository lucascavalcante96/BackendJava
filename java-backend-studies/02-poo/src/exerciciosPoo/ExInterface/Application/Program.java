package exerciciosPoo.ExInterface.Application;

import exerciciosPoo.ExInterface.Entities.Contract;
import exerciciosPoo.ExInterface.Entities.Installment;
import exerciciosPoo.ExInterface.Services.ContractService;
import exerciciosPoo.ExInterface.Services.PaypalServive;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");


        System.out.println("Entre com os dados do contrato: ");
        System.out.print("Número: ");
        int number = sc.nextInt();
        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(sc.next(),dtf);
        System.out.print("Valor do contrato: ");
        double totalValue = sc.nextDouble();

        Contract contract = new Contract(number,date,totalValue);

        System.out.print("Entre com o número de parcelas: ");
        int parcelas = sc.nextInt();

        ContractService contractService = new ContractService(new PaypalServive());
        contractService.processContract(contract,parcelas);

        System.out.println("PARCELAS");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        sc.close();
    }
}
