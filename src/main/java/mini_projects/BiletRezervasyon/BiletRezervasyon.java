package mini_projects.BiletRezervasyon;
/*
Project: mesafeye ve şartlara göre otobus bileti fiyatı hesaplayan uygulama
         Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş)
         koltuk no  bilgilerini alın.
         Mesafe başına ücret 1 Lira / km olarak alın.(Gidiş-Dönüş için *2)
         Tekli Koltuk ücreti:Koltuk numarası 3 veya 3 ün katı ise bilet fiyatı %20 daha fazladır(1.2 Lira).
         İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki kuralları uygulayın ;
         Koltuk numaralari standart tip

        Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
        Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.

       1- Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise son bilet fiyatı üzerinden %20 indirim uygulanır.
       2-Yaş indirimi:
        Kişi 12 yaşından küçükse son bilet fiyatı üzerinden %50 indirim uygulanır.
        Kişi 12-24 yaşları arasında ise son bilet fiyatı üzerinden %10 indirim uygulanır.
        Kişi 65 yaşından büyük ise son bilet fiyatı üzerinden %30 indirim uygulanır.

alinan koltuk tekrar alinmasin
33 numarali koltuk alinamasin.

 */

import java.util.Scanner;

public class BiletRezervasyon {

    public static void main(String[] args) {
//1. adim - Bilet rezervasyonu icin otobus objesine ihtiyacimiz var
        Bus bus = new Bus("34 ASD 78");//"1","2"....
//4. adim - Bilet objesi olusturalim
        Bilet bilet=new Bilet();
        start(bus,bilet);
    }

    public static void start(Bus bus, Bilet bilet){
        Scanner scan= new Scanner(System.in);
        int select;
        do{
            //6. adim - kullanicidan bilgileri alalim
            System.out.println("Bilet Rezervasyon Sistemine Hosgeldiniz...");
            System.out.println("Lutfen gidilecek mesafe bilgisini km olarak giriniz:");
            double distance=scan.nextDouble();
            System.out.println("Lutfen yolculuk tipini giriniz:");
            System.out.println("1. Tek Yon");
            System.out.println("2. Gidis Donus");
            int type=scan.nextInt();
            System.out.println("Lutfen yasinizi giriniz:");
            int age=scan.nextInt();
            System.out.println("Koltuk no seciniz:");
            System.out.println("(Tekli koltuk ucreti %20 daha fazladir.)");
            System.out.println(bus.seats);
            int seat=scan.nextInt();
            //7.adim - secilen koltuk noyu listeden kaldiralim.
            bus.seats.remove(String.valueOf(seat));//"3"=> 1, 2, 4, 5,....
            //8.adim - kullanicidan alinan degerler gecerli mi
            boolean check=type==1 || type==2;
            if(distance>0 && age>0 && check){
                //9.adim - bilet fiyatini hesaplayalim
                bilet.distance=distance;
                bilet.typeNo=type;
                bilet.seatNo=seat;
                bilet.price=getTotal(bilet, age);
                System.out.println("--------------------------------------------");
                bilet.printBilet(bus);
            }else{
                System.out.println("Hatali giris yaptiniz!..");
            }
            System.out.println("Yeni islem icin her hangi bir sayi, cikis icin 0 giriniz:");
            select=scan.nextInt();
        }while(select!=0);
        System.out.println("Iyi gunler");
    }

    private static double getTotal(Bilet bilet, int age) {
        double dist=bilet.distance;
        int type=bilet.typeNo;
        int seat=bilet.seatNo;
        double total=0;
        switch (type){
            case 1:
                if(seat%3==0){
                    total=dist*1.2;
                }else{
                    total=dist*1;
                }
                System.out.println("Tutar: "+total);
                break;
            case 2:
                if(seat%3==0){
                    total=dist*2.4;
                }else{
                    total=dist*2;
                }
                System.out.println("Tutar: "+total);
                total=total*0.8;
                System.out.println("Cift Yon Indirimli Tutar: "+total);
                break;

        }
        if(age<=12){
            total=total*0.5;
            System.out.println("Yas Indirimli Tutar: "+total);
        }else if(age>12 && age<24){
            total=total*0.9;
            System.out.println("Yas Indirimli Tutar: "+total);
        }else if(age>65){
            total=total*0.7;
            System.out.println("Yas Indirimli Tutar: "+total);
        }
        return total;

    }
}
