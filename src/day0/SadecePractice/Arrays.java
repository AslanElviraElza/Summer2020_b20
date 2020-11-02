package day0.SadecePractice;
import java.util.Scanner;
public class Arrays {
    public static void main(String[] args) {

        int d[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size;

        size = 10;
        //Write a program that gives us just odd numbers in the array.

        for (i = 0; i < size; i++) {
            if (d[i] % 2 == 1) {
                System.out.print(d[i] + ", ");
            }
        }

//        Scanner scan = new Scanner(System.in);
//
//        int a[] = new int[5];
//
//        int i;
//
//        for (i = 0;i < 5;i++){
//            a[i] = scan.nextInt();
//            System.out.println(a[i]);
//        }


    }
}