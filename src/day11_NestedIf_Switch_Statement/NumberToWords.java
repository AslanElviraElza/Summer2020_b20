package day11_NestedIf_Switch_Statement;

public class NumberToWords {
    public static void main(String[] args) {
        int num= 8;
        String result= " ";

        if(num==0){
            result = "zero";
        }else if(num==1){
            result="1";
        }else if(num==2){
            result="2";
        }else if(num==3){
            result="3";
        }else if(num==4){
            result="4";
        }else if(num==5){
            result="5";
        }else if(num==6){
            result="6";
        }else if(num==7){
            result="7";
        }else if(num==8){
            result="8";
        }else if(num==9){
            result="9";
        } else {
           result= "Invalid Number";
        }
        System.out.println(result);


    }
}
