package day22_NestedLoop;

import java.util.Scanner;

public class UpperAndLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");
        String word = scan.nextLine();

        char ch1 = word.charAt(0);
        char ch2 = word.charAt(word.length()-1);

        boolean start = ch1>='A' && ch1 <='Z';
        boolean end = ch2>='a' && ch1 <='z';

        System.out.println(start && end);
    }
}
