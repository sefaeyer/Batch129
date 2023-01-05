package ssg08;

import java.util.Scanner;

public class Ternary01 {

    public static void main(String[] args) {

        // verilen sayi 100'den buyukse sayi’nin karesini  alip yazdiran
        // 100'den kucukse ” sayi 100'den buyuk olmali” yazdiran
        // bir ternary olusturalim


        int sayi = 100;

        System.out.println(sayi>100 ? sayi*sayi: " sayi 100 den buyuk olmali");

        Object str = sayi>100 ? sayi*sayi: " sayi 100 den buyuk olmali";
        System.out.println(str);

        int num = sayi>100 ? sayi*sayi : sayi;
        System.out.println(num);
    }

    // ternary bize sonuc getirdiginden ya sonucu direk yazdirmaliyiz
    // veya bir degoiskene atamaliyiz
    // Eger sonuclar farkli data turlerinde ise
    // atama yapacagimiz variable'in data turu tek olacagindan
    // atama yapamayiz
    // SADECE direk yazdirabiliriz

}
