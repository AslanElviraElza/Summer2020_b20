package day0.SadecePractice;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //q1= Write program that gives us sum and count of the numbers which are just odd ones. Size = 20,
        // array starts from 3

        //q2= Write program that takes number from console and put them in a new array.
        // It gives us the sum of even numbers in the array. Size=25


        //q3=   a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17}; write program that
        //gives us array numbers which are less than average of the all of them.

//        int a[] = {3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,};
//
//        int size, i, sum;
//        size = 20;
//        sum=0;
//        int count=0;
//
//        for (i = 0; i < size; i++) {
//            if (a[i] % 2 == 1) {
//                System.out.print(a[i] + ", ");
//                sum= sum+a[i];
//
//                count= count+1;
//            }
//
//        }
//        System.out.println();
//        System.out.println(sum);
//        System.out.println(count);

//        System.out.println("=========================================================================");
//
//        int i, size, sum;
//        size = 25;
//        sum = 0;
//        int a[] = new int[size];
//
//        for (i = 0; i < size; i++) {
//            System.out.println("Please enter a number");
//            a[i] = scan.nextInt();
//            if (a[i] % 2 == 0) {
//                sum = sum + a[i];
//            }
//
////        }
//        System.out.println(sum);
//
//        System.out.println("=========================================================================");
//        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
//        int size= 0;
//        int avarage=0;
//        int i;
//        int sum=0;
//
//        for(i=0; i<200; i++){
//            if(b[i]==17){
//                size=i+1;
//                break;
//            }
//        }
//
//        System.out.println("size: "+size);
//
//        for(i=0; i<size; i++){
//            sum=sum+b[i];
//        }
//        avarage=sum/size;
//        System.out.println("average: "+avarage);
//
//        for(i=0; i<size; i++){
//            if(b[i]<avarage){
//                System.out.println(b[i]);
//            }
//        }
//
//        System.out.println("Burda ilk dort karacterin index numarasini yazdiriyoruz===================");
//
//
//        int i=0;
//        int a[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
//
//        for( i=0; i<4; i++ ){
//            System.out.print(i);
//        }
//        System.out.println("Burda son dort karacteri yazdiriyoruz===========================================");


//        int i=0;
//        int a[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
//
//        for( i=a.length-1; i>=a.length-4; i-- ){
//            System.out.print(a[i]+", ");
//        for( i=a.length-4; i<a.length; i++ ){
//            System.out.print(a[i]+", ");
//



//        System.out.println("Burda ilk dort karacteri yazdiriyoruz===========================================");
//        int i;
//        int a[] = {0, 2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};
//
//        for( i=0; i<4; i++ ){
//            System.out.print(a[i]+", ");
//        }
//
//  System.out.println("char array asking for first 4 char in alphbt==================================");
//        int i=0;
//        char ch;
//        char x[]=new char[122-97+1];
//
//        for(ch ='a'; ch<='z'; ch++){
//            x[i]=ch;
//            i++;
//        }
//
//        for(i=0; i<=3; i++) {
//            System.out.print(x[i] + ", ");
//
//        }

        int n= scan.nextInt(); //consoledan almak icin loopun icine kullan
        int i,size;

        int a []={4, 8, 3, 1, 18, 9, 21, 20, 5, 17};

        size=a.length;

        for(i=0; i<n; i++){

            a[size-1-i]=a[n-1-i]; //denklemin son kisminda sayilari nereye tasiyacagimizi, sag kisminda ise hangi sira ile hangi sayilari alacagimizi belirliyoruz
        }
        for(i=0; i<n; i++){
            a[i]=0;
        }
        for(i=0; i<size; i++){
            System.out.print(a[i]+" ");
        }

    }
}
