package ssg11;

import java.util.Scanner;

public class NestedIf02 {

    public static void main(String[] args) {

        // Eger calisan kadinsa 60 yasindan buyuk oldugunda emekli olabilir,
        // calisan erkekse 65 yasindan buyukse emekli olabilir

        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi yaziniz " +
                         "\nKadin icin K \nErkek icin E harfini giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        System.out.println("Lutfen yazsinizi giriniz");
        int yas=scan.nextInt();



    }
}
