package day09;

public class Maximum {
    public static void main(String[] args) {
        double a= 500;
        double b= 200;
        double c= 1000;
        double Max=0;
//        String d=" is the maximim number";
        boolean aIsMaximum = a>b&& a>c;
        boolean bIsMaximum = b>a&& b>c;
        boolean cIsMaximum = c>b&& c>a;
        if(aIsMaximum==true){
            Max=a;
//            System.out.println(a);
        }
        if(bIsMaximum==true){
            Max=b;
//            System.out.println(b);
        }
        if(cIsMaximum==true){
            Max=c;
//            System.out.println(c);

            System.out.println(Max+ " is the maximuum number");
        }

    }
}
