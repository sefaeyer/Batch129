package day03scanner;

import java.util.Scanner;

public class Scanner06 {

    public static void main(String[] args) {

        //Kullanıcıdan 5 basamaklı
        //bir sayının ilk iki ve son iki basamağındaki rakamların toplamını yazdırınız
        //38761
        Scanner input = new Scanner(System.in);

        System.out.println("5 basamaklı bir sayı giriniz...");

        int number = input.nextInt();

        //Son rakamı al
        int lastDigit = number%10;
        number = number/10;

        //sondan ikinci
        int lastSecondDigit = number%10;
        number = number/10;

        //sondan üçüncü
        int lastThirdDigit = number%10;
        number = number/10;

        //sondan dördüncü
        int lastFourthDigit = number%10;
        number = number/10;

        //sondan beşinci
        int lastFifthDigit = number%10;

        System.out.println(lastDigit + lastSecondDigit + lastFourthDigit + lastFifthDigit);





    }
}
