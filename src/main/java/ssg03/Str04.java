package ssg03;

public class Str04 {

    public static void main(String[] args) {

        /*
        soru 6) Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
        */

        String sehirIsmi = "  aDANA  ";
        String str = sehirIsmi.trim().toLowerCase();
        str=str.substring(0,1).toUpperCase()+str.substring(1);
        System.out.println(str);
    }
}
