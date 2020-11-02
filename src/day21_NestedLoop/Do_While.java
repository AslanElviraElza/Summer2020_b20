package day21_NestedLoop;

public class Do_While {
    public static void main(String[] args) {
        boolean result= false;
        while (result){
            System.out.println("Her Biji");
        }
        System.out.println("=========================================================");

        do{
            System.out.println("Her Biji");
        }while (result);
        System.out.println("=========================================================");

        int num= 1;
        do{
            System.out.print(num+" ");
            num++;
        }while (num<=20);
        System.out.println();
        System.out.println("======================A to z backward ===================================");

        char ch='Z';
        do{
            System.out.print(ch+" ");
            ch--;
        }while (ch>='A');


        }

    }

