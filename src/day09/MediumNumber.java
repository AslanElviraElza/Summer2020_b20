package day09;

public class MediumNumber {
    public static void main(String[] args) {
        double a = 100;
        double b = 200;
        double c = 150;
        double Medium=0;

        boolean aIsMed= (a>b && a<c) || (a>c && a<b);
        boolean bIsMed= (b>c && b<a) || (b<c && b>a);
        boolean cIsMed= !bIsMed&&!bIsMed;

        if(aIsMed){
            Medium=a;
        }
        if(bIsMed){
            Medium=b;
        }
        if(cIsMed){
            Medium=c;
        }
        System.out.println(Medium+" is the medium number");
    }
}
