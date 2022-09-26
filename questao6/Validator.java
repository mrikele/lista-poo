package questao6;

public class Validator implements IEntityValidation {
    static void runValidation(IEntityValidation e){
        e.isValid();
    }
    @Override
    public  Boolean isValid() {
        return true;
    }
}

