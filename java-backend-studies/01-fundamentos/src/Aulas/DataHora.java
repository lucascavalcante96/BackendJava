package Aulas;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHora {
    static void main() {
        LocalDate data = LocalDate.now();
        System.out.println("Data: " + data);

        LocalDateTime d02 = LocalDateTime.now();
        System.out.println("Data e Hora: " + d02);
        Instant instant = Instant.now();
        System.out.println("Data de instante: " + instant);

        LocalDate d03 = LocalDate.parse("1996-01-31"); // criando uma data no padrao iso 8601
        System.out.println("Data de nascimento " + d03);

        LocalDateTime d04 = LocalDateTime.parse("2026-01-31T00:00:00"); // Criando uma dataHora no formato ISO 8601
        System.out.println(d04);


        Instant d05 = Instant.parse("2026-01-31T00:00:00Z"); // instanciando pelo horario gmt
        System.out.println(d05);

        Instant d06 = Instant.parse("2026-01-31T00:00:00-03:00"); //instanciando pelo horario de brasilia
        System.out.println(d06);//imprime com 3 horas a mais


    }
}
