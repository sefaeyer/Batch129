package aaaadeneme;

import java.util.Arrays;
import java.util.Scanner;

public class HastaneMethods {

    static VeriBankasi belirti = new VeriBankasi();
    static Scanner scan = new Scanner(System.in);
    static int hastaIDleri = 111;

    public static void giris() {
        System.out.println("***OA04 HASTANESI**");
        VeriBankasi veriBankasi = new VeriBankasi();
     //   System.out.println(Arrays.toString(veriBankasi.doctorIsimleri) );

        System.out.println("Kayitli hasta:1\n       Yeni kayit olacak hasta:2");
        int secim= scan.nextInt();
        scan.nextLine();

        if(secim==1){
            idsecim();
        }else if(secim==2){
            yenikayit();
        }else{
            System.out.println("Gecerli islem giriniz lutfen");
        }

    }
    public static void idsecim(){
        VeriBankasi veriBankasi = new VeriBankasi();
        System.out.println("Lutfen ID numaranizi girirniz");
        int hts = scan.nextInt();
        if (hts == hastaIDleri){
            belirtiler();

        }else System.out.println("yanlis id girdiniz lutfen tekrar deneyiniz");
        idsecim();
    }

    private static void yenikayit(){
        System.out.println("Lutfen isim ve soyisim gririniz");
        String isim=scan.next().toUpperCase();
        String soyisim=scan.next().toUpperCase();
        Hasta yeniHasta=new Hasta(hastaIDleri,isim,soyisim);

//        if(!hastaListesiMap.containsKey(hastaIDleri)){
//            hastaIDleri++;
//            hastaListesiMap.put(hastaIDleri,yeniHasta);
//            belirtiler();
//        }
    }

    public static void belirtiler(){

//        hastaliklar();
//        String sikayet=scan.nextLine();
//
//        if(doktorListesiMap.containsKey(sikayet)){
//            System.out.println("Doktora yonlendiriliyorsunuz :  ");
//            System.out.println(hastaListesiMap.get(hastaId));
//            System.out.println(doktorListesiMap.get(sikayet));
//
//            System.out.println("Cikis icin 0'a basiniz");
//            int cikis=scan.nextInt();
//
//            if (cikis==0){
//                System.out.println("cikis yapildi");
//                System.exit(0);
//            }
//        }else{
//            System.out.println("hatali giris yaptiniz");

//        }

//        public static void hastaliklar(){
//            scan.nextLine();
//            System.out.println("Lutfen size uygun olan hSTALIGI asagidaki gibi yaziniz");
//            System.out.println("Bas agrisi // alarjioi // Diabet // flu /// Migren /// Kalp Hastaliklari");
//        }

   }
}