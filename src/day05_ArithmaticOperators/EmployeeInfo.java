package day05_ArithmaticOperators;

public class EmployeeInfo {
    public static void main(String[] args) {
    String firstName="Aslan";
    String lastName="Demir";
    char gender= 'M';
    int age=33;
    String companyName="Maestro";
    String jobTitle="Manager";
    boolean isFullTime=true;
    boolean isMarried=true;
    int salary= 3000_000;

    System.out.println("Employee's full name is:"+ firstName+ " "+ lastName);
    System.out.println(firstName+ " "+ lastName + " gender is :" +gender);
    System.out.println(firstName+ " "+ lastName + " age is :" +age);
    System.out.println(firstName+ " "+ lastName + " works at :" +companyName + " as a "+jobTitle + " with salary of:" + salary);
    System.out.println(firstName+ " "+ lastName + " is a full time" + isFullTime + " and he is " + isMarried);

    }
}
