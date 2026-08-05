package Aulas;

import java.util.Scanner;

public class Funcoes {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite três numeros: ");
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        int maior = max(n, n2, n3);

        showResult(maior);
    }

    public static int max(int a, int b, int c) {
        int aux;
        if (a > b && a > c) {
            aux = a;
        }  else if (b > a && b > c) {
            aux = b;
        } else {
            aux = c;
        }
        return aux;
    }
    public static void showResult(int valor){
        System.out.println("Maior número: " + valor);
    }
}
