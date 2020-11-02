package day13_Scanner;

import java.util.Scanner;

public class ScannerMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Your car has 4 doors");
        boolean result = scan.nextBoolean();

        System.out.println(result);
    }
}
