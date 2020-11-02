package day18_ForLoop;

public class ForLoopMuhtarsTasks {
    public static void main(String[] args) {
//
//        for(int i=0; i<100; i++){
//            System.out.print(i+" ");
//        }

        //        System.out.println("================================even nums========================================");

//        for(int i=0; i<1000; i++) {
//            if (i % 2 == 0) {
//                System.out.print(i+", ");
//            }
//        }
//
        //        System.out.println("================================odd nums========================================");

//        for(int i=0; i<1000; i++) {
//            if (i % 2 == 1) {
//                System.out.print(i+", ");
//            }
//        }
//
//        System.out.println("================================a to z=========================================");

//        for (char i = 'a'; i <= 'z'; i++) {
//            System.out.print(i+", ");
//        }
//    }

//        System.out.println("================================A to Z=========================================");
//
//        for (char i = 'A'; i <= 'Z'; i++) {
//            System.out.print(i+", ");
//        }
//        System.out.println("==============Do it backword now===========");

// task05:
        for(char ch = 'A'; ch <= 'Z'; ch++){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 65; i <= 90; i++ ){
            char ch = (char)i;
            System.out.print(  ch+" " );
        }

        System.out.println();

        System.out.println("=============================================");

        //task06:
        for(char ch = 'Z'; ch >= 'A'; ch--){
            System.out.print(ch+" ");
        }

        System.out.println();

        for(int i = 90; i >= 65;  i--){
            System.out.print( (char)i +" " );
        }

        System.out.println();


        System.out.println("======================");

        /*
        for(int i = 0; i < 65000; i++){
            System.out.print((char)i +" ");
        }
         */


    }
}
