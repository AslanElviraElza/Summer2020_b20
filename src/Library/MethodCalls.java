package Library;

public class MethodCalls {
    public static void main(String[] args) {
        String str = "aaaabbbbbbbbcccccccccc";
        String str2 = Util.removeDup(str);

        System.out.println(str2);
        System.out.println("==================================================================");

        int[] numbers = {10, 9, 111, 20000, 10, 30, -100, -200};

        maxNum(numbers);
        minNum(numbers);

    }



    public static void maxNum(int[] arr){
        int max = arr[0];

        for( int each : arr ){
            if(each > max){
                max = each;
            }
        }

        System.out.println("Max: "+max);
    }


    public static void minNum(int[] arr){
        int min= arr[0];

        for( int each : arr ){
            if(each < min){
                min = each;
            }
        }

        System.out.println("Min: "+min);

        System.out.println("============================================");
        String str = "ababababababcccccccccddddddddeeeeee";
        //"abcde"

        removeDup(str);

    }



    public static void removeDup(String str){  //"abab"
        String nonDup = ""; //"ab"

        //[a, b, a, b]
        for( String each : str.split("") ){
            if( !nonDup.contains(each) ){
                nonDup += each;
            }
        }

        System.out.println(nonDup);

    }
    }
