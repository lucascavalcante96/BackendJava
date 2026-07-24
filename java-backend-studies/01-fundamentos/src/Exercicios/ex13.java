/*Faça um programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
 Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 11% para
 o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:


salário bruto.
quanto pagou ao INSS.
quanto pagou ao sindicato.
o salário líquido.
calcule os descontos e o salário líquido, conforme a tabela abaixo:

+ Salário Bruto : R$
- IR (11%) : R$
- INSS (8%) : R$
- Sindicato ( 5%) : R$
= Salário Liquido : R$
*/
package Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class ex13 {
    static void main() {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quanto você ganha por Hora: ");
        double salarioHora = sc.nextDouble();
        System.out.println("Digite quantas horas você trabalha por mês ");
        double horasTrabalhadasMes = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadasMes;
        double impostoDeRenda = salarioBruto * ((double) 11 / 100);
        double inss = salarioBruto * ( (double) 8 / 100);
        double sindicato =  salarioBruto * ( (double) 5 / 100);
        double salarioLiquido = salarioBruto - impostoDeRenda - inss - sindicato;

        System.out.printf("+ Salário Bruto : R$ %.2f %n", salarioBruto);
        System.out.printf("- IR (11%%) : R$ %.2f %n", impostoDeRenda);
        System.out.printf("- INSS (8%%) : R$ %.2f %n", inss);
        System.out.printf("- Sindicato ( 5%%) : R$ %.2f %n", sindicato);
        System.out.printf("= Salário Liquido : R$ %.2f", salarioLiquido);
    }
}
