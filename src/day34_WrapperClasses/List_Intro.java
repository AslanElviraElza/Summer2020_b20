package day34_WrapperClasses;
import java.util.ArrayList;
public class List_Intro {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95);  // autoBoxing  0
        scores.add(100);        //      2
        scores.add(85);         //      3
        scores.add(75);        //      4
        scores.add(1, 65);  //1


        // scores.add(6, 55);

        System.out.println( scores );

        // 100:
        System.out.println( scores.get(2) );

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.add("Milk");
        groceryList.add("Apple");
        groceryList.add("Eggs");
        groceryList.add("Mango");
        groceryList.add("Ice Cream");

        for(int i= groceryList.size()-1;  i >= 0; i-- )  {
            System.out.print( groceryList.get(i) +"   ");
        }
        System.out.println();

        for( String each : groceryList ){
            System.out.print(each+"   ");
        }


    }

}

