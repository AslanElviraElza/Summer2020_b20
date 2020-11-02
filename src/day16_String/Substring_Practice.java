package day16_String;

import java.util.Scanner;

public class Substring_Practice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first word: ");
        String str1 = scan.next();


        System.out.println("Enter second word: ");
        String str2 = scan.next();

        String result = str1.substring(1).concat(str2.substring(1));

        System.out.println(result);

//        1. Ask user to enter two words. Print first word without its first character then print the second word without its first character.
//        Input:
//        apple
//                banana
//        Output:
//        ppleanana


    }
}
