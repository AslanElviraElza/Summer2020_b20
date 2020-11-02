package day15_String;

public class StringEx3 {
    public static void main(String[] args) {
        String sent3 = "ipek alperen dilek aslan elvira";
        String [] names = sent3.split(" ");
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

        names[0] = names[0].substring(0,1).toUpperCase() + names[0].substring(1);
        names[1] = names[1].substring(0,1).toUpperCase() + names[1].substring(1);
        names[2] = names[2].substring(0,1).toUpperCase() + names[2].substring(1);
        names[3] = names[3].substring(0,1).toUpperCase() + names[3].substring(1);
        names[4] = names[4].substring(0,1).toUpperCase() + names[4].substring(1);

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
        System.out.println(names[4]);

    }
}
