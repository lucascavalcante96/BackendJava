package exerciciosPoo.ClassesAbstratas;

import exerciciosPoo.ClassesAbstratas.Entities.Pessoa;
import exerciciosPoo.ClassesAbstratas.Entities.PessoaFisica;
import exerciciosPoo.ClassesAbstratas.Entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos contribuintes serão adicionados: ");
        int contribuintes = sc.nextInt();

        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < contribuintes; i++) {
            sc.nextLine();
            System.out.printf("Contribuinte %d%n", i+1);
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            System.out.print("Renda Anual: ");
            double renda = sc.nextDouble();
            System.out.print("Pessoa Juridica (s/n): ");
            char pj = sc.next().charAt(0);
            if(Character.toLowerCase(pj) == 's'){
                System.out.print("Quantos funcionarios a empresa possui? ");
                int funcionarios = sc.nextInt();

                pessoas.add(new PessoaJuridica(nome, renda, funcionarios));
            } else {
                System.out.print("Quanto gastou com Saúde? ");
                double gastoSaude = sc.nextDouble();
                pessoas.add(new PessoaFisica(nome, renda, gastoSaude));
            }
        }

        for (Pessoa p : pessoas) {
            System.out.printf("%.2f\n",p.imposto());
        }

        sc.close();
    }
}
