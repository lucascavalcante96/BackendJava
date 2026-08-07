package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

/* Altere o programa anterior para mostrar no final a soma dos números.
ex anterior:
Faça um programa que receba dois números inteiros e gere os números inteiros que estão no intervalo compreendido por eles.
*/
public class ex009 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numero1, numero2;
        int maior, menor;
        int soma = 0;

        System.out.println("Digite o primeiro numero: ");
        numero1 = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        numero2 = sc.nextInt();

        if(numero1 < numero2){
            menor = numero1;
            maior = numero2;
        } else {
            menor = numero2;
            maior = numero1;
        }
        for (int i = menor + 1; i < maior; i++) {
            soma += i;
            System.out.println(i);

        }
        System.out.printf("A soma do intervalo entre %d e %d é %d", menor, maior, soma);
    }
}
