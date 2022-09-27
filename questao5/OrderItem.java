package questao5;

public class OrderItem {
    private int quantity;
    private double price;
    private Product product;

    public OrderItem(int quantity, double price, Product product){
        this.quantity=quantity;
        this.price=price;
        this.product=product;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public Product getProduct(){
        return this.product;
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
    public void setProduct(Product product){
        this.product=product;
    }
    public double Subtotal(){
        return getPrice() * getQuantity();
    }
    public String toString(){
        return product.getName() + ", $" + String.format("%.2f,", getPrice()) + " Quantity: " + getQuantity() + " Subtotal: "+ String.format("%.2f,", Subtotal()) ;
    }
}

