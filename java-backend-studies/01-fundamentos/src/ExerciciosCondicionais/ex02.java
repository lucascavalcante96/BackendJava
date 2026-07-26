package ExerciciosCondicionais;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que peça um valor e mostre na tela se o valor é positivo ou negativo
public class ex02 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        double numero = sc.nextDouble();

        if (numero >= 0){
            System.out.println("O numero digitado é positivo");
        }
        else {
            System.out.println("O numero digitado é negativo");
        }
    }
}
