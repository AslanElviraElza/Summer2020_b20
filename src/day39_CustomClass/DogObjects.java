package day39_CustomClass;

public class DogObjects {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setDogInfo("Siwan", "Van Kangali", "Large", 2, "White");
        dog2.setDogInfo("Lory","Maltese","small", 2, "white");
        dog3.setDogInfo("Winston", "Scotties Terrier", "Small", 1, "Black");

        dog1.getDogInfo();
        dog2.getDogInfo();
        dog3.getDogInfo();

        dog1.eat("Kelle Paca");
        dog3.eat("Steak");
        dog2.eat("polo");


        dog3.drink("cola");
        dog1.drink("milk");
        dog2.drink("redbull");

        dog1.sleep();
        dog2.sleep();
        dog3.sleep();





    }
}
