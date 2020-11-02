package day21_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        int count = 0;
        while (a > b) {
            a -= b;
            count++;
        }
        System.out.println(a);
        System.out.println(count);
    }
}
