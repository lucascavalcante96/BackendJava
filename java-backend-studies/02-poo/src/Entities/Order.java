package Entities;

import Entities.enums.Enumeracao;

import java.util.Date;

public class Order {
    private int id;
    private Date moment;
    private Enumeracao status;

    public Order() {

    }

    public Order(int id, Date moment, Enumeracao status) {
        this.id = id;
        this.moment = moment;
        this.status = status;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public Enumeracao getStatus() {
        return status;
    }

    public void setStatus(Enumeracao status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}

