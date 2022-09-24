package questao4;

public class Retangulo extends AbstractShape {
    public Retangulo(String color) {
        super(color);
    }

    private double altura;
    private double largura;
    
    @Override
    public double Area() {
        double areaRetangulo = altura * largura;
        return areaRetangulo;
    }
}
    

