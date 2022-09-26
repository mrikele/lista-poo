package questao6;

public class PersonIndividual extends Person {
    public String Cpf;

    public PersonIndividual(String Cpf){
        this.Cpf=Cpf;
    }
    public String getCpf() {
        return Cpf;
    }
    public void setCpf(String Cpf){
        this.Cpf=Cpf;
    }
    @Override
     public java.lang.String toString() {
        return "{individual}, CPF: " + this.Cpf;
     }

    }


    
    
    
        
    



