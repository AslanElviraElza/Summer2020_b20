package day20_While_DoWhile;

import java.util.Scanner;

public class factorielNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int result= 1;
        for(int i = 5 ; i >=1; i --){
            result*= i;
        }
        System.out.println(result);

    }
}

// Baslangica int i= scan.nextInt(); yaparsak numarayi consoledan aliriz
