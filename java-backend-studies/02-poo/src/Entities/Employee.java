package Entities;

public class Employee {
    private String name;
    private double grossSalary;
    public double tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double amount){
        grossSalary += grossSalary * (amount / 100);
    }
}
