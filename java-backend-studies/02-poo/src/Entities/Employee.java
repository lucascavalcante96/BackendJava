package Entities;

public class Employee {
    private String name;
    public double grossSalary;
    public double tax;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double netSalary(){
        return grossSalary - tax;
    }

    public void increaseSalary(double amount){
        grossSalary += grossSalary * (amount / 100);
    }
}
