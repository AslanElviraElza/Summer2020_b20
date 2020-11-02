package day08_LogicalOperators;

public class PracticeAnd {
    public static void main(String[] args) {
        int age = 19;
        String citizenShip="China";
        boolean eligibleToVote=age>=18&&citizenShip=="USA";

        System.out.println( eligibleToVote);
    }
}
