package day03scanner;

import java.util.Scanner;

public class Scanner02 {

    public static void main(String[] args) {

        //Kulanıcıdan ilk ismini ve soy ismini alıp ikisini aynı satırda ekrana yazdırınız

        Scanner input = new Scanner(System.in);

        System.out.println("ilk isminizi giriniz...");
        String firstName = input.next();
        //next() method kullanıcıdan tek kelimeli string almak için kullanılır
        System.out.println("soyisminizi giriniz...");
        String lastName = input.next();

        System.out.println(firstName + "  " + lastName);


    }
}
