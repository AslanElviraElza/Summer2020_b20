package day19_ForLoop;

public class BreakStatement {
    public static void main(String[] args) {
        for (int i=0; i <5; i++){
            System.out.println("Hello");
            break;
        }
        System.out.println("===============================================");

        for(char ch = 'A'; ch<='H';  ch++){
            if(ch=='C'){
              break;
            }
            System.out.print(ch+" ");
        }
        System.out.println();
        System.out.println("===============================================");

        for (int i=10; i <=50; i+=10) {

            System.out.print(i + " ");
            if(i==30){
                break;
            }
        }

    }
}
