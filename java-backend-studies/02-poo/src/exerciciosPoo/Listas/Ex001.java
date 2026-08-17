package exerciciosPoo.Listas;

import exerciciosPoo.Listas.Entities.Funcionario;

import java.util.*;
import java.util.stream.Collectors;

public class Ex001 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos Funcionarios você irá adicionar ? ");
        int qtdFuncionarios = sc.nextInt();

        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < qtdFuncionarios; i++) {
            System.out.print("Digite o id do funcionario: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Digite o nome: ");
            String nome = sc.nextLine();
            System.out.print("Digite o salario: ");
            double salario = sc.nextDouble();
            Funcionario funcionario = new Funcionario(id, nome, salario);
            funcionarios.add(funcionario);
        }

        System.out.print("Qual funcionario deseja aumentar o salario digite o ID: ");
        int idFuncionario = sc.nextInt();


        Funcionario funcionario = funcionarios.stream().filter(f -> f.getId() == idFuncionario).findFirst().orElse(null);
        if (funcionario == null) {
            System.out.println("Funcionario inexistente!");
        } else {
            System.out.print("Digite quantos porcento deseja aumentar o salario: ");
            int porcentagem = sc.nextInt();
            funcionario.aumentoSalario(porcentagem);
        }

        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        sc.close();
    }
}
