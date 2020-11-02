package day23_Arrays;

public class Array_Practice2 {
    public static void main(String[] args) {


        int[] arr = {10,20, 3,4,5,6,7,-10,-100, 300, 400};
        int min = arr[0];
        int max = arr[0];
        for(int i=0; i<=arr.length-1; i++){
            if(arr[i]>max){
                max = arr[i];
            }
            if(arr[i]<min){
                min = arr[i];
            }
        }
        System.out.println("Max: "+max);
        System.out.println("Min: "+min);
        }
    }

