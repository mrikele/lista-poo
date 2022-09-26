package questao6;

public abstract class Person implements IEntityValidation{
    public Person(){};

    public java.lang.String toString() {
        return "Type: Person";
    }
    
    public Boolean isValid() {
        return true;
    }
}