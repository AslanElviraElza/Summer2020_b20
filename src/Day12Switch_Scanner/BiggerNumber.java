package Day12Switch_Scanner;

public class BiggerNumber {
    public static void main(String[] args) {
        double num1= 1050;
        double num2= 200;
        double num3= 3050;
        boolean num1IsBigger= num1>num2 && num1> num3;
        boolean num2IsBigger= num2>num1 && num2> num3;
        String result="";

        String result2= num1IsBigger?"num1 is bigger":num2IsBigger?"num2 is bigger":"num3 is bigger";

//        if(num1IsBigger){
//            result="num1 is bigger";
//        }else if(num2IsBigger){
//            result="num2 is bigger";
//        }else //(!num1IsBigger&&!num2IsBigger){
//        { result="num3 is bigger";
//        }
        System.out.println(result2);
    }
}
