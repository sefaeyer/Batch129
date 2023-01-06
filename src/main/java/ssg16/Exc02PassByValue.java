package ssg16;

public class Exc02PassByValue {

    public static void main(String[] args) {
        //100 tl ayakkabi yaslilara %5 ogrencilere %10 gazilere %30 indirim yapan kodu yaz


        double shoes = 100;

        double ogrenciFiyat = indirim("ogrenci", shoes);
        System.out.println("ogrenciFiyat = " + ogrenciFiyat);

        double yasliFiyat = indirim("yasli", shoes);
        System.out.println("yasliFiyat = " + yasliFiyat);

        double gaziFiyat = indirim("gazi", shoes);
        System.out.println("gaziFiyat = " + gaziFiyat);

        double polisFiyat = indirim("polis", shoes);
        System.out.println("polisFiyat = " + polisFiyat);

        System.out.println("shoes = " + shoes);

    }

    public static double indirim(String durum, double fiyat) {

        switch (durum) {

            case "ogrenci":
                fiyat = fiyat * 0.90;
                break;
            case "yasli":
                fiyat = fiyat * 0.95;
                break;
            case "gazi":
                fiyat = fiyat * 0.70;
                break;

            default:
                fiyat = fiyat;
        }

        return fiyat;

    }

}
