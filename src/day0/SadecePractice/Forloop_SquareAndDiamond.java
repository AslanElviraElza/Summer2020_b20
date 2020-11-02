package day0.SadecePractice;

public class Forloop_SquareAndDiamond {
    public static void main(String[] args) {
//     for(int z=0; z<8; z++){
//         System.out.print("* ");
//     }
//        System.out.println();
//
//        for(int i=0; i<6; i++) {
//            System.out.print("* ");
//            for (int j = 0; j < 12; j++) {
//                System.out.print(" ");
//            }
//            System.out.println("* ");
//        }
//        for(int k=0; k<8; k++){
//            System.out.print("* ");
//        }
//


//        for(int i=1; i<=5; i++){
//            for(int j=0; j<i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//
//        }
//        for(int i=4; i>0; i--) {
//            for (int j = 0; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
        System.out.println("Code for diamonds *****");

//        Scanner input = new Scanner(System.in);
//
//        int i, a;
//        System.out.println("Please enter odd number: ");
//        a = input.nextInt();

        int i=0;
        for(i = 1;i <= 7; i = i + 2){
            for(int k = 1;k <= (7-i)/2;k++){
                System.out.print(" ");
            }for(int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int z = (i-4); z >= 1; z = z - 2){
            for(int k = 1;k <= (7-z)/2;k++){
                System.out.print(" ");
            }for(int j = 1;j <= z;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
