package day0.SadecePractice;

public class ForLoop {
    public static void main(String[] args) {
//        int a=2;
//        int b=200;
//        int i;
//        int sum=0;
//        for(i=b; i>=a; i--){
//            if(i%5==0) {
//                sum=sum+i;
//                System.out.println(i);
//            }
//        }
//        System.out.println(sum);
//
//        int a=10;
//        int b=90;
//        int i=0;
//        int sum=0;
//
//        for(i=b-1; i>a; i-=4 ){
//            sum=sum+i;
//            System.out.println(i);
//        }
//        System.out.println(sum);
        int a =1;
        int b =100;
        int i;
        int count=0;
        int sum = 0;
        if(b>0){
            for(i=b; i>a; i--){
                if(i%2==0){
//                    System.out.println(i+i+"="+(sum));
                    sum=sum+i;
                    count=count+1;
        }

            }
        } else {
            System.out.println("Invalid Number");
        }
        System.out.println(sum);
        System.out.println(count);

    }
}
