package day03scanner;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //kullanıcıdan iki sayı alıp 4 işlem yapan ve işlemlerin sonuçların ekrana yazdıran kodu yazınız

        Scanner input = new Scanner(System.in);

        System.out.println("iki sayı giriniz...");

        double firstNumber = input.nextDouble();

        double secondNumber = input.nextDouble();

        System.out.println(firstNumber + secondNumber);

        System.out.println(firstNumber - secondNumber);

        System.out.println(firstNumber * secondNumber);

        System.out.println(firstNumber / secondNumber);

    }
}
