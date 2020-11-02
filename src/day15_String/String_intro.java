package day15_String;
import java.lang.String;
import  java.util.Scanner;

public class String_intro {
    public static void main(String[] args) {
//        String name = " Aslan";
//        Scanner scan = new Scanner(System.in);
//        char ch1 = name.charAt(0);
//        char ch2 = name.charAt(5);
//        "Demir";"Aslan";

        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();

        System.out.println("Enter your first name: ");
        char ch1 = firstName.charAt(0);

        System.out.println("Enter your last name: ");
        char ch2 = lastName.charAt(0);

        System.out.println("Your initial is: "+ ch1+ch2);


    }
}
