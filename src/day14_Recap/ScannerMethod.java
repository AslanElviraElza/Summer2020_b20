package day14_Recap;
import java.util.Scanner;
public class ScannerMethod {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        // int num = input.nextInt();
        //     double num = scan.nextDouble();

        //   boolean num = scan.nextBoolean();
        System.out.println("Do you want to learn Java?");
        //String num = scan.next();
        String num = scan.nextLine();

        System.out.println("You have entered "+num);



    }
}
