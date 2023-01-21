package day29exceptions;

import ssg19.TryExample;

public class Exceptions01 {

    public static void main(String[] args) {

        Object obj = 10;
        String str = "";

        try {
             str = (String) obj;// Birbirine donusturulemeyecek data tiplerini donusturmekte israr ederseniz java classCastException atar.
            // ClassCastException
        }catch(ClassCastException e) {
            System.out.println("Her data type i her data type cevrilmez");
        }
        System.out.println(str);
    }


}
