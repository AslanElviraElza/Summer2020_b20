package day22_NestedLoop;

public class Nested_Loop2 {
    public static void main(String[] args) {
        for(int j=1; j<=7; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("==================================");
        for(int j=7; j>=1; j--) {

            for (int i = j; i>=1; i--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
