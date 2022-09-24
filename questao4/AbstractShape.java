package questao4;

public abstract class AbstractShape{
    private String color;

    public AbstractShape(String color){}

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color=color;
    }

    public double Area(){
        return 0.0;
    }


}
