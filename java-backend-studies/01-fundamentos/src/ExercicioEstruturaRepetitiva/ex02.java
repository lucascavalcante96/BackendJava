package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/*Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual
 ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações. */
public class ex02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = sc.nextLine();

        while (true){
            if (nome.toLowerCase().equals(senha.toLowerCase())){
                System.out.println("Sua senha não pode ser igual ao seu nome! ");
                System.out.println("Digite seu nome: ");
                nome = sc.nextLine();
                System.out.println("Digite sua senha: ");
                senha = sc.nextLine();
            } else  break;
        }
    }
}
