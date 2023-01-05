package day02datatypesmethodcreation;

public class Variables01 {

    //primitive data types --> char - boolean - byte - short - int - long - float - double
    //float: virgullu sayilar (ondalıklı sayılar - decimal numbers) icin kullanilir. Memory de daha az yer kaplar. (fiyatlandırmalarda kullanılır: 12,99)
    //double: virgullu sayilar (ondalıklı sayılar - decimal numbers) icin kullanilir. Memory de daha cok yer kaplar (Hucrenin agirligi hakkinda : 0.0000000000112)

    //Note1: primitive data type'larını Java olusturur, biz olusturamayiz.
    //Note2: primitive data type isimleri kucuk harflarle yazilir.
    //Note3: primitive data'lar, data type'lara gore memory de farkli farkli yer kaplar.
    //Note4: primitive data'lar iclerinde sadece sizin atadiginiz degeri barindirirlar.

    public static void main(String[] args) {

        //Ornek1: Gomlek ve ayakkabi fiyatlari icin 2 tane variable olusturup toplam fiyati ekrana yazdiriniz.
        //Note: Java "Decimal Numbers" ı double kabul eder. Siz data type ini "float" yaz<arsaniz hata verir.
        //      float olmasinda israr ediyorsaniz sonuna "F" veya "f" koymalisiniz.
        //      float memory de 4 byte yer kaplar, double 8 byte yer kaplar.
        float shirtPrice = 12.99F;
        float shoesPrice = 15.89F;
        //System.out.prinln() ekrana yazdırır ve pointer ı bir sonraki satıra koyar
        //System.out.print() ekrana yazdırır ve pointer ı bir aynı satırda tutar
        System.out.println(shirtPrice + shoesPrice);

        //System.out.println() yazdirmanin kısa yolu ==> sout yaz enter a bas
        System.out.println();

        //Ornek2: Hucre agirligi ve Amipin agirligi icin iki tane variable olusturun ve agırlıkları farkını ekrana yazdırın
        double weightCell = 0.0000000000112;
        double weightAmip = 0.0000000000023;

        System.out.println(weightCell - weightAmip);//8.9E-14 ==> "8.9 carpi 10 uzeri -12" "E==> Exponent"



    }
}
