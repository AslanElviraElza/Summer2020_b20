package day10_IfStatement;

public class MultiBranch {
    public static void main(String[] args) {

        int num= 100;
        if(num>0){
            System.out.println(num +" is positive");
        }
        else if(num<0){
            System.out.println(num +" is negative");
        }
        else {
            System.out.println(num +" is zero");
        }

    }
}
