package ExercicioEstruturaRepetitiva;

import java.util.Scanner;

/*
Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:

Tabuada de 5:
5 X 1 = 5
5 X 2 = 10
...
5 X 10 = 50
 */
public class ex010 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um numero entre 1 e 10: ");
        numero = sc.nextInt();
        int i = 1;
        while(true){

            if (numero > 0 && numero <= 10) {
                if (i == 1){
                    System.out.println("Tabuada de " + numero);
                }
                int resultado = numero * i;
                System.out.printf("%d X %d = %d%n", numero,i, resultado);
                i +=1;
                if (i == 11){
                    break;
                }
            } else {
                System.out.println("Numero invalido");
                System.out.println("Digite um numero entre 1 e 10: ");
                numero = sc.nextInt();
            }
        }
    }
}
