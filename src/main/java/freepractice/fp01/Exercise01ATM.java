package freepractice.fp01;

import java.util.Scanner;

public class Exercise01ATM {
    //Example: Atm den para cekme yatirma ve tanimlanan bir ibana para transfer etme
    public static void main(String[] args) {

        /*
            iki tane ismim olacak: Tom Hanks ve Ali Can
            bakiye goruntulemek icin --1
            para cekmek icin --2
            farkli hesaba para transferi icin --3
         */

        Scanner input = new Scanner(System.in);

        String islemSecenekleri = "Bakiye goruntuleme --> 1" +
                "Para cekme -->2" +
                "Farkli hesaba havale icin -->3";


        double tomBakiye = 2450;
        String tomIban = "TR 1345 000 767 985 345 6972 76 45";
        String tomKullanici = "tom12";
        String tomSifre = "123";

        double aliBakiye = 1250;
        String aliIban = "TR 1345 4356 767 985 987 6972 76 45";

        System.out.println("Hosgelsiniz");
        System.out.println("Lutfen bilgileriniz giriniz");

        System.out.println("Kullanici adi giriniz");
        String kullaniciAdi = input.nextLine();
        System.out.println("Sifrenizi giriniz");
        String sifre = input.nextLine();

        if (kullaniciAdi.equals("tom12") & sifre.equals("123")) {
            System.out.println("Tom Hanks hesabina giris yapildi");
            System.out.println(islemSecenekleri);

            System.out.println("Lutfen bir secim yapiniz");
            int secim = input.nextInt();

            switch (secim) {
                case 1:
                    System.out.println("Bakiye = " + tomBakiye);
                    break;

                case 2:
                    System.out.println("Cekmek istediginiz tutari giriniz");
                    int cekilecekTutar = input.nextInt();
                    if (tomBakiye >= cekilecekTutar) {
                        tomBakiye -= cekilecekTutar;
                        System.out.println("Kalan Bakiye = " + tomBakiye);
                    } else {
                        System.out.println("Yeterli bakiye yok");
                    }
                    break;

                case 3:
                    System.out.println("Havale etmek istediginiz tutari giriniz");
                    int yatirilacakTutar = input.nextInt();
                    if (yatirilacakTutar <= tomBakiye) {
                        System.out.println("Lutfen Iban giriniz");
                        input.nextLine();
                        String yatirilacakIban = input.nextLine();

                        if (yatirilacakIban.equals(aliIban)) {
                            System.out.println("Para Ali ye gonderildi");
                            tomBakiye -= yatirilacakTutar;
                            aliBakiye += yatirilacakTutar;
                            System.out.println("Tom Bakiye = " + tomBakiye);
                            System.out.println("Ali Bakiye = " + aliBakiye);
                        }else{
                            break;
                        }

                    }else{
                        System.out.println("Bakiye yetersiz.");
                    }
            }


        } else {
            System.out.println("Kullanici adi veya sifre hatali");
        }


    }
}
