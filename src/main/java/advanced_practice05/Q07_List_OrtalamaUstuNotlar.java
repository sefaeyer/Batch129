package advanced_practice05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Q07_List_OrtalamaUstuNotlar {

    // Bir öğretmenden girmek istediği kadar notu alınız, ve ortalamayı geçen öğrenci sayısını bulunuz.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();
        int sayac = 0;
        String karar;


        do{
            sayac++;
            System.out.println(sayac+". notu giriniz..");
            notlar.add(input.nextDouble());
            System.out.println("Cikmak icin H, yeniden not girmek icin herhangi bir karakter giriniz..");
            karar = input.next();


        }while(!karar.equalsIgnoreCase("H"));
        System.out.println("notlar = " + notlar);

        //Ortalamayi hesapla

        double toplam = 0;
        for(double w : notlar){
            toplam+=w;

        }

        double ortalama = toplam / notlar.size();
        System.out.println("ortalama = " + ortalama);

        //Ortalama ustu not sayisini bul
        int ortalamaUstuNotSayisi = 0;
        for (double w: notlar){
            if(w>ortalama){
                ortalamaUstuNotSayisi++;
            }
        }
        System.out.println("ortalamaUstuNotSayisi = " + ortalamaUstuNotSayisi);


    }

}
