package exerciciosPoo.ExInterface.Services;

public class PaypalServive implements OnlinePayment{

    @Override
    public double paymentFee(double amount) {
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, Integer months) {
        return amount * 0.01 * months;
    }
}
