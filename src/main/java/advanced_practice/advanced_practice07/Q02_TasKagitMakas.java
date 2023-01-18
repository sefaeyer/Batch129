package advanced_practice.advanced_practice07;

import java.util.Scanner;

public class Q02_TasKagitMakas {

//           Taş-Kağıt-Makas oyunu yazınız.
//           -Oyuncudan tahmin alınız.
//              -Bilgisayarın tahmini ile karşılaştırınız.
//            -3'e ilk ulaşan kazanır
//            -3 farkla kazanan Altın Skor, 2 farkla kazanan Gümüş Skor, 1 farkla kazanan Bronz Skor ile kazanır.

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int oyuncununKazanmaSayisi=0;
        int bilgisayarinKazanmaSayisi=0;
        int sayac = 0;

        while (oyuncununKazanmaSayisi<3 && bilgisayarinKazanmaSayisi<3 ){
            sayac++;
            System.out.println(sayac+". Secim giriniz: \nTas \nKagit \nMakas");
            String oyuncuTahmini = input.next().toLowerCase().trim();
            if(!(oyuncuTahmini.equals("tas")||oyuncuTahmini.equals("kagit")||oyuncuTahmini.equals("makas"))){
                System.out.println("Gecerli bir tahmin giriniz");
                sayac--;
                continue;
            }

            String[] arrTasKagitMakas = {"tas", "kagit", "makas"};
            int rastgeleIdx =(int) (Math.random()*3);
            String bilgisayarTahmini = arrTasKagitMakas[rastgeleIdx];
            System.out.println("bilgisayar tahmini: "+bilgisayarTahmini);

            if(oyuncuTahmini.equals(bilgisayarTahmini)){
                System.out.println("\nBerabere! Skor: "+oyuncununKazanmaSayisi+"=="+bilgisayarinKazanmaSayisi);
            } else if (oyuncuTahmini.equals("tas")&&bilgisayarTahmini.equals("makas") || oyuncuTahmini.equals("kagit")&&bilgisayarTahmini.equals("tas") ||
            oyuncuTahmini.equals("makas")&&bilgisayarTahmini.equals("kagit")) {
                oyuncununKazanmaSayisi++;
                System.out.println("\nKazandiniz! Skor: "+oyuncununKazanmaSayisi+"=="+bilgisayarinKazanmaSayisi);
            }else{
                bilgisayarinKazanmaSayisi++;
                System.out.println("\nBilgisayar Kazandi! Skor: "+oyuncununKazanmaSayisi+"=="+bilgisayarinKazanmaSayisi);
            }
        }


        System.out.println("\n====Oyun Bitti====");
        String skor;

        if(oyuncununKazanmaSayisi==3){
            if(bilgisayarinKazanmaSayisi==0){
                skor = "Altin";
            }else if(bilgisayarinKazanmaSayisi==1){
                skor = "Gumus";
            }else{
                skor = "Bronz";
            }
            System.out.println(skor + " skor ile kazandiniz. TEBRIKLER!!!");


        }else{
            if(oyuncununKazanmaSayisi==0){
                skor = "Altin";
            }else if(oyuncununKazanmaSayisi==1){
                skor = "Gumus";
            }else{
                skor = "Bronz";
            }
            System.out.println("Bilgisayar "+skor + " skor ile kazandi!!");
        }

    }
}
