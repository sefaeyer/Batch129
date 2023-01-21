package freepractice.fp02;

import java.util.Scanner;

public class Exrcise_KahveMaki {

    public static void main(String[] args) throws InterruptedException {

        String KahveCesitleri =
                "1- Dibek Kahvesi\n" +
                        "2- Filtre Kahve\n" +
                        "3- Turk Kahvesi\n" +
                        "4- Espresso\n" +
                        "5- Sutlu Turk Kahvesi";

        System.out.println(KahveCesitleri);
        System.out.println("Icmek istediginiz kahveyi seciniz");
        Scanner input = new Scanner(System.in);
        int kahvesecimi = input.nextInt();

        String seker =
                         "a- sekersiz\n" +
                         "b- az sekerli\n" +
                         "c- orta sekerli\n" +
                         "d- sekerli";
        System.out.println(seker);
        System.out.println("Kahveniz icin seker seciniz...");
        input.nextLine();
        String sekermiktari = input.nextLine();

        String secim = "";

        if (sekermiktari.equalsIgnoreCase("a")) {
            secim = "Sekersiz";
        } else if (sekermiktari.equalsIgnoreCase("b")) {
            secim = "Az Sekerli";
        } else if (sekermiktari.equalsIgnoreCase("c")) {
            secim = "Orta Sekerli";
        } else if (sekermiktari.equalsIgnoreCase("d")) {
            secim = "Sekerli";
        }else{
            System.out.println("Gecersiz seker secimi");
        }

        System.out.println("Sut eklemek ister misiniz");
        String sut=input.next();
        if(sut.equalsIgnoreCase("evet")){
            System.out.println("sut eklendi");
        } else if (sut.equalsIgnoreCase("hayir")) {
            System.out.println("sut eklenmedi");
        }


        switch (kahvesecimi){
            case 1:
                System.out.println("Kahveniz Hazirlniyor...");
                Thread.sleep(5000);
                String bildirim = secim+" Dibek kahveniz hazir\nAfiyet olsun";
                System.out.println(bildirim);
                break;
            case 2:
                System.out.println("Kahveniz Hazirlniyor...");
                Thread.sleep(5000);
                String bildirim2 = secim+" Filtre kahveniz hazir\nAfiyet olsun";
                System.out.println(bildirim2);
                break;
            case 3:
                System.out.println("Kahveniz Hazirlniyor...");
                Thread.sleep(5000);
                String bildirim3 = secim+" Turk kahveniz hazir\nAfiyet olsun";
                System.out.println(bildirim3);
                break;
            case 4:
                System.out.println("Kahveniz Hazirlniyor...");
                Thread.sleep(5000);
                String bildirim4 = secim+" Espresso kahveniz hazir\nAfiyet olsun";
                System.out.println(bildirim4);
                break;
            case 5:
                System.out.println("Kahveniz Hazirlniyor...");
                Thread.sleep(5000);
                String bildirim5 = secim+" Sutlu Turk kahveniz hazir\nAfiyet olsun";
                System.out.println(bildirim5);
                break;
            default:
                System.out.println("Kahve secimi hatali");
        }


    }
}
