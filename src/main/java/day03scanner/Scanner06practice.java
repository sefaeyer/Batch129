package day03scanner;

import java.util.Scanner;

public class Scanner06practice {

    public static void main(String[] args) {

        //Kullanıcıdn 5 basamaklı
        //bir sayınıın ilk iki ve son ihi basamağınındaki rakamların toplamını yazdırınız
        //38761

        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz");

        int number = input.nextInt();

        int lastDigit = number%10;
        System.out.println(lastDigit);


    }

}
