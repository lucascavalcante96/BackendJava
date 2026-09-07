package exerciciosPoo.ExInterface.Services;

public interface OnlinePayment {
    double paymentFee(double amount);
    double interest(double amount, Integer months);
}
