package Entities;

import Entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;

    private Department department;

    private List<HourContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel level, Double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    public void addContract(HourContract contract) {
        if (contract != null) {
            contracts.add(contract);
        }
    }

    public void removeContract(HourContract contract) {
        contracts.remove(contract);
    }

    public double income(int year, int month) {
        // Evita NPE se baseSalary não tiver sido setado
        double sum = (baseSalary != null) ? baseSalary : 0.0;

        for (HourContract contract : contracts) {
            if (contract.getDate() == null) {
                continue; // ignora contratos sem data
            }
            int c_year = contract.getDate().getYear();
            int c_month = contract.getDate().getMonthValue(); // já é 1-12, sem precisar +1

            if (year == c_year && month == c_month) {
                sum += contract.totalValue();
            }
        }
        return sum;
    }
}