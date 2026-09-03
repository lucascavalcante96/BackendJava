package aulas.LeituraDeArquivos;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterBufferedWrite {
    static void main() {
        String [] lines = new String [] {"Bom Dia","Boa tarde","Boa noite"};

        String path = "D:\\aprendendoEscreverComJava.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro ao abrir o arquivo" + e.getMessage());
        }
    }
}
