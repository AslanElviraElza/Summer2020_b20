package day13_Scanner;

public class Browsers {
    public static void main(String[] args) {
        String browserName="opera";

        switch (browserName){
            case "chrome":
                System.out.println("opening chrome browser");
                break;
            case "firefox":
                System.out.println("opening firefox browser");
                break;
            case "opera":
                System.out.println("opening opera browser");
                break;
            case "edge":
                System.out.println("opening edge browser");
                break;
            case "safari":
                System.out.println("opening safari browser");
                break;
            default:
                System.out.println("invalid browser name entered");
        }
        System.out.println(browserName);
    }
}
