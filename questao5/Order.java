package questao5;
//import questao5.OrderStatus;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order(Date moment, OrderStatus status,Client client){
        this.moment=moment;
        this.status=status;
        this.client=client;
    }
    public Date getMoment(){
        return this.moment;
    }
    public OrderStatus getStatus(){
        return this.status;
    }
    public Client getClient(){
        return client;
    }
    public void setMoment(Date moment){
        this.moment=moment;
    }
    public void setStatus(OrderStatus status){
        this.status=status;
    }
    public void setClient(Client client){
        this.client=client;
    }
    public List<OrderItem> getItems(){
        return items;
    }
    public void addItem(OrderItem item){
        items.add(item);
    }
    public void addRemove(OrderItem item){
        items.remove(item);
    }
    public double Total(){
        double soma = 0.0;
        for(OrderItem x: items){
            soma+=x.Subtotal();
        }
        return soma;
    }
    public String toString(){
        StringBuilder st = new StringBuilder();
        st.append("Order moment: " + sdf.format(getMoment()));
        st.append("/nOrder Status: " + status + "/n");
        st.append("Client: " + client + "/n");
        st.append("Order items: ");
        for(OrderItem x: items){
            st.append(x + "/n");
        }
        st.append("Total price: $ " + String.format("%.2f", Total()));
        return st.toString();
    }
}
