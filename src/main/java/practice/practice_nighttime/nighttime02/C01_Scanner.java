package practice.practice_nighttime.nighttime02;

import java.util.Scanner;

public class C01_Scanner {

    /*

    TechProEd spor salonu icin kullanicidan isim, soyisim, yas, kilo, boy, salona
    ne kadar devam edecegi ay suresi bilgilerini
    alip aylik 20 $ olarak toplam ucreti yazdiriniz

     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("TechProEd Spor Salonuna Hos Geldiniz....");

        System.out.println("Lutfen Adinizi ve Soyadinizi Giriniz....");

        String tamIsim = input.nextLine();

        System.out.println("Yasinizi Giriniz....");

        byte yas = input.nextByte();

        System.out.println("Lutfen Kilonuzu Giriniz....");

        double kilo = input.nextDouble();

        System.out.println("Lutfen Boyunuzu Giriniz....");

        double boy = input.nextDouble();;

        int aylikUcret = 20;

        System.out.println("Aylik Ucret = "+ aylikUcret + "$");

        System.out.println("Lutfen Uyelik Suresini Giriniz....");

        int aylik = input.nextInt();

        int toplam_tutar = aylikUcret*aylik;

        System.out.println("Toplam Tutar= " + toplam_tutar+ " $");

        System.out.println("Tam Isim = "+tamIsim+ "\nYasiniz : "+yas+"\nKilo : "+kilo+"\nBoy : "+boy+
                "\nUyelik Suresi : "+aylik+" Ay" + "\nToplam Tutar : "+toplam_tutar+ " $");



    }

}
