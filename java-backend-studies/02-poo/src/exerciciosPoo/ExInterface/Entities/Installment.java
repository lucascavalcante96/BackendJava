package exerciciosPoo.ExInterface.Entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Installment {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    private LocalDate date;
    private Double amount;

    public Installment() {
    }

    public Installment(LocalDate date, Double amount) {
        this.date = date;
        this.amount = amount;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return date.format(formatter) + " - " + String.format("%.2f",amount);
    }
}
