package day28_Recappp;

import java.util.Scanner;

public class FrewuencyOfWord2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a line");
        String sentence =scan.nextLine();


        String result = "";
        for(int j=0; j<sentence.length(); j++){
            int count =0;
            char ch = sentence.charAt(j);

            for(int i=0; i<sentence.length(); i++){
                char each = sentence.charAt(i);

                if( each==ch){
                    count ++;
                }
            }

            if(count ==1){
                result+=ch;

            }
        }
        System.out.print(result+" ");
    }
}


