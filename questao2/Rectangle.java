public class Rectangle {
    double largura;
    double altura;

    double getLargura(){
        return this.largura;
    }

    double getAltura(){
        return this.altura;
    }

    double area(){
        double areaRet = largura*altura;
        return areaRet;
    }

    double perimetro(){
        double perimetroRet = (altura+largura)*2;
        return perimetroRet;
    }

    double diagonal(){
        double diagonalRet = Math.sqrt(Math.pow(altura, 2) + Math.pow(largura, 2)); 
        return diagonalRet;
    }
}
