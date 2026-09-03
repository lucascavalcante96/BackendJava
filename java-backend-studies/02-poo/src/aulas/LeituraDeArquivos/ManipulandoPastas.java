package aulas.LeituraDeArquivos;

import java.io.File;
import java.util.Scanner;

public class ManipulandoPastas {
    static void main() {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o caminho da pasta: ");
        String caminho = sc.nextLine();

        File path = new File(caminho);

        File[] pastas = path.listFiles(File::isDirectory); // cria uma lista de diretorios atraves do caminho que eu passei

        System.out.println("========= Pastas =========");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }
        //é possivel ver os arquivos basta usar o isFile

        System.out.println();
        System.out.println("========= ARQUIVOS =========");
        File[] arquivos  = path.listFiles(File::isFile);
        for (File arquivo : arquivos) {
            System.out.println(arquivo);
        }

        //criando uma pasta OU subpasta

        boolean novaPasta = new File(caminho + "\\pastaTesteJava").mkdir();
        System.out.println("Arquivo novo: " + novaPasta);
        if (novaPasta == true) {
            System.out.println("Pasta criada com sucesso!");
        }
        else {
            System.out.println("Deu ruim");
        }
        sc.close();
    }
}
