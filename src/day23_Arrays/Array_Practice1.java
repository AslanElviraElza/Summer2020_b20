package day23_Arrays;

public class Array_Practice1 {
    public static void main(String[] args) {
        String [] students = {"Cybertek", "Asia", "Muhtar", "Nadir"};
        //index =                 0          1       2         3

        String s = students[1];
        System.out.println(s);
        System.out.println("===========================================================");

        String [] names = {"Mike", "Adam", "Tonny", "John", "Amy"};
        int[] scores = {85, 70, 95, 90, 100};
       //  System.out.println( names[0]+ " : "+scores[0]);

        for(int i =0; i<=4; i++){
            System.out.println( names[i]+ " : "+scores[i]);
        }


        System.out.println("===========================================================");


        String [] classMates = new String[5];
        classMates[0] = "Fatih";
        classMates[1] = "ASlan";
        classMates[2] = "Hamit";
        classMates[3] = "Mustafa";
        classMates[4] = "Oguzhan";

        for(int i=0; i<=classMates.length-1; i++){
            System.out.println(classMates[i]);
        }


    }
}
