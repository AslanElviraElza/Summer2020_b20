package day22_NestedLoop;

import java.util.Scanner;

public class OccurancesOfChar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a String");

        String str= scan.nextLine();
        char ch = scan.next().charAt(0);
        int count = 0;

        for(int i=0; i<=str.length()-1; i++){
            char each = str.charAt(i);
            if(each==ch){
                count+=1;
            }
        }
        System.out.println(count);
    }
}
