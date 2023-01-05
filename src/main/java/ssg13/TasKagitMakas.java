package ssg13;

import java.util.Arrays;
import java.util.Scanner;

public class TasKagitMakas {

     /* TASK:
         tas >makas
         makas >kagit
         kagit >tas
    Oncelikle kullanicidan secim alabilmek icin Scanner yapiyoruz.
    Ardindan main fonksiyonumuzda kullanicinin ve bilgisayarin puanlarini tanimliyoruz.
    While dongumuzun icerisinde kullanicidan aldigimiz secimi “secim” isimli degiskene atiyoruz.
    Bilgisayarin secimini ise Math.random methodunu kullanarak aliyoruz.
    Math.random()*3 diyerek bilgisayara 0 ile 3 arasinda bir rastgele sayi urettiriyoruz.
    Ve secimimiz ile bilgisayarin secimini karsilastirip sonuclarini yaziyoruz.
    En sonda da kullaniciya oyuna devam etmek isteyip istemedigini soruyoruz, eger istiyorsa
    dongumuz en bastan calisiyor, istemiyorsa da cikis yapiyor.
     */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String secenekler[] = {"tas", "kagit", "makas"};
        System.out.println("Tas, Kagit, Makas, hangisi???");
        System.out.println("Oyunu sonlandirmak icin 'b' tusuna basiniz ");
        int computerChoice = 0;

        do {
            String playerChoice = input.next().toLowerCase();
            computerChoice = (int) (Math.random() * 3);
            String pcs = secenekler[computerChoice];

            if(playerChoice.equalsIgnoreCase("tas") || playerChoice.equalsIgnoreCase("kagit") ||
                    playerChoice.equalsIgnoreCase("makas")){
                if(playerChoice.equals("tas") && pcs.equals("makas") || playerChoice.equals("makas") && pcs.equals("kagit")
                || playerChoice.equals("kagit") && pcs.equals("tas")){
                    System.out.println("playerChoice = " + playerChoice + " - " + "computerChoice = " + pcs);
                    System.out.println("KAZANDINIZ");
                }else if(playerChoice.equals("makas") && pcs.equals("tas") || playerChoice.equals("kagit") && pcs.equals("makas")
                        || playerChoice.equals("tas") && pcs.equals("kagit")){
                    System.out.println("playerChoice = " + playerChoice + " - " + "computerChoice = " + pcs);
                    System.out.println("KAYBETTINIZ!!!");
                }else{
                    System.out.println("playerChoice = " + playerChoice + " - " + "computerChoice = " + pcs);
                    System.out.println("BERABERE!!!");
                }

            }else if(playerChoice.equals("b")){
                System.out.println("OYUN BITTI!!!");
                break;
            }else{
                System.out.println("Yanlis ifade girdiniz");
            }

        } while (true);

    }

}
