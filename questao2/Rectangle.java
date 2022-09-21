public class Rectangle {
    private double largura;
    private double altura;

    public double getLargura(){
        return this.largura;
    }

    public double getAltura(){
        return this.altura;
    }
    
    public void setLargura(double largura){
        this.largura = largura;

    }

    public void setAltura(double altura){
        this.altura = altura;

    }
    public double area(){
        double areaRet = getLargura()*getAltura();
        return areaRet;
    }

    public double perimetro(){
        double perimetroRet = (getLargura()+getAltura())*2;
        return perimetroRet;
    }

    public double diagonal(){
        double diagonalRet = Math.sqrt(Math.pow(getAltura(), 2) + Math.pow(getLargura(), 2)); 
        return diagonalRet;
    }
}
