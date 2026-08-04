package Aulas;

import java.util.Locale;

public class FuncoesString {
    static void main() {
        String original = "Lucas Cavalcante 30 anos estudante de Analise e desenvolvimento de sistemas aprendendo java";

        String s01 = original.toLowerCase();
        System.out.println("- String original: " + original + " -");
        System.out.println("- toLowercase: " + s01 + " -");

        String s02 = original.toUpperCase();
        System.out.println("- String original: " + original + " -");
        System.out.println("- toUppercase: " + s02 + " -");

    }
}
