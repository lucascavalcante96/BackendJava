package Aulas;

import java.util.Scanner;

public class Condicionais {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int hora;
        System.out.println("Digite a hora: ");
        hora = sc.nextInt();
        if  (hora <= 12) {
            System.out.println("Bom dia");
        }
        else if (hora > 12 && hora < 18)  {
            System.out.println("Boa tarde");
        }
        else {
            System.out.println("Boa noite");
        }
        sc.close();
    }
}
