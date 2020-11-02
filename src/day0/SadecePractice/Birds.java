package day0.SadecePractice;

public class Birds {
    public String name;
    public String breed;
    public String color;
    public char gender;
    public int age;

    public Birds(String name, String breed, String color, char gender, int age){
        this.name = name;
        this.breed = breed;
        this. color = color;
        this.gender = gender;
        this.age = age;
    }

    public void eat(){
        System.out.println(name+" eats baklava");
    }

    public void drinks(){
        System.out.println(name+ " drinks ayran");
    }

    public void  sleep(){
        System.out.println(name+" is sleeping while listening to Sezen Aksu");
    }


    public String toString() {
        return "Birds{" +
                "name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                ", color='" + color + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }
}
