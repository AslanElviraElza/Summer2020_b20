package day35_ArrayList;
/*
    2. write a program that can return the sum of all the digits from a string
            ex:
                input: "a1b2c3"
                output: 6
                    (1+2+3= 6)
            HINT: on ascii table, the characters between #48 ~ #57 are digits
 */
public class SumOfDigits2 {
    public static void main(String[] args) {
        String str = "a1b2c3";
        int sum = 0;

        for(char each  : str.toCharArray() ){
            if(Character.isDigit(each)){
                sum += Integer.parseInt(""+each);
            }
        }
        System.out.println(sum);

    }

    /*
Character:
    isDigit(char): verifies if the char is digit, returns boolean
    isLtter(char): verifies if the char is letter, returns boolean
     */

    }

