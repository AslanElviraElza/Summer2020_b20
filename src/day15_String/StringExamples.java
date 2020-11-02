package day15_String;

import java.util.Scanner;

public class StringExamples {
    public static void main(String[] args) {

        String name = "Aslan";   //aslan
        Scanner sc = new Scanner(System.in);

        String nameScanner = sc.nextLine();

        if (name.toLowerCase().equals(nameScanner.toLowerCase())) {
            System.out.println("these are equals");
        } else {
            System.out.println("these are not equals");
        }

    }


}
