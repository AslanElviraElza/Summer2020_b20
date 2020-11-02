package day18_ForLoop;

public class Reverse {
    public static void main(String[] args) {

        String str="Java";

        String s1=str.substring(1);//ava
        String s2= str.substring(0,1);//J
        String result = s1+s2;
        System.out.println(result);
        //        5. write a program that can reverse the following string:
//        String str = "Java";
//        output: avaJ
//        please provide two solutions:
//        first solution, you MUST use substring method
//        second solution, you MUST use charAt method
    }
}
