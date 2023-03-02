package lambdaclasses01.freepractice03;

import mini_projects.AppointmentApp.AppointmentApp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {

    public static void main(String[] args) {

    Apartman da01=new Apartman("dogu",1,7000);
    Apartman da02=new Apartman("bati",2,10000);
    Apartman da03=new Apartman("guney",3,12000);
    Apartman da04=new Apartman("dogu",5,15000);

    List<Apartman> daireler = new ArrayList<>(Arrays.asList(da01,da02,da03,da04));

        System.out.println(isAllGreatherThanFiveThousand(daireler));
        System.out.println(" *************");
        System.out.println(isFlatTwo(daireler));
        System.out.println(" *************");
        System.out.println(directionEasts(daireler));
        System.out.println(" *************");
        System.out.println(siralaKatSayisiniaGore(daireler));
        System.out.println(" *************");
        System.out.println(katIkidenFazlaKirayaGoreBuyKucEnBuyKira(daireler));
        System.out.println(" *************");
        System.out.println(katUctenAzKucBuySiralaEnKucKira(daireler));
    }

// SORU1: Tüm dairelerin kira'ları 5000'den buyuk ise return ederek True yazdırın
    public static boolean isAllGreatherThanFiveThousand(List<Apartman> flats){
        Boolean result = flats.
                stream().
                allMatch(t->t.getKira()>5000);
        return result;
    }

// SORU2: Dairelerden En Az Birinin katSayisi 2 ise return ederek True yazdırın

    public static boolean isFlatTwo(List<Apartman> flats){
        Boolean result = flats.stream().anyMatch(t->t.getKatSayi()==2);
        return result;
    }

    //SORU3: Dairelerden cephesi 'dogu' olanların, sayısını return ederek yazdırınız.
    public static long directionEasts(List<Apartman> flats){
        Long easts = flats.stream().filter(t->t.getCephe().contains("dogu")).count();
        return easts;
    }

    //SORU4: Daireleri, katSayisina göre buyukten kucuge sıralayınız.
    // List halinde return ederek yazdırınız.
    public static List<Apartman> siralaKatSayisiniaGore(List<Apartman> flats){
        List<Apartman> sonuc= flats.stream().sorted(Comparator.comparing(Apartman::getKatSayi).reversed()).collect(Collectors.toList());
        return sonuc;
    }

//SORU5: katSayisi 2'den fazla olan daireleri, kiraya gore buyukten kucuge sıralayınız
    // en buyuk kira'sını list halinde return ederek yazdırınız.
    public static List<Integer> katIkidenFazlaKirayaGoreBuyKucEnBuyKira(List<Apartman> flats){
        List<Integer> sonuc= flats.
                stream().
                filter(t->t.getKatSayi()>2).
                sorted(Comparator.comparing(Apartman::getKira).reversed()).
                limit(1).map(t->t.getKira()).
                collect(Collectors.toList());
        return sonuc;
    }

//SORU6: katSayisi 3'den az olan daireleri, kiraya gore kucukten buyuge sıralayınız
    // en kucuk kira'sini list halinde return ederek yazdırınız.
    public static List<Integer> katUctenAzKucBuySiralaEnKucKira(List<Apartman> flats){
        List<Integer> sonuc=flats.stream().
                filter(t->t.getKatSayi()<3).
                sorted(Comparator.comparing(Apartman::getKira)).
                limit(1).
                map(t->t.getKira()).
                collect(Collectors.toList());
        return sonuc;

    }


}
