package lambdaclasses01.freepractice03;

import java.util.stream.IntStream;

public class Lambda04 {


    public static void main(String[] args) {

        System.out.println(birdenXeToplam(10));
        System.out.println("  *************************");
        System.out.println(birdenXeKadarTekSayilarToplam(5));
        System.out.println("  *************************");
        System.out.println(birdenSonsuzaGidenTekSayilardanXTanesiniTopla(3));
        System.out.println("  *************************");
        System.out.println(ikidenSonsuzaGidenCiftSayilardanXTanesiniTopla(3));
        System.out.println("  *************************");
        System.out.println(bestenSonsuzaKadarGidenKuvvetlerindenXTanesininKuvvetToplami(3));
        System.out.println("  *************************");

    }

//SORU1: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak), toplamını bulup return ederek yazdırınız.
    public static int birdenXeToplam(int x){
        int sonuc = IntStream.range(1,x+1).sum();
        return sonuc;
    }

//SORU2: 1'den x'e kadar int degerleri akısa alınız(x dahil olacak),
// tek sayıların, toplamını bulup return ederek yazdırınız. (x dahil olacak)
    public static int birdenXeKadarTekSayilarToplam(int x){
        int sonuc = IntStream.rangeClosed(1,x).filter(t->t%2!=0).sum();
        return sonuc;
    }

//SORU3: 1'den sonsuza kadar giden Tek sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int birdenSonsuzaGidenTekSayilardanXTanesiniTopla(int x){
        int sonuc =IntStream.iterate(1,t->t+2).limit(x).sum();
        return sonuc;
    }

    //SORU4: 2'den sonsuza kadar giden Çift sayılardan,
    // ilk x tanesini toplayınız sonucu return ederek yazdırınız
    public static int ikidenSonsuzaGidenCiftSayilardanXTanesiniTopla(int x){
        int sonuc =IntStream.iterate(2,t->t+2).limit(x).sum();
        return sonuc;
    }

//SORU5: 5'den sonsuza kadar giden kuvvetlerinden
    // ilk x kuvvetinin toplamını return ederek yazdırınız
    public static int bestenSonsuzaKadarGidenKuvvetlerindenXTanesininKuvvetToplami(int x){
        int sonuc= IntStream.iterate(5,t->t*5).limit(x).sum();
        return sonuc;
    }


}

