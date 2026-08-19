package exerciciosPoo.Listas;
/*
Faça um programa que receba a temperatura média de cada mês do ano e armazene-as em uma lista.
Após isto, calcule a média anual das temperaturas e mostre todas as temperaturas acima da média anual,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, ...).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ex002 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<String> meses = new ArrayList<>(List.of(
                "Janeiro", "Fevereiro", "Março", "Abril", "Maio",
                "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"));

        List<Double> temperatura = new ArrayList<>();
        for (int i = 0; i < 12; i++){
            System.out.printf("Digite a temperatura média do mês de %s: ", meses.get(i));
            temperatura.add(sc.nextDouble());
        }

        double media = 0.0;
        for (int i = 0; i < temperatura.size(); i++){
            media += temperatura.get(i);
        }

        media /= temperatura.size();
        System.out.println();
        System.out.printf("A temperatura média anual foi de: %.1f %n", media);
        System.out.println("Os meses em que a temperatura ficou acima da média foram: ");
        for (int i = 0; i < temperatura.size(); i++){
            if(temperatura.get(i) > media){
                System.out.printf("%s - com %.1f° %n",meses.get(i), temperatura.get(i));
            }
        }
        sc.close();
    }
}
