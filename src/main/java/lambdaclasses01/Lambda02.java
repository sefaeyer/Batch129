package lambdaclasses01;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        List<String> meyve = new ArrayList<>(Arrays.asList("elma","portakal","uzum","cilek","greyfurt","nar",
                                                           "mandalina","armut","elma","keciboynuzu","elma"));

        //========|
        System.out.println("\n  ********");
        ilkHarfeVeyac(meyve);
        System.out.println("\n  ********");
        elemanBasinaVeSonunaYildiz(meyve);
        System.out.println("\n  ********");
        System.out.print(karakterSayGoreBuyKucSirlKarSayEnBuyIlk3(meyve));


    }

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari, Method References ile aralarında bosluk bırakarak yazdıralım
    public static void ilkHarfeVeyac(List<String>meyve){
        meyve.stream().filter(t->t.startsWith("e") || t.startsWith("c")).forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void elemanBasinaVeSonunaYildiz(List<String>meyve){
        meyve.stream().map(t->"*"+t+"*").forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayGoreBuyKucSirlKarSayEnBuyIlk3(List<String>meyve){
        List<String> sonuc = meyve.
                stream().
                sorted(Comparator.comparing(t->t.toString().length()).reversed()).
                limit(3).
                collect(Collectors.toList());
        return sonuc;
    }



}


