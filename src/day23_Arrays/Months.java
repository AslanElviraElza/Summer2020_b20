package day23_Arrays;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

        System.out.println("Enter a number between 1 ~ 12");
        int n = scan.nextInt(); // 5

        System.out.println( months[n-1] );
        System.out.println("==============================================================");

        String[] days = new String[7];
        days[6] = "Sunday";
        days[1] = "Tuesday";
        days[4] = "Friday";
        days[3] = "Thursday";
        days[2] = "Wednesday";
        days[5] = "Saturday";
        days[0] = "Monday";

        for(int i = 0; i <= days.length-1; i++){
            System.out.print( days[i] +" ");
        }

        System.out.println();

        System.out.println("==============================");


        System.out.println("Enter a number between 1 ~7");
        int num = scan.nextInt();

        System.out.println( days[num-1]);
    }
}
