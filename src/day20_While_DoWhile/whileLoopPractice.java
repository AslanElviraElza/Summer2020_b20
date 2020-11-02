package day20_While_DoWhile;

import java.util.Scanner;

public class whileLoopPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = "AslanElvira2019";

        System.out.println("Enter your password");
        String input = scan.nextLine();

        while (!input.equals(password)){
            System.out.println("Please re-enter your password");
            input = scan.nextLine();
        }
        System.out.println("Logged in");
    }
}
