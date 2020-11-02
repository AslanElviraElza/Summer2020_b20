package day26_MultiDimentionalArrays;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {


        int[][]  nums = { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} };
        //                   0        1      2          3


        // [7,8,9, 10]
        System.out.println(  Arrays.toString( nums[3] ) );
        //  System.out.println(  Arrays.toString( nums[3] ) );

        /*
        {1,2,3}
        {4}
        {5,6}
        [7,8,9, 10]
         */

        for(int i =0; i <= nums.length-1; i++ ){
            System.out.println( Arrays.toString(nums[i] ) );
        }


        // { {1,2,3} ,  {4},  {5,6}, {7, 8, 9, 10} }
        // System.out.println(Arrays.toString(nums));
        System.out.println( Arrays.deepToString(nums));
    }
}
