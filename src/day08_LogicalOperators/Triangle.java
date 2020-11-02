package day08_LogicalOperators;

public class Triangle {
    public static void main(String[] args) {
       double ang1=100;
       double ang2=60;
       double ang3=20;

       boolean valid= ang1+ang2+ang3==180;
       boolean invalid=!valid;

       if(valid){
           System.out.println("Triangle is ="+valid);
       }
       if(invalid){
           System.out.println("Sacmalama lan");
       }

    }
}
