package Office_Hour;
import java.util.Arrays;
public class CombineTwoArraysRegularForLoop {
    public static void main(String[] args) {

        char[] a1 = {'A', 'B', 'C'}; // i: 0, 1, 2
        char[] a2 = {'D', 'E', 'F', 'G', 'H', 'I', 'J'}; //J: 0, 1, 2, 3, 4, 5, 6

        char[] a3 = new char[ a1.length+a2.length ]; // index:


        int index = 0;

        for(int i = 0; i <= a1.length-1; i++){
            a3[index]  = a1[i];
            index++;
        }


        for(int j = 0; j <= a2.length-1; j++ ){
            a3[index] = a2[j];
            index++;
        }
        System.out.println(Arrays.toString(a3));
    }
}
