package ExercicioEstruturaRepetitiva;

import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double paisA = 80000.0;
        double paisB = 200000.0;
        int count = 0;
        while ( paisA <= paisB ) {
            paisA = paisA * 1.03;
            paisB = paisB * 1.015;
            count++;
        }
        System.out.printf("Após %d anos o pais A ultrapassou o Pais B%n", count);
        System.out.printf("Ao final desses %d anos a população final foi de: Pais A = %.3f e do Pais B foi de: %.3f %n", count, paisA, paisB);
    }
}
