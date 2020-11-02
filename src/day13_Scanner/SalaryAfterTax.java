package day13_Scanner;
import java.util.Scanner;
public class SalaryAfterTax {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        System.out.println("Enter your annual salary: ");
        int salary = scan.nextInt();
        System.out.println("Enter your state tax rate: ");
        double stateTaxRate= scan.nextDouble();
        double stateTax = salary*stateTaxRate;

        System.out.println("Enter your federal tax rate: ");
        double federalTaxRate = scan.nextDouble();
        double federalTax= salary*federalTaxRate;

        double salaryAfterTax = salary-stateTax-federalTax;

        System.out.println("Your annual salary: $ "+ salary);
        System.out.println("Your state tax: $" + stateTax);
        System.out.println("Your federal tax : $ "+federalTax);
        System.out.println("Your salary after tax: $ "+salaryAfterTax);
    }
}
