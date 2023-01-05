package ssg03;

public class Str02 {

    public static void main(String[] args) {

        /*soru 4)Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
                karakter sayısının toplamını yazdırınız.
        */

        String isim1 = "ahmet furkan";
        String isim2 = "omer faruk";
        String isim3 = "ayse nur";

        int a1 = isim1.replaceAll("\\s","").length();
        int a2 = isim2.replaceAll("\\s","").length();
        int a3 = isim3.replaceAll("\\s","").length();
        System.out.println("toplam bosluksuz karakter sayisi : "+ (a1+a2+a3));

    }
}
