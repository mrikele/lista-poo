package questao5;
import java.sql.Date;

public class Order {
    private Date moment;
    private OrderStatus status;

    public Order(Date moment, OrderStatus status){
        this.moment=moment;
        this.status=status;
    }
    public Date getMoment(){
        return this.moment;
    }
    public OrderStatus getStatus(){
        return this.status;
    }
    public void setMoment(Date moment){
        this.moment=moment;
    }
    public void setStatus(OrderStatus status){
        this.status=status;
    }
    
}
