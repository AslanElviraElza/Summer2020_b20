package day11_NestedIf_Switch_Statement;

public class Ternary_Practice1 {
    public static void main(String[] args) {

        int age=23;
        String citizen= "USA";
        String  result= " ";

        if(age>=18 &&citizen=="USA"){
            result= "can vote";
        }else{
            result="cant vote";
        }
        System.out.println(result);
        String result2= (age>=18 &&citizen=="USA") ? "can vote":"cant vote";
        System.out.println(result2);

        System.out.println("======================================");

        int a=100;
        int b=200;
        String r= (a==b)? "equal" : "not equal";
        System.out.println(r);
        System.out.println("======================================");

        int num=100;
        String result1= " ";
        if(num>0){
            result1="positive";
        }else if(num<0){
            result1="negative";
        }else{
            result1="zero";
        }
        System.out.println(result1);
        System.out.println("==================================================");
        String result5= (num>0)? "positive":(num<0)?"negative":"zero";
        System.out.println(result5);
        System.out.println("==================================================");
        int as =10;
        int el=20;

        String rslt= (as>el)?"as is greater":(el>as)?"el is greater":"are equal";
        System.out.println(rslt);

    }
}
