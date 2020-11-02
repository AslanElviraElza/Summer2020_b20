package day22_NestedLoop;

import java.util.Scanner;

public class Crudentials {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your username");
        String u = scan.nextLine();

        System.out.println("Enter your password");
        String p = scan.nextLine();

        int attempt=0;

        while(!(u.equals("AslanElvira")&& p.equals("2019"))){
            if(attempt==3){
                System.out.println("Your account is locked");
                System.exit(0);
            }
            System.out.println("Invalid Entries. Pls re-enter");
            System.out.println("Enter your username");
            u = scan.nextLine();

            System.out.println("Enter your password");
            p = scan.next();
            attempt++;
        }
        System.out.println("You're logged in");

    }
}
