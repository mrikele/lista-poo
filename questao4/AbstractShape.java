package questao4;

public abstract class AbstractShape{
    private Color color;

   // public AbstractShape(Color color){}

    public Color getColor(){
        return color;
    }

    public void setColor(Color color){
        this.color=color;
    }

    public double Area(){
        return 0.0;
    }


}
