package Day12Switch_Scanner;

public class AgeGroups {
    public static void main(String[] args) {
        int age=129;
        String agegroup=" ";

        if(age>0&&age<150){

            if(age>0&&age<21){
                agegroup="teenage";
            }else if(age>=21&&age<55){
                agegroup="adult";
            }else{
                agegroup="Seniour";
            }

        }else{
            agegroup="invalid";
        }
        System.out.println(agegroup);
    }
}
