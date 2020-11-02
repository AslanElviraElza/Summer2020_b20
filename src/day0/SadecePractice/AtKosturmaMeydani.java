package day0.SadecePractice;
import java.util.Scanner;
public class AtKosturmaMeydani {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);

        System.out.println("Enter current count for seniorCitizens and nonSeniorCitizens:");
       int seniorCitizen=    scan.nextInt();
       int nonSeniorCitizen= scan.nextInt();


        System.out.println("What is new citizen's age?");
        int age= scan.nextInt();


        if(age>=65){
            System.out.println("Senior Citizen");
            seniorCitizen++;
        }else{
            System.out.println("Non-Senior Citizen");
            nonSeniorCitizen++;
        }
        System.out.println("New seniorCitizens count: "+seniorCitizen);
        System.out.println("New nonSeniorCitizens count: "+nonSeniorCitizen);
    }
}
