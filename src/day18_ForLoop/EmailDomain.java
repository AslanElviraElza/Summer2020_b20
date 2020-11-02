package day18_ForLoop;

public class EmailDomain {
    public static void main(String[] args) {

        String email= "orientalion87@gmail.com";
        int index1= email.indexOf("@");
        System.out.println(index1);

        int index2= email.lastIndexOf(".");
        System.out.println(index2);

       String domain= email.substring(index1+1,index2);
        System.out.println(domain);
    }
}

//    To whomever it may concern!!!
//        You might have come from an IT related field. You might as well have some coding experience. Keep it to yourself. Because no body gives a damn.
//        I have come to know recently that there are classmates here who've tought at university level,
//        who're way better than all of us here(Like Cihan, Hasan and Oguzhan) ; yet they respectfully listen. I suggest we all do the same.