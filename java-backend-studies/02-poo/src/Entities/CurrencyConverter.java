package Entities;

public class CurrencyConverter {
    public static double convert( double value, double amount) {
        return (value * amount) + (value * amount * 0.06);
    }
}
