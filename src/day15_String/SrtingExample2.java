package day15_String;

public class SrtingExample2 {
    public static void main(String[] args) {

   /*     String sentence = "aslan bilgisayar piskopati olacak";
        System.out.println("sentence length: " + sentence.length());

        String word1 = sentence.substring(17, 25);
        System.out.println("word1: " + word1);

        String word2 = word1.substring(0, 1).toUpperCase() + word1.substring(1);
        System.out.println("word2 : " + word2);

        System.out.println("==================================================");*/
        String sent2 = "ipek alperen dilek";
        System.out.println(sent2.length());

        String name1 = sent2.substring(0, 4);
        String name2 = sent2.substring(5, 12);
        String name3 = sent2.substring(13, 18);

        System.out.println(name1.substring(0, 1).toUpperCase() + name1.substring(1));
        System.out.println(name2.substring(0, 1).toUpperCase() + name2.substring(1));
        System.out.println(name3.substring(0, 1).toUpperCase().concat(name3.substring(1)));


    }
}
