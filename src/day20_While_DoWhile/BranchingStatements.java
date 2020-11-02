package day20_While_DoWhile;

public class BranchingStatements {
    public static void main(String[] args) {

        char ch = 'A';

        while (ch<='E'){
            if(ch=='C'){
                ch++;
                continue;
            }
            System.out.println(ch);
            ch++;
        }
    }
}
