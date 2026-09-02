package exerciciosPoo.Exercicio.OrderAndItemSystem.Entities;

public class Order extends Item {
    private int id;
    private Item item;

    public Order() {
    }

    public Order(int id, Item item) {
        this.id = id;
        this.item = item;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double calcularTotal(){
        double sum = 0.0;
        sum += subtotal();
        return sum;
    }

    public String exibirResumo(){
        return "Item " + item.getProductName() +
                " Valor R$" + String.format("%.2f",item.getUnitPrice()) +
                " Quantidade " + item.getQuantity();
    }
}
