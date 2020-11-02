package day44_Constructor;

public class StudentObjects {
    public static void main(String[] args) {

        Student student1 = new Student("Aslan", 33, 'M');
        Student student2 = new Student("Zeki", 30, 'M');
        Student student3 = new Student("Selman", 35, 'M');

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(student3);


    }
}
