package day30_Custom_Methods;
import java.util.Arrays;
public class WarmUpTasks {
    public static void main(String[] args) {
        maxNum(121, 123);
        int arr[]={5,2,3,4,5,6,4,7,0,-5,-54,-55,-5,54,-45,-45,-45 };
        printDesc(arr);


        int[] a1 = {1,2,3,4,5};
        int[] a2 = {6,7,8,9,10,11,12,13,14};
        combine2Arrays(a1, a2);

    }

    // task01:
    public static void maxNum(int a, int b){
        if(a == b){
            System.out.println("Equal");
            return;  // exits the method
        }
        if(a>=b ){
            System.out.println(a+" is maximum");
        }else{
            System.out.println(b+" is maximum");
        }
    }
    //Task02:
    public static void printDesc(int[] arr){  //{10,9,20,30,5,6,7};
        Arrays.sort(arr); // {5, 6, 7, 9, 10, 20, 30};
        for(int i=arr.length-1; i >= 0; i-- ){
            System.out.print(  arr[i]+" " );  // 30 20 10 9 7 6 5
        }
        System.out.println();
    }


    //Task03: {1,2,3] {4,5,6}  ==> {1, 2, 3, 4, 5, 6}
    public static void combine2Arrays(int[] arr1, int[] arr2){
        int[] arr3 = new int[arr1.length + arr2.length];

        int i = 0;
        for(int each  :  arr1){
            arr3[i] = each;
            i++;
        }

        for(int each : arr2){
            arr3[i]= each;
            i++;
        }

        System.out.println( Arrays.toString(arr3));

    }

}
