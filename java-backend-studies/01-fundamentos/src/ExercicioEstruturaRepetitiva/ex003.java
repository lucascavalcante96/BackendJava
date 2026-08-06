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
        while(true){
            System.out.println("Digite seu nome: ");
            nome = sc.nextLine();
            if (nome.length() >= 3){
                System.out.println("Digite sua idade: ");
                idade = sc.nextInt();
                if (idade >= 0 && idade <=150){
                    System.out.println("Digite seu Estado Civil ");
                    System.out.println("[S] para Solteiro/a");
                    System.out.println("[C] para Casado/a");
                    System.out.println("[V] para Viuvo/a");
                    System.out.println("[D] para Divorciado/a");
                    estadoCivil = sc.next().charAt(0);
                    estadoCivil = Character.toLowerCase(estadoCivil);

                    if (estadoCivil == 's' || estadoCivil == 'c' || estadoCivil == 'v' || estadoCivil == 'd'){
                        System.out.println("Digite seu salario: ");
                        salario = sc.nextDouble();

                        if (salario >= 0){
                            System.out.println("Olá " + nome);
                            System.out.println("Sua idade é de " + idade + " anos");
                            System.out.println("Seu estado Civil é: " + estadoCivil);
                            System.out.println("Seu salário é de R$ " + salario);
                            break;
                        }
                    }
                    else {
                        System.out.println("Estado Civil invalido digite novamente !");
                    }
                }
                else {
                    System.out.println("Idade invalida digite novamente !");
                }
            } else {
                System.out.println("Nome invalido digite novamente !");
            }
        }
    }
}
