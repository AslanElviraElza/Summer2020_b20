package day08_LogicalOperators;

public class postAndPre {
    public static void main(String[] args) {
        int a=200;
        int b= -a++ + - --a * a--%2;
        System.out.println(b);
    }
}
