package exerciciosPoo.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Faça um programa que leia um número indeterminado de valores, correspondentes a notas, encerrando a entrada de dados quando for informado um valor igual a
 -1 (que não deve ser armazenado). Após esta entrada de dados, faça:

Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem;
 */
public class ex004 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        List<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.print("Digite um numero: ");
            int numero = sc.nextInt();
            if (numero == -1) {
                break;
            } else {
                lista.add(numero);
            }
        }

        //Quantidade de números que foram lidos
        System.out.println("Foram adicionados " + lista.size() + " números");

        //Exibindo os valores um ao lado do outro
        for (int i = 0; i < lista.size(); i++) {
            System.out.print("Números adicionados: ");
            System.out.print(lista.get(i) + " ");
        }





        sc.close();
    }
}
