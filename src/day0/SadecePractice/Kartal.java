package day0.SadecePractice;

public class Kartal extends Birds{

    public Kartal(String name, String breed, String color, char gender, int age) {
        super(name, breed, color, gender, age);
    }


    public static void main(String[] args) {

        Kartal kartal1 = new Kartal("Besiktas", "Karakartal", "Black & White", 'M', 100);
        System.out.println(kartal1);
        kartal1.eat();
        kartal1.sleep();
        kartal1.drinks();
    }

}

