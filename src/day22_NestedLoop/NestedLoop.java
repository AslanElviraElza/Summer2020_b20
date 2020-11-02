package day22_NestedLoop;

public class NestedLoop {
    public static void main(String[] args) {


        for(int j=1; j<=5; j++){

            for(int i=1; i<=5; i++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        System.out.println("=======================================");

        for(int j=1; j<=10; j++) {

            for (int i = 1; i <= 5; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
