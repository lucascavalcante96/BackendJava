package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

// Faça um programa que peça uma nota, entre zero e dez.
// Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
public class ex001 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma nota entre 0 e 10");
        int nota = sc.nextInt();
        while (true){
            if (nota >= 0 && nota <= 10){
                System.out.println("A nota foi: " + nota);
                break;
            } else {
                System.out.println("Nota invalida digite novamente: ");
                nota = sc.nextInt();
            }
        }
    }
}
