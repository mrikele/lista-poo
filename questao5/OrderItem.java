package questao5;

public class OrderItem {
    private int quantity;
    private double price;

    public OrderItem(int quantity, double price){
        this.quantity=quantity;
        this.price=price;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
