package day07;

public class PozitiveNegativeZero {
    public static void main(String[] args) {
        int a =50;
      //  System.out.println(++a); // =11
      //  System.out.println(a);
      //  System.out.println(a++);//a=10
        //System.out.println(a);//a=11

        a=--a + a++ +a-- + a++;

      int result= 49+ 49 +50+ 49;
        System.out.println(result);
    }
}
