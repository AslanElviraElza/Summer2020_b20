package day17_StringReview;

public class String_Methods {
    public static void main(String[] args) {


        System.out.println("char");

        String str="Cybertek";
        char chr1= str.charAt(3);
        System.out.println(chr1);

        System.out.println("+++++++++++++++++++concat+");

        String str2= "Cybertek";
        str2= str2+" School";
        System.out.println(str2);

        System.out.println("++++++++++++++++++length");
//        length will return you int
//        lastindex of "Cybertek"= str3.length-1
        String str3= "Cybertek";
        int l=str3.length();
        System.out.println("length is "+l);

        System.out.println("=================toupercase and tolowercase");
        String str4= "cybertek";
       str4= str4.toUpperCase();
        System.out.println(str4);

        String str45= "JAVA";
        str45= str45.toLowerCase();
        System.out.println(str45);

        System.out.println("=====trim spaces infront and after/ not btween the words=========");

        String str5= "                 JAVA is super FUNNNNNN";
        str5= str5.trim();
        System.out.println(str5);


        System.out.println("=====Substring==Yada herhangibir index numarasini ver Intellij gerisini yazar sonuna kadar");

        System.out.println("=====Substring======Mesela sunstring(12) dersek bize language yazar");
        String str6= "I like JAVA Language";
        str6=str6.substring(7,11);
        System.out.println(str6);


        System.out.println("=====indexOf&& lastIndexOf for returning index as int========");
        String str7= "I like JAVA Language. Its Wonderfull";
       int i1= str7.indexOf("W");

        System.out.println(i1);
        int i2= str7.indexOf(". I");
        System.out.println(i2);
//        System.out.println(str7.charAt(i1)); bu yontem bize dogrulama sansi veriyor

        String str8= "Java JAVA java ";
        int i4=str8.lastIndexOf("j");
        System.out.println(i4);

        System.out.println("=====replace &&replaceFirst=============================");
        String str9= "Java is a programming language";
        str9= str9.replace("Java","C#");
        System.out.println(str9);

        String str10= "I like Java, Java is a programming language";
       str10 = str10.replaceFirst("Java","C#");
        System.out.println(str10);

        System.out.println("=====equals=============================");
        String str11="CAT";// in the pool//false
        String str12=new String("CAT");//in the heap//true
        String str13= new String("CAT");//true


        System.out.println(str11==str12);
        System.out.println(str11.equals(str12));
        System.out.println(str12.equals(str13));

        //equalIgnoreCase
        String s4= "Java";
        String s5= "Java";
        System.out.println(s4==s5);
        System.out.println(s4.equalsIgnoreCase(s5));


        System.out.println("=====isEmpty=============================");
        String str14= " ";
        System.out.println(str14.isEmpty());

        str14=str14.trim();//""
        System.out.println(str14.isEmpty());


        System.out.println("=====contain=============================");
        String str15= "Java is a programming language";
        System.out.println(str15.contains("Java"));//true
        System.out.println(str15.contains("java"));//false bcs its lover case
        System.out.println(str15.toLowerCase().contains("java")); //true

        System.out.println("=====startsWith &&endsWith=============================");
        String s16= "Java is a programming language";
        System.out.println(s16.startsWith("Ja"));
        System.out.println(s16.endsWith("e"));
    }
}
