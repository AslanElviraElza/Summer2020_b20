package day20_While_DoWhile;

import java.util.Scanner;

public class removeDuplicates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = "abab"; //scan.next();

        String result = "";

        for (int i=0; i<=str.length()-1; i++) {

            String s = "" + str.charAt(i);

            if (!result.contains(s) ) { //if character is already in the result we'll not add it in the result
                result += s;

            }

        }
        System.out.println(result);
    }
}

