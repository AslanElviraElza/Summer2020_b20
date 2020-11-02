package day36_ArrayList;
import java.util.ArrayList;
public class Remove_Duplicates {
    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('B');
        list.add('C');
        list.add('C');
        list.add('D');

        System.out.println(list);

        ArrayList<Character>  nonDup = new ArrayList<>();    //{A, B, C, D}

        for(Character each : list){ // 'A', 'A', 'B', 'B', 'C', 'C'

            if( !nonDup.contains(each)){
                nonDup.add(each);
            }

        }


        System.out.println(nonDup);

        System.out.println("=====================================================");

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Cybertek School");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Cybertek");

        System.out.println(list1);
        System.out.println(list2);

        System.out.println( list1.equals(list2) );


        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(10);
        System.out.println( list3.isEmpty() );

    }
}
