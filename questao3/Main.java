package questao3;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Name: ");
        emp.setNome(sc.nextLine());
        System.out.print("Gross salary: ");
        emp.setSalarioBruto(sc.nextDouble());
        System.out.print("Tax: ");
        emp.setImposto(sc.nextDouble());

        System.out.println();
        System.out.println("Employee: " + emp.salarioLiquido());
        System.out.println();
        System.out.print("Which percentage to increase salary? ");
        double porcentagem = sc.nextDouble();
        emp.Porcentagem(porcentagem);
        System.out.println();
        emp.Exibe();
        sc.close();
 }
}
