package exerciciosPoo.Listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
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
        Locale.setDefault(Locale.US);
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
        System.out.print("Números adicionados: ");
        for (int i = 0; i < lista.size(); i++) {
            System.out.print(lista.get(i) + " ");
        }
        System.out.println();
        //Exibindo os valores na ordem inversa que foram adicionados um abaixo do outro
        System.out.println("Numeros na ordem inversa: ");
        for (int j = lista.size()-1; j >= 0; j--) {
            System.out.println(lista.get(j));
        }
        //Calcule e mostre a soma dos valores;
        int soma = 0;
        for (int i = 0; i < lista.size(); i++) {
            soma += lista.get(i);
        }
        System.out.println("A soma dos números foi: " + soma);

        //Calcule e mostre a média dos valores;
        double media = (double) soma / lista.size();
        System.out.printf("A média dos valores digitados foi: %.2f %n", media);

        //Calcule e mostre a quantidade de valores acima da média calculada;
        System.out.println("Os números acima da média foram: ");
        for(int k = 0; k < lista.size(); k++){
            if (lista.get(k) > media){
                System.out.print(lista.get(k) + " ");
            }
        }
        System.out.println();
        //Calcule e mostre a quantidade de valores abaixo de sete
        System.out.println("Os números abaixo de 7 foram os números: ");
        for(int l = 0; l < lista.size(); l++){
            if(lista.get(l) < 7){
                System.out.print(lista.get(l) + " ");
            }
        }
        sc.close();
    }
}
