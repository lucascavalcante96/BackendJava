package Aulas;

import java.util.Locale;

public class FuncoesString {
    static void main() {
        String original = "Lucas Cavalcante 30 anos estudante de Analise e desenvolvimento de sistemas aprendendo java       ";

        String s01 = original.toLowerCase();
        System.out.println("- String original: " + original + " -");
        System.out.println("- toLowercase: " + s01 + " -");
        System.out.println();

        String s02 = original.toUpperCase();
        System.out.println("- String original: " + original + " -");
        System.out.println("- toUppercase: " + s02 + " -");
        System.out.println();

        String s03 = original.trim();
        System.out.println("- String original: " + original + " -");
        System.out.println("- removendo espaços em branco no final: " + s03 + " -");
        System.out.println();

        String s04 = original.substring(0,16);
        System.out.println("- String original: " + original + " -");
        System.out.println("- criando substring: " + s04 + " -");
        System.out.println();

        String s05 = original.replace("estudante", "profissional");
        System.out.println("- String original: " + original + " -");
        System.out.println("- Substituindo palavra: " + s05 + " -");
        System.out.println();
    }
}
