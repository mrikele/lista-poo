package questao6;

public class PersonLegal extends Person {
    public String Cnpj;

    public PersonLegal(String Cnpj){
        this.Cnpj=Cnpj;
    }
     @Override
     public java.lang.String toString() {
        return "{legal}, CNPJ: " + this.Cnpj;
 }
}

