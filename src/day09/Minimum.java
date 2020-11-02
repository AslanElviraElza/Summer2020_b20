package day09;

public class Minimum {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 300;
        double Min=0;
        boolean aIsMin = a <b && a<c;
        boolean bIsMin = aIsMin==false && b<c;
        boolean cIsMin = !aIsMin && !bIsMin;

        if(aIsMin){
            Min=a;
        }
        if(bIsMin){
            Min=b;
        }
        if(cIsMin){
            Min=c;
        }
        System.out.println(Min+" is the minimum number");

    }
}
