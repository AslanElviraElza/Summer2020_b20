package day18_ForLoop;

public class Initials {
    public static void main(String[] args) {

        String firstNmae="aslan";
        String lastName="demir";

        firstNmae.substring(0,1);
       lastName.substring(0,1);
        String initials =    firstNmae.substring(0,1)+lastName.substring(0,1);
        initials= initials.toUpperCase();
        System.out.println(initials);



//        4. write a program that asks user's first and last name, then prints out the initials of the user
//
//        input:
//        cybertek
//                batch18
//        output:
//        your initial is: CB
//        DO NOT use charAt method
    }
}
