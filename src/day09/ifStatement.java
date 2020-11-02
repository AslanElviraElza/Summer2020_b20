package day09;

public class ifStatement {
    public static void main(String[] args) {
        int age =15;
        boolean hasID=true;
        boolean eligible = hasID&&age>=21;
        if(eligible==true){
            System.out.println("He is eligible to buy alcohol");
        }
        if(eligible==false){
            System.out.println("Go buy milk");
        }


    }
}
