package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/*
* Faça um programa que leia e valide as seguintes informações:

Nome: maior que 3 caracteres;
Idade: entre 0 e 150;
Salário: maior que zero;
Estado Civil: 's', 'c', 'v', 'd';
* */
public class ex003 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        String nome;
        char estadoCivil;
        int idade;
        double salario;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();
        while (nome.length() <= 3) {
            System.out.println("Nome invalido digite novamente");
            nome = sc.nextLine();
        }

        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        while (idade < 0 || idade > 150) {
            System.out.println("Idade invalida digite novamente");
            idade = sc.nextInt();
        }

        System.out.println("Digite seu salario: ");
        salario = sc.nextDouble();
        while (salario <= 0) {
            System.out.println("Salario invalido digite novamente");
            salario = sc.nextDouble();
        }

        System.out.println("Digite seu estado civil: ");
        System.out.println("[S] para Solteiro/a");
        System.out.println("[C] para Casado/a");
        System.out.println("[V] para Viuvo/a");
        System.out.println("[D] para Divorciado/a");
        estadoCivil = sc.next().charAt(0);
        estadoCivil = Character.toLowerCase(estadoCivil);

        while (true) {
            if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'){
                break;
            } else {
                System.out.println("Estado civil invalido digite novamente");
                estadoCivil = sc.next().charAt(0);
                estadoCivil = Character.toLowerCase(estadoCivil);
            }
        }
        System.out.printf("Seu nome %s%n", nome);
        System.out.printf("Você tem %d anos %n", idade);
        System.out.printf("Seu salário é de %.2f%n", salario);
        if (estadoCivil == 's') {
            System.out.println("Seu estado cívil é Solteiro");
        } else if (estadoCivil == 'c') {
            System.out.println("Seu estado cívil é Casado");
        } else if (estadoCivil == 'v') {
            System.out.println("Seu estado cívil é Viuvo/a");
        } else {
            System.out.println("Seu estado cívil é Divorciado");
        }
    }
}

