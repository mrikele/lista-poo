public class CurrencyConverter{
    public static double dollarToReal(double quantidade, double valor){
        double calculo = quantidade*valor;
        double calculoIOF = calculo+(calculo*0.06);
        return calculoIOF;
    }
}