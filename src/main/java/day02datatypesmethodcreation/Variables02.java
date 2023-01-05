package day02datatypesmethodcreation;

public class Variables02 {

    /*
        Non-Primitive Data Types: String, non-primitive data type'dir.
                                  Uretilen her bir class ayni zamanda bir non-primitive data type'dir.
                                  Bu yüzden "non-primitive data type"lar sinirsiz sayidadir denebilir.
                                  Non-primitive data type'larin isimleri buyuk harfle baslar.
                                  Non-primitive data type'larin tamami icin Java memory de aynı miktarda  yer ayirir.

       Interview sorusu: "primitive" ve "non-primitive" data type'lari arasindeki fark nedir?
                         1) "primitive"ler sadece bizim atadigimiz degeri icerir.
                            "non-primitive"ler bizim atadigimiz deger ve method'lar icerir.
                         2) "primitive"ler kucuk harfle baslar, "non-primitive"ler buyuk harfle baslar.
                         3) "primitive"leri Java uretmistir ve 8 tanedir,
                            "non-primitive"leri Java ve developer lar uretir ve sinirisiz sayidadir.
                         4) "primitive"ler memory de data typr ine gore yer kaplar,
                            "non-primitive"ler icin Java memory de hep ayni buyuklukte yer ayirir.

     */
    public static void main(String[] args) {

        //Ornek 1: Sehir ismi icin bir variable olusturun ve bir deger atayip onu ekrana yazdirin
        String cityName = "Adana";

        System.out.println(cityName);

    }


}
