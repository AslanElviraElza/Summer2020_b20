package day10_IfStatement;

public class CharacterIndentify {
    public static void main(String[] args) {
        char character= 'z';
        boolean isAlphabetic= (character>=65 && character<=90) || (character>=97 && character<=122);
        if(isAlphabetic==true){
            System.out.println(character+ " is alphabetic");
        }
       else {
            System.out.println(character+ " is not alphabetic");
        }


    }
}
