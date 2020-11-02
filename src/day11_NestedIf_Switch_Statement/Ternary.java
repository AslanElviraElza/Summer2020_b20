package day11_NestedIf_Switch_Statement;

public class Ternary {
    public static void main(String[] args) {

//        int num=100;
//        String  result= " ";
//
//        if(num%2==0){
//            result="Even";
//        }else {
//            result="Odd";
//        }
//       String result2= (num%2==0)?"Even" :"Odd";
//        System.out.println(result);


        int num1=1011;
        int num2=20;
        int max1=0;

        if(num1>num2){
            max1=num1;
        }else {
            max1=num2;
        }
        System.out.println(max1);

        int max2= (num1>num2) ? num1:num2;
        System.out.println(max2);

        System.out.println("==============================================================");


    }
}
