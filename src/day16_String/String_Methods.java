package day16_String;

public class String_Methods {
    public static void main(String[] args) {

        String email = "OrientaLion87@gmail.com";

        String email2 = email.replace("gmail", "yahoo");

        System.out.println(email2);
        System.out.println("=========================================");

        String word = "Java";
        String word2 = word.replace("a", "e");
        System.out.println(word2);

        System.out.println("=========================================");

        String sentence = "I like to stay in Cybertek, but Cybertek is better";
       String sentence1 =sentence.replace("Cybertek,", "MIT");
        System.out.println(sentence1);

        System.out.println("=========================================");

        String s5= "I like drinking tea and black tea";
        s5= s5.replaceFirst("tea", "coffe");
        System.out.println(s5);

    }
}
