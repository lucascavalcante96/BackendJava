package Aulas;

import java.util.Locale;
import java.util.Scanner;

public class CondicionalTernaria {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura: ");
        double temperatura = sc.nextDouble();
        String tempo = (temperatura > 30.0) ? "Calor" : "frio";

        System.out.println("Hoje fara: " + tempo);
    }
}
