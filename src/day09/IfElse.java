package day09;

public class IfElse {
    public static void main(String[] args) {
        int age=45;
        boolean usCitizen= true;

        if( age>=18 && usCitizen){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not eligible to vote");
        }
    }
}
