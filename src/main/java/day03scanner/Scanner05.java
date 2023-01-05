package day03scanner;

import java.util.Scanner;

public class Scanner05 {

    public static void main(String[] args) {

        //kullanıcıdan bir dikdortgenin iki kenar uzunluğunu alınız
        //i) Alanını hesaplayın
        //ii) Çevresini hesaplayın

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdortgenin kısa kenarını giriniz...");
        Float shortSide = input.nextFloat();

        System.out.println("Dikdortgenin uzun kenarını giriniz...");
        Float longSide = input.nextFloat();

        System.out.println("Alan = " + (shortSide * longSide));

        System.out.println("Cevre = " + (2*shortSide + 2*longSide));





    }
}
