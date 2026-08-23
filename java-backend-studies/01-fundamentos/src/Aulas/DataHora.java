package Aulas;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHora {
    static void main() {
        LocalDate data = LocalDate.now();
        System.out.println("Data: " + data);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data e Hora: " + d02);
    }
}
