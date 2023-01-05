package practice.practice_nighttime.pravticeDTNT;

import java.util.Scanner;

public class C03_Ternary {

    public static void main(String[] args) {

        /*
        Kullanicidan sifirdan buyuk bir tam sayi girmesini isteyin
        Girilen pozitif tam sayi3 basamakli ise ekrana "3 Basamakli" yazdirin
        3 basamakli degilse cift olup olmadigini kontrol edin
        Cift ise "3 Basamakli Olmayan Cift Sayi"
        Cift degilse "3 Basamakli Olmayan Tek Sayi" yazdirin
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pozitif bir tam sayi giriniz");
        int sayi = input.nextInt();

        System.out.println("****** if ile cozumu********");


            boolean sifirdanBuyukUcBas = sayi > 99 && sayi < 1000;
            boolean sifirdanBuyukUcBasOlmayanCift = !(sayi > 99 && sayi == 1000) && sayi % 2 == 0;

        if (sayi > 0) {

            if (sifirdanBuyukUcBas) {
                System.out.println("Sayi 3 Basamakli ");
            } else if (sifirdanBuyukUcBasOlmayanCift) {
                System.out.println("3 Basamakli Olmayan Pozitif Cift Sayi");
            } else
                System.out.println("3 Basamakli Olmayan Pozitif Tek Sayi");


        }else{
            System.out.println("Lutfen Pozitif Sayi Giriniz");
        }

        System.out.println("**********   Turnery   *****");

        boolean sifirdanBuyukUcBasTer = sayi > 99 && sayi < 1000;
        boolean sifirdanBuyukUcBasOlmayanCiftTer = !(sayi > 99 && sayi == 1000) && sayi % 2 == 0;

        // sart  ?   True Act   :   False Act

        //String sonuc = sayi>0   ?  sifirdanBuyukUcBasTer ? ("3 Basamakli Say") : ("Lutfen Pozitif Bir Tam Sayi Giriniz")

    }

}