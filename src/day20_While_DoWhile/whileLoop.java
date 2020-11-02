package day20_While_DoWhile;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//       int i= 0;
//        while( i<=10){
//            System.out.print(i+" ");
//            i++;
//        }

//        int i= 0;
//        while( i<=2){
//            System.out.print("Aslan ");
//            i++;
//        }

        String str=scan.nextLine();
        String reversed="";
        int index=str.length()-1;

        while(index>=0){
            reversed+=str.charAt(index);
            index--;
        }
        System.out.println(reversed);
    }
}
