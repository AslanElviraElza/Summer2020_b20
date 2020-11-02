package day25;

public class For_Each_ShortestWord {
    public static void main(String[] args) {
        String[] arr = {"Anam", "Nickolas", "Amir", "Nurmamet", "Abuduljabar", "mamattursun"
                , "Gebremariam", "VasilicaPutulica"};

        int maxLength = arr[0].length();


        for (String each : arr) { // to find max length (index)
            if (each.length() > maxLength) {
                maxLength = each.length();
            }
        }

        System.out.println(maxLength);

        for (String each : arr) {
            if (each.length() == maxLength) {
                System.out.println(each); // This will give u longest word in the array
            }
        }
    }
}
