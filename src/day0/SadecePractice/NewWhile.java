package day0.SadecePractice;

public class NewWhile {
    public static void main(String[] args) {
//        int a=11;
//        int b =89;
//        int i=a;
//        int sum=0;
//        while(i<b){
//            sum=sum+i;
//            System.out.println(sum);
//            i+=4;
//        }
//
//        int a=1;
//        int b= 100;
//        int i=a;
//        int sum=0;
//        if(b>0){
//            while(i<=b){
//                sum=sum+i;
//
//                if(sum>1000){
//                    break;
//                }
//                System.out.println(sum);
//                i++;
//            }
//        }
//     else {
//            System.out.println("Invalid Number");
//        }
//
//        int a=2685;
//        int sum=0;
//        int digit=0;
//        while (a>0){
//            digit=a%10;
//         sum= sum*10+digit;
//            a=a/10;
//
//        }
//        System.out.println(sum);

        int a=2685;
        int sum=0;
        int digit=0;
        int i=0;
        for(i=0; i<4; i++){
            digit=a%10;
            sum=sum*10+digit;
            a=a/10;

        }
        System.out.println(sum);
    }
}
