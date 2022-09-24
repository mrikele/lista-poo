package questao4;

public class Circulo extends AbstractShape {
    public Circulo(String color) {
        super(color);
    }

    private double raio;

    @Override
    public double Area() {
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        return areaCirculo;
    }
}
    

