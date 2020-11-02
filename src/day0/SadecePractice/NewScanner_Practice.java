package day0.SadecePractice;

import java.util.Scanner;

public class NewScanner_Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Enter your car info: ");
//        System.out.println("Brand: ");
//
//        String brand = scan.nextLine();
//
//        System.out.println("Model: ");
//        String model = scan.nextLine();
//
//        System.out.println("Year: ");
//        int year=scan.nextInt();
//
//        System.out.println("Color: ");
//        String color = scan.nextLine();
//
//        scan.nextLine();
//        System.out.println("Millage: ");
//        int millage = scan.nextInt();
//
//        System.out.println("Price: ");
//        double price = scan.nextDouble();
//        scan.close();
//        System.out.println(year+" "+brand+" "+model+" "+color+", "+millage+" miles, "+price+" dollars");




//        System.out.println("Second question ");
//
//        System.out.println("Enter your campony name: ");
//        String companyName = scan.nextLine();
//
//        System.out.println("Enter your firt name: ");
//        String firstName = scan.nextLine();
//
//        System.out.println("Enter your last name: ");
//        String lastName = scan.nextLine();
//
//        System.out.println("Enter your job title: ");
//        String jobTitle = scan.nextLine();
//
//        System.out.println("Enter your salary: ");
//        double salary = scan.nextDouble();
//
//        System.out.println(companyName+", "+firstName+", "+lastName+", "+jobTitle+", "+salary);



        System.out.println("Scanner 3rd question");




        System.out.println("Enter your building number: ");
        int buildingNumber= scan.nextInt();

        scan.nextLine();
        System.out.println("Enter your street name: ");
        String streetName= scan.nextLine();

        System.out.println("Enter your road name: ");
        String roadName= scan.nextLine();

        System.out.println("Enter your city name: ");
        String cityName= scan.nextLine();

        System.out.println("Enter your state: ");
        String state= scan.nextLine();

        System.out.println("Enter your zip code: ");
        int zipCode= scan.nextInt();

        String fullAdress=buildingNumber+streetName+roadName+cityName+state+zipCode;
        System.out.println(fullAdress);



    }
}
