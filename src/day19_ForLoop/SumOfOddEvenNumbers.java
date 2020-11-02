package day19_ForLoop;

public class SumOfOddEvenNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i += 2) {
            sum += i;
        }
        System.out.println(sum);

        System.out.println("==================================================================");


        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }

        System.out.println(sum);
    }
}

