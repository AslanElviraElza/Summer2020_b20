package day06_ComparisonOperators;

public class SalaryCalculator {
    public static void main(String[] args) {

        int rate=55;
        double stateTaxRate = 0.04;
        double federalTaxRate =0.22;
        int weeklyHours = 40;

        double totalTaxRate=(stateTaxRate+federalTaxRate);
        System.out.println(totalTaxRate);

        double hourluRateAfterTax=55-rate*totalTaxRate;
        System.out.println(hourluRateAfterTax);

        double salary=weeklyHours/5*30*hourluRateAfterTax;
        System.out.println(salary);

        double anualIncome=salary*12;
        System.out.println(anualIncome);


    }
}
