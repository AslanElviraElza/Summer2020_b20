package day17_StringReview;

import java.util.Scanner;

public class CombineTwoStrings {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        //        3. Ask user to enter two words. Then add them together and print. But if the last letter if the first word and the first letter of the last letter are the same, print that character once.
//                Input:
//                one
//                eight
//        Output:
//        oneight

        /*
        String str1= "One";// for Scanner use str1=scan.next(); to get the word from console
        String str2="eight";// for Scanner use str2=scan.next(); to get the word from console

        char ch1= str1.charAt(str1.length() -1 );
        char ch2= str1.charAt(0);

        if(ch1==ch2){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }

      */

        String str2="One";//scan.next();
        String str1="eight";// scan.next();

        String s1=str1.substring(str1.length()-1);
        String s2= str2.substring(0,1);

        if(s1.equals(s2)){
            System.out.println(str1+str2.substring(1));
        }else{
            System.out.println(str1+str2);
        }
        /*
                Scanner scan = new Scanner(System.in);

                String str1 = scan.next();
                String str2 =  scan.next(); // ight
                // 01234

                // OneTwo
                char ch1 = str1.charAt( str1.length() -1 ); // last char from str1
                char ch2 = str2.charAt(0); //first char from str2

                if( ch1 == ch2  ){
                    System.out.println(str1 + str2.substring(1));  // excluding the first character of the second string
                }else{
                    System.out.println(str1 +str2);
                }
        */

            }
}
