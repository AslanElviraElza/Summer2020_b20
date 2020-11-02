package day15_String;

public class substring_Method {
    public static void main(String[] args) {
        String sentence = "Vistanisinin omrusu";
        String word = sentence.substring(13,19);

    int uzunluk = sentence.length();
        System.out.println(word);


        System.out.println("======================================");

        String sentence2= "All man must die";
        String son = sentence2.substring(13,16);

        System.out.println(son);

        System.out.println("======================================");

        String firstName = "MUHTAR";
        String firstName2= firstName.toLowerCase();

        String firstChar = firstName.substring(0,1);
        String remaining = firstName2.substring(1);

       String lastName= firstChar.toUpperCase()+ remaining.toLowerCase();

        System.out.println(lastName);

        System.out.println("======================================");

        String s = "I love Game of thrones";
        String series = s.substring(7);
        System.out.println(series);

        System.out.println("======================================");

        String s2= "I like Java Programing Language";
        String result = s2.substring(7);
        System.out.println(result);


    }
}
