package day23_Arrays;

import java.util.Scanner;

public class CybertekInn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        System.out.println("Welcome to Cybertek Inn");


        while(true) {

            System.out.println("Please choose from the following: ");
            System.out.println("1. King Bed: $120");
            System.out.println("2. Queen Bed: $100");
            System.out.println("3. Single Bed: $80");
            int option = scan.nextInt();

            switch (option) {
                case 1:
                    total += 120;
                    break;
                case 2:
                    total += 100;
                    break;
                case 3:
                    total += 80;
                    break;

                default:
                    System.out.println("Get Out");
                    System.exit(0);
            }

            System.out.println("do you want to reserve another room?");
            String a = scan.next().toLowerCase();

            while(  !(a.equals("yes") || a.equals("no"))  ){ // while the answer is invalid
                System.out.println("Invalid, Please re-enter");
                System.out.println("do you want to reserve another room?");
                a=scan.next().toLowerCase();
            }

            if(a.equals("no")) {
                break;
            }
            }
    }
}
