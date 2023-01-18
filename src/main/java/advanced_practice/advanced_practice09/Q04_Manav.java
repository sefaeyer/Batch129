package advanced_practice.advanced_practice09;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q04_Manav {
    /*

    Basit bir 5 urunlu manav alisveris programi yaziniz

    1. adim  Urun ve fiyat listesi olustur
    2. adim  Urun listesinden  kod ile urun sectir ve kac kilo oldugunu sor
    3. adim  Musteri her urun sectiginde aldigi urunun fiyatini toplam fiyata ekle
    4. adim  Alisveris bitince odemesi gereken tutari goster
    5. adim  Bsaka bir urun almak isteyip istemedigini sor
             Istemiyorsa odenecek tutari goster istiyorsa tekrar urun sectir
             Bu islemi alisveris bitene kadar tekrarla

     */

    static List<String> urunListesi = new ArrayList<>();
    static double toplamOdeme;
    public static void main(String[] args) {
         urunListesi.add("Domates - Urun Kodu 1 - Fiyati: 20");
         urunListesi.add("Biber - Urun Kodu 2 - Fiyati: 25");
         urunListesi.add("Patates - Urun Kodu 3 - Fiyati: 9");
         urunListesi.add("ELma - Urun Kodu 4 - Fiyati: 15");
         urunListesi.add("Muz - Urun Kodu 5 - Fiyati: 30");

        System.out.println("Urun Listesi = " + urunListesi);
        musteriSecimi();

    }

    public static void musteriSecimi(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun kodu giriniz");
        int kod = scanner.nextInt();
        System.out.println("KG giriniz");
        int kilo = scanner.nextInt();


        toplamOdeme += Integer.parseInt(urunListesi.get(kod-1).split(" ")[urunListesi.get(kod-1).split(" ").length-1])*kilo;

        System.out.println("Toplam Odeme = " + toplamOdeme);

        System.out.println("Alisverise devam etmek icin D, kasa icin herhangi bir karakter giriniz");

        if(scanner.next().equalsIgnoreCase("d")){
            musteriSecimi();
        }else{
            System.out.println("Toplam Odeme = " + toplamOdeme);
            System.out.println("Bizi tercih ettiginiz icin tesekkur ederiz");
        }

    }

}
