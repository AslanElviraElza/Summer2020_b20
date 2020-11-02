package Day12Switch_Scanner;
import java.sql.SQLOutput;
import java.util.Scanner;
public class RateCalculator {
    public static void main(String[] args) {
        Scanner calc = new Scanner(System.in);

        System.out.println("Enter your salary ");
        double salary = calc.nextDouble();

        System.out.println("How many hour do you work in a week");
        int totalHours= calc.nextInt();

        double hourlyRate= salary/totalHours;
        System.out.println("Your hourly rate is: $"+ hourlyRate);
    }
}
