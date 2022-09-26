package questao4;

public class Retangulo extends AbstractShape {
    private double altura;
    private double largura;
    public Retangulo(double altura, double largura) {
        this.altura=altura;
        this.largura=largura;
    }
    public double getAltura(){
        return this.altura;
    }
    public double getLargura(){
        return this.largura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }
    public void setLargura(double largura){
        this.largura=largura;
    }
    @Override
    public double Area() {
        double areaRetangulo = altura * largura;
        return areaRetangulo;
    }
}
    

