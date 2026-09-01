package exerciciosPoo.Heranca.Entities;

public class OutsourcedEmployee extends Employee {
    private Double additionalCharge;

    public OutsourcedEmployee(String nome, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(nome, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment() {
        return super.payment() + (additionalCharge + additionalCharge * 0.1);

    }
}
