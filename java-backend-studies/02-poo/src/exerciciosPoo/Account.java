package exerciciosPoo;

public class Account {
    private int accountNumber;
    private String name;
    private double value;

    public Account() {
    }

    public Account(String name, int accountNumber) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.value = 0;
    }

    public Account(String name, int accountNumber, double value) {
        this.accountNumber = accountNumber;
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
        return accountNumber;
    }

    public double getValue() {
        return value;
    }

    public double withdrawal(double amount) {
        double retire = amount + 5;
        if (retire > value) {
            System.out.println("Insufficient funds for this withdrawal.");
        } else {
            value -= (amount + 5);
            System.out.println("Updated account data: ");
        }
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
                "Account %s, Holder: %s, Balance: $%.2f", accountNumber, name, value);
    }
}
