package aaaadeneme2;

import java.util.Scanner;

import static aaaadeneme2.HastaneMethods.scan;

public class DoktorIslemleri extends AnaServis {
    Doktor dr = new Doktor();
    private String unvan;

    public void doktorMenü() {
        Scanner scan = new Scanner(System.in);
        int secim = scan.nextInt();

        switch (secim) {
            case 1://Doktor Ekle
                add();

                break;
            case 2://Doktor Listesi Yazdır

                break;
            case 3://Unvandan doktor bulma
                search();

                break;
            case 4://Doktor Silme
                delete();

                break;
            case 5://Ana menü
                doktorMenü();
                break;
            case 6://çıkış

                break;
            default:
                System.out.println("Hatalı giriş yaptınız");
        }

    }

    @Override
    public void add() {
        int counter = 0;
        System.out.println("Lütfen adınızı giriniz");
        Scanner scan = new Scanner(System.in);
        dr.setIsim(scan.next());
        System.out.println("Lütfen soyadınızı giriniz");
        dr.setSoyisim(scan.next());
        System.out.println("Lütfen unvanını giriniz");
        dr.setUnvan(scan.next());
        ekleDoktorListesi();

        dr.doktorlar();
        counter++;
        System.out.println("Başarıyla eklenmiştir...");
        list();
        scan.nextLine();//dummy

    }

    private void ekleDoktorListesi() {
    }

    @Override
    public void search() {
        System.out.println("Lütfen aradığınız öğrencinin kimlik numarasını giriniz: ");
        String unvan = scan.next();
        int counter = 0;

        for (Doktor w : dr.doktorlar) {


            if (w.getUnvan().equals(unvan)) {
                System.out.println(w);
                counter++;
                break;
            }
        }
        if (counter == 0) {
            System.out.println("Girilen unvan ile eşleşen doktor bulunamamıştır");
        } else {
            System.out.println("Doktor başarıyla bulunmuştur");
        }
        scan.nextLine();//dummy
    }

    @Override
    public void delete() {
        System.out.println("Silmek istediginiz doktorun unvanını giriniz: ");
        String deleteUnvan = scan.next();
        int counter = 0;

        for (Doktor w : dr.doktorlar) {

            if (w.getUnvan().equals(deleteUnvan)) {
                dr.doktorlar.remove(w);

                counter++;
                break;
            }
        }
    }

    @Override
    public void list() {
        System.out.printf(  "Name", "Surname", "Unvan");
        System.out.printf(  "----", "-------", "-----");
        for (Doktor w : dr.doktorlar) {
            System.out.printf( w.getIsim(), w.getSoyisim(), w.getUnvan());
        }


    }
}
