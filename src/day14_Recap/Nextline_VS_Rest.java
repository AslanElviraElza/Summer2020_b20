package day14_Recap;
import java.util.Scanner;
public class Nextline_VS_Rest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println(fullName+" is "+age+" years old");
    }
}
