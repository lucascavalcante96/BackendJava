package ExerciciosCondicionais;

import java.util.Scanner;

/* Faça um programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever:

F - Feminino
M - Masculino
Sexo Inválido.*/
public class ex03 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite F para Feminino ou M para Masculino: ");
        char sexo = sc.next().charAt(0);
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("M - Masculino");
        }
        else if (sexo == 'F'  || sexo == 'f') {
            System.out.println("F - Feminino");

        }
        else {
            System.out.println("Sexo invalido");
        }
    }
}
