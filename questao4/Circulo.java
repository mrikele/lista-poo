package questao4;

public class Circulo extends AbstractShape {
    private double raio;

    public Circulo(double raio){
        this.raio=raio;
    }
    public double getRaio(){
        return raio;
    }
    public void setRaio(double raio){
        this.raio=raio;
    }

    @Override
    public double Area() {
        double areaCirculo = Math.PI * Math.pow(raio, 2);
        return areaCirculo;
    }
}
    

