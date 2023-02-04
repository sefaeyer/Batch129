package projeler.proje04_hastane_projesi;

import java.util.Scanner;

public class HastaneRunner {

    public static void main(String[] args) {

//        String hastaDurumu;
//        String unvan;
        giris();


    }

//    private static Hastane hastane1 = new Hastane();

    public static void giris (){
        System.out.println("***QA04 HASTANESI***\n****HOSGELDINIZ****\n");
        System.out.println("Yapmak istediğiniz işlemi seçin: "+
                "\n==> Doktor menüsü için 1'e " +
                "\n==> Hasta menüsü için 2'e " +
                "\n==> Çıkış için 0'e " );
        Scanner scan = new Scanner(System.in);
        int select=scan.nextInt();
        switch (select){
            case 1:
                doktorMenu();
                break;
            case 2:
                hastaMenu();
                break;
            case 0:
                System.out.println("Bizi tercih ettigini icin tesekkur ederiz.\nSaglikli gunler dileriz.\nQA04 HASTANESI");
                break;

        }

    }



    private static void doktorMenu() {
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("***DOKTOR MENÜSÜ***" +
                    "\n" +
                    "\t  1-Doktor Listesi Yazdır\n " +
                    "\t  2-Unvandan Doktor bulma\n " +
                    "\t  3-Ana Menu\n " +
                    "\t  4-Cikis " );

            System.out.println("\nSeçiminiz: ");
            int select=scan.nextInt();

            switch (select) {

                case 1:
            //        this.add();
                    break;
                case 2:
            //        this.list();
                    break;
                case 3:
            //        this.search();
                    break;
                case 4:
            //        this.delete();
                    break;
                case 5:
                    select=0;
                    break;
                case 0:
                    String message = "*** Hastane Yönetim Uygulamamizdan Ayrılıyorsunuz ***";
                    System.out.println();
                    System.out.println("Iyi günler, tekrar bekleriz...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Hatali Giris Yaptiniz...!");
            }


        } while (true);

    }


    private static void hastaMenu() {

    }

}
