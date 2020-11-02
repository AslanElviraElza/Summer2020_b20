package day0.SadecePractice;
import java.util.*;
import java.util.Arrays;
import Library.Util;
public class BosKasa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     Integer[] ar1= {1, 2, 3, 4, 5};
     Integer[] ar2= {6, 7, 8, 9, 10};
   //  Integer[] ar3 = Util.combine2Arrays(ar1, ar2);

        Integer[] ar3 = new Integer[ar1.length +ar2.length];

        for(int i=0; i<ar1.length; i++){
            ar3[i]= ar1[i];
            i++;
        }
        for(int i=0; i<ar2.length; i++){
            ar3[i+ar1.length]= ar2[i];
            i++;
        }

        System.out.println(Arrays.toString(ar3));
    }
}




