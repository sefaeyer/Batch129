package day01variables;

public class Variables01 {

    public static void main(String[] args) {

        //Variable oluşturmak
        //Java cümlesi = Statement
        //Java'da eşittir demek "==". Yani matematikte "=", Java'da "=="
        //Java'da "=" "assignment operator   dır. Sağdaki değeri alır soldaki kutuya koyar.
        //Access Modifier yazmazsanız "access modifier" "default" demektir
        //Data Type + Variable Name ==> Variable Declaration
        //Assignment Operator  +  Variable degeri   ==>  Assignment
        //Eger Variable Declaration yapar, Assignment yapmazsaniz Java kendi degerlerini (default) koyar.
        //Default degerler sayilar icin sifirdir.
        //Data Type yazınız    Variable ismi yazınız   Assignment Operator    Variable değeri   ingilizcedeki nokta gibi

                    int                 age                     =                   13                      ;
                    byte weight = 90;


        //Ornek 1: Ogrenci ismi icin variable olusturup deger olarak Ali Can atayiniz.
        //Stringlere verilen degerler cift tirnak icinde olmalıdır.
        //Stringler icin "default value" "null"dir.
        String studentName = "Ali Can";

    /*
       Javada temelde iki tip data vardir;
       1)primitive data type
            char: Tek karakterler icin kullanilir.  A, x, ?, 5,
            boolean: boolean'lar sadece iki farkli deger alabilir; true veya false
            byte: -128 den + 127 ye kadar tam sayi degerleri için kullanilir (1 byte)
            short: -32768 ile 32767 arasındaki tam sayilar icin kullanilir (2 byte)
            int: -2,147,483,648 ile 2,147,483,647 arasindaki sayilar icindir (4 byte)
            long: -9,223,372,036,854,775,808 ile +9,223,372,036,854,775,807 arasında ki sayılar için (8 byte)
            float:
            double:

       2) non-primitive data type

     */

        //Ornek2: char data type inde ilk ismin ilk harfi olarak bir variable olusturunuz ve bir deger atayiniz.
        //Note: char data type inde degerler tek tirnak icine konur.
        char isminIlkHarfi = 'A';
        char favouriteLetter = 'S';
        char favouriteLetter1 = 'G';
        char favouriteLetter2 = 'E';

        //Ornek3: boolean data type inde emekli misin için bir variable olusturun ve false degerini atayin.
        boolean emeklimisin = false;
        boolean soldier = true;

        //Ornek4: byte data type inde ogrenci yasi icin bir valiable olusturunuz ve deger atayiniz
        byte studentAge = 23;
        byte weightOfGoksu = 71;

        //Ornek5: short data type inde site nufusu icin bir variable olusturun
        short siteNufusu = 129;
        short speedOfLambo = 330;

        //Ornek6: int data, ulke nufusu icin variable olusturup deger atamasi yapin
        int countryPopulation = 1236234745;
        int ciroOf2022 = 145689215;

        //Ornek7: long data type inde insan vucudundaki hucre sayisi icin variable olusturup deger atamasi yapin
        //Note: Bir deger long ise sonuna "L" veya "l" konulur.
        long cellNumberInHumanBody = 8765432135678L;
        //Eger long a atadiginiz deger int lerin arasinda ise "L" koymaya gerek yok, deger int olarak algilanip islenir
        long weightOfSun = 1234567;

    }

}
