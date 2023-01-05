package day03scanner;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //kullanıcıdan adresini alınız ve ekrana yazdırınız

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");

        //nextLine methodu kullanıcıdan çok kelimeli string almak için kullanılır
        String address = input.nextLine();

        System.out.println(address);

    }
}
