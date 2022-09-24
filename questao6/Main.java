package questao6;



public class Main {
    public static void main(String[] args) {
        PersonIndividual personIndividual = new PersonIndividual("1209876555");
        PersonLegal personLegal = new PersonLegal( "123456789");    
        System.out.println(personIndividual);
        System.out.println(personLegal);

        System.out.println(personLegal.isValid());
        System.out.println(personIndividual.isValid());


    }
}
        
        

