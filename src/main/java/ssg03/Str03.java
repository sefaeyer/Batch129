package ssg03;

public class Str03 {

    public static void main(String[] args) {

        /*
        soru 5)Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
        karakteri yazdırınız.
        */

        String str = "ahmet furkan  ";
        int sonkarakterIndex = str.trim().length() - 1;
        String boslukolmayansonkarakter = str.substring(sonkarakterIndex, sonkarakterIndex + 1);
        System.out.println(boslukolmayansonkarakter);
    }
}
