package day0.SadecePractice;

import java.util.Scanner;

public class Yigit_Meydani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        for(int i=1; i<100; i++){
//            if(i%3==0){
//                continue;
//            }
//            System.out.print(i+" ");
//        }
//        System.out.println("==============================================================================");

        int sum = 0; // 10 + 20 + 30 + 40 + 50 = 150

        for(int i = 1; i <= 5; i += 1){

            System.out.println("Enter a number: ");
            int num = scan.nextInt(); // 10 , 20, 30, 40, 50
            sum += num;

        }

        System.out.println(sum);

    }
}
