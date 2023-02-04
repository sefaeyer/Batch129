package lambdaclasses01;

import day36lambda.Utils;

import java.util.*;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5,-8,-12,0,1,12,5,5,6,9,15,8));


        ciftPozitifLamExYazdir(sayi);
        System.out.println("\n  ********");
        ciftPozitifLamMetRefYazdir(sayi);
        System.out.println("\n  ********");
        elemanlarKareleri(sayi);
        System.out.println("\n  ********");
        tekrarsizKareleriAl(sayi);
        System.out.println("\n  ********");
        buyKucSirala(sayi);
        System.out.println("\n  ********");
        pozitifKupBirlerBas5(sayi);
        System.out.println("\n  ********");
        metRefTop(sayi);
        lamExTop(sayi);
        System.out.println("\n  ********");
        System.out.print(pozitifElCarpLamEx(sayi));
        System.out.println("\n  ********");

    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftPozitifLamExYazdir(List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0 ).forEach(t-> System.out.print(t+ " "));
    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftPozitifLamMetRefYazdir(List<Integer> sayi){
        sayi.stream().filter(t-> t%2==0 && t>0).forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    //SORU3 : List elemanlarının karelerini, aralarında bosluk olacak sekilde yazdırın
    public static void elemanlarKareleri(List<Integer> sayi){
    //    sayi.stream().map(t->t*t).forEach(Utils::aralarinaBoslukKoyarakYazdir);
        sayi.stream().map(Utils::kareleriAl).forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void tekrarsizKareleriAl(List<Integer> sayi){
        sayi.stream().map(Utils::kareleriAl).distinct().forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucSirala(List<Integer> sayi){
        sayi.stream().sorted(Comparator.reverseOrder()).forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKupBirlerBas5(List<Integer> sayi){
        sayi.stream().filter(t->t>0).map(t->t*t*t).filter(t->t%10==5).forEach(Utils::aralarinaBoslukKoyarakYazdir);
    }

    // SORU7: List elemanlarının Method References ile toplamını bulun ve yazdırın
    public static void metRefTop(List<Integer> sayi){
        // Integer toplam = sayi.stream().reduce(0,(t,u)->t+u);//Lambda Expression
        int toplam = sayi.stream().reduce(0,Integer::sum);
        System.out.println("toplam Met Ref = " + toplam);
    }

    // SORU8: List elemanlarının Lambda Expression ile toplamını bulun ve yazdırın
    public static void lamExTop(List<Integer> sayi){
        int topl = sayi.stream().reduce(0,(t,u)->t+u);
        System.out.print("toplam Lam Ex = " + topl);
    }

    //SORU9 : Listin pozitif elemanlarının, carpımını Lambda Expression ile return ederek yazdırın
    public static int pozitifElCarpLamEx(List<Integer>sayi){
        int carpim =sayi.stream().filter(t->t>0).reduce(1,(t,u)->t*u);
        return carpim;
    }

}
