package day14_Recap;
import java.util.Scanner;
public class Scanner_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your gender");
        String gender = scan.next();

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your country name: ");
        String countryName= scan.nextLine();

        System.out.println("Enter your zipcode: ");
        int zipcode= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your fullname: ");
        String fullName = scan.nextLine();

        System.out.println(gender+", "+age+", "+countryName+", "+zipcode+", "+fullName);
    }
}
