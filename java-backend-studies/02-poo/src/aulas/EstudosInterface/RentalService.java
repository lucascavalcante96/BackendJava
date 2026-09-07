package aulas.EstudosInterface;

import java.time.Duration;

public class RentalService {
    private double pricePerHour;
    private double pricePerDay;


    private TaxService taxService;

    public RentalService(double pricePerHour, double pricePerDay, TaxService taxService) {
        this.pricePerDay = pricePerDay;
        this.pricePerHour = pricePerHour;
        this.taxService = taxService;
    }

    public void processInvoice(CarRental cr) {
        double minutes = Duration.between(cr.getStart(),cr.getFinish()).toMinutes();
        double hours = minutes / 60;

        double basicPayment;
        if (hours <= 12){
            basicPayment = pricePerHour * Math.ceil(hours);
            System.out.println("Basic Payment : " + basicPayment);
        }
        else {
            basicPayment = pricePerDay * Math.ceil(hours / 24.0);
        }

        double tax = taxService.tax(basicPayment);

        cr.setInvoice(new Invoice(basicPayment,tax));
    }
}
