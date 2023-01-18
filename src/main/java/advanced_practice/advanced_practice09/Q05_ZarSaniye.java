package advanced_practice.advanced_practice09;

import java.time.LocalTime;
import java.util.Scanner;

public class Q05_ZarSaniye {

    //İki zar atıp sonucunu atıldığı saniyeye göre 2 veya 5 ile çarpıp bilgisayarın puanıyla
    //   karşılaþtıran bir method yazınız.
    //Zarın atıldığı saniye 5'in katı ise zar sayısı 5 ile çarpılıp puana eklenecek, çiftse zar sayısı
    //   iki ile çarpılıp puana eklenecek,tekse zar sayısı puana eklenecek.

    public static void main(String[] args) {

        zarAt();

    }

    public static void zarAt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Zar atmak icin Z giriniz");
        String secim = scan.next();

        if(secim.equalsIgnoreCase("z")){

        }else{
            zarAt();
        }
        int zarOyuncu = (int)(Math.random()*6)+1;
        System.out.println("Zar Oyuncu = " + zarOyuncu);
        int puanOyuncu = 0;

        int saniyeOyuncu = LocalTime.now().getSecond();
        System.out.println("saniyeOyuncu = " + saniyeOyuncu);

        if(saniyeOyuncu%5==0){
            puanOyuncu+=zarOyuncu*5;
        }else if(saniyeOyuncu%2==0){
            puanOyuncu+=zarOyuncu*2;
        }else{
            puanOyuncu +=zarOyuncu;
        }

        System.out.println("puanOyuncu = " + puanOyuncu);

        int zarBilgisayar = (int)(Math.random()*6)+1;
        System.out.println("Zar Bilgisayar = " + zarBilgisayar);
        int puanBilgisayar = 0;

        int saniyeBilgisayar = saniyeOyuncu+1;
        System.out.println("Saniye Bilgisayar = " + saniyeBilgisayar);

        if(saniyeBilgisayar%5==0){
            puanBilgisayar+=zarBilgisayar*5;
        }else if(saniyeBilgisayar%2==0){
            puanBilgisayar+=zarBilgisayar*2;
        }else{
            puanBilgisayar +=zarBilgisayar;
        }

        System.out.println("puan Bilgisayar = " + puanBilgisayar);
    }






    }












