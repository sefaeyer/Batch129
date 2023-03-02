package mini_projects.AracSigortaApp;


import java.util.InputMismatchException;
import java.util.Scanner;

/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk
       Tarife dönemi:Aralık 2022,Haziran 2022

       1.dönemi  Haziran 2022                 2.dönem  Aralik 2022
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        Hatalı girişte hesaplama başarısız uyarsı verip tekrar menü gösterilsin.
 */
public class AracSigortaApplication {

    public static void main(String[] args) {

        start();


    }

    public static void start(){
        Scanner inp = new Scanner(System.in);
        boolean isFail;//hesaplamanin durumunu kontrol etmek icin bir flag kullanalim
//hatali giriste veya yeni islem  secenegi icin menu tekrar gosterilsin istiyorum
        do {
            isFail=false;
            System.out.println("---Zorunlu Sigorta Primi Hesaplama---");
            System.out.println("Tarife Donemi Seciniz:");
            System.out.println("1. Haziran 2022");
            System.out.println("2. Aralik 2022");
            //exception handle etme
            int term = 0;
            try {
                 term = inp.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Gecersiz giris, lutfen sayi giriniz.");
            }
            inp.nextLine();
            //girilen donem gecerli mi?
            if(term==1 || term==2){
                Arac arac=new Arac();
                String termName=term==1 ? "Haziran 2022" : "Aralik 2022";
                System.out.println("Arac Tipinin Giriniz");
                System.out.println("otomobil, kamyon, otobüs, motosiklet");
                String select =inp.next();
                arac.type=select;
                arac.countPrim(term);
                if(arac.prim>0) {

                    System.out.println("Hesaplama islemi basariyla tamamlandi.");
                    //sonucu yazdirabiliriz.
                    System.out.println("Arac Tipi: " + arac.type);
                    System.out.println("Tarife Donemi: " + termName);
                    System.out.println("Aracinizin Ilgili Donem Sigorta Primi: " + arac.prim);
                    isFail = isAgain(inp);
                }else{
                    System.out.println("Hesaplama basarisiz, tekrar deneyiniz!!!");
                    isFail= isAgain(inp);
                }

            }else {
                System.out.println("Hatali giris!!!");
                isFail=true;
            }



        }while (isFail);
        System.out.println("Iyi gunler dileriz...");

    }

    private static boolean isAgain(Scanner inp) {
        boolean isFail;
        System.out.println("Yeni Islem icin 1, cikis icin her hangi bir sayi giriniz");
        int choice = inp.nextInt();
        if (choice == 1)
            isFail = true;
        else
            isFail = false;
        return isFail;
    }


}
