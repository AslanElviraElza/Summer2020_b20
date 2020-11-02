package day19_ForLoop;

import java.util.Scanner;

public class SumOfNums {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scan.nextInt();

        int sum=0;

        if(num>1){
            for(int i = 0; i<num; i++){
                sum += i;
            }
            System.out.println(sum);
        }else{
            System.out.println("Invalid Entry");
        }


    }
}
