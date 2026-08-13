package exerciciosPoo;

public class Account {
    private int acountNumber;
    private String name;
    private double value;

    public Account() {
    }

    public Account(String name, int acountNumber) {
        this.acountNumber = acountNumber;
        this.name = name;
        this.value = 0;
    }

    public Account(String name, int acountNumber, double value) {
        this.acountNumber = acountNumber;
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAcountNumber() {
        return acountNumber;
    }

    public double getValue() {
        return value;
    }

    public double withdrawal(double amount) {
        value -= (amount + 5);
        System.out.println("Updated account data: ");
        return value;
    }

    public double deposit(double amount) {
        value += amount;
        System.out.println("Updated account data: ");
        return value;
    }

    @Override
    public String toString() {
        return String.format(
                "Account %s, Holder: %s, Balance: $%.2f", acountNumber, name, value);
    }
}
