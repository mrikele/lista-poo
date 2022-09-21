package questao3;

public class Employee {
    private String nome;
    private double salarioBruto;
    private double imposto;

    public String getNome(){
        return this.nome;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    public double getImposto(){
        return this.imposto;
    }

    public void setNome(String nome){
        this.nome=nome;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto=salarioBruto;
    }

    public void setImposto(double imposto){
        this.imposto=imposto;
    }

    public double salarioLiquido(){
        double salarioL = getSalarioBruto()-getImposto();
        return salarioL;
    }

    public void Exibe(){
        System.out.printf("Update data: %S, %.2f", getNome(), getSalarioBruto());
    }


    public void Porcentagem(double porcentagem){
        this.setSalarioBruto(this.salarioLiquido() + (this.getSalarioBruto() * 0.10f));

    }
}

