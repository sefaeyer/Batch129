package day06stringmanipulationsifstatement;

public class StringManipulations01 {

    public static void main(String[] args) {

        //Example 1: Bir string in bas ve sonunda "space" karakteri vars siliniz.
        //          "  Ali Can   "  ==> "Ali Can"

        String s = "   Ali Can   ";
        System.out.println(s);

        //trim() methodu bir string in bas ve sondaki space karakterlerini siler, aradakilere dokunmaz.
        String sTrimmed = s.trim();
        System.out.println(sTrimmed);

        //Example 2: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
        //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98

        String tv1 = "$456.99";
        String laptop1 = "$875.99";

        String tv2 = tv1.replace("$","");
        System.out.println(tv2);// 456.99 ==> Ondalik sayilar Java'da otomatik olarak double kabul edilir.

        String laptop2 = laptop1.replace("$","");
        System.out.println(laptop2);

        Double totalPrice = Double.valueOf(tv2) + Double.valueOf(laptop2);
        System.out.println("$" + totalPrice);//1332.98

        //Example 3: Verilen ismin ilk isminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "Ali Can" ==> AC

        String name = "   ali cAN   ";

        char first = name.trim().toUpperCase().charAt(0);

        char second = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" + first + second);

        //Example 4: Bir string in hic karakter icermedigini (bos string) kontrol eden kodu yaziniz.

        String str = "";

        //1. Yol: length() kullan
        boolean result1 = str.length()==0;
        System.out.println("String bos mu? " + result1);// true

        //2. Yol: isEmpty() kullan. Java bir konuda method uretmisse o methodu kullanmak en iyisidir.
        boolean result2 = str.isEmpty();
        System.out.println("String bos mu? " + result2);

        //Example 5: Bir string in space haric hic bir karakter icermedigini kontrol eden kodu yaziniz.

        String t = "     ";

        //1. Yol:
        boolean result3 = t.replace(" ", "").length()==0;
        System.out.println("Sadece space mi var? " + result3);

        //2. Yol:
        boolean result4 = t.replace(" ", "" ).isEmpty();
        System.out.println("Sadece space mi var? " + result4);

        //3. Yol:
        //Note: isBlank() methodu sadece space iceren string ler icin tru verir, space disinda karakter varsa false verir.
        //      isBlank() methodu bos stringler icin de true verir.
        //      isBlank() ==> sapce + hicbirsey icin true           isEmpty ==> hicbirsey icin true
        boolean result5 = t.isBlank();
        System.out.println("Sadece space mi var? " + result5);

        //Example 6: Bir string de a, e, i karakterlerinin ilk gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //           "Java is easy to learn" ==> ilk siradaki olanlar 1 + 5 + 8 = 14

        String r = "Java is easy to learn";

        int idxA = r.indexOf('a');
        System.out.println(idxA);//1

        int idxI = r.indexOf('i');
        System.out.println(idxI);

        int idxE = r.indexOf('e');
        System.out.println(idxE);

        System.out.println("Index ler toplami: " + (idxA + idxI + idxE));

        //Example 7: Bir string de "java" kel'melesinin ilk olarak kacinci index de kullanildigini gosteren kodu yazdiriniz.
        //           "Ah Java vah Java sensiz olmuyor Java." ==> 3

        String u = "Ah Java vah Java sensiz olmuyor Java.";

        //indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (Yani J nin) index ini almis olursunuz.
        int idxJava = u.indexOf("Java");
        System.out.println(idxJava);//3

        //indexOf methodu olmayan karakterler icin her zaman "-1" verir
        int idxOfXyz = u.indexOf("xyz");
        System.out.println(idxOfXyz);

        //Example 8: Bir string de a, e, i karakterlerinin son gorunumlerinin indexleri toplamini ekrana yazdiriniz.
        //           "Java is easy to learn" ==> ilk siradaki olanlar 18 + 5 + 17 = 40

        String v = "Java is easy to learn";
        int idxOfA = v.lastIndexOf('a');
        System.out.println(idxOfA);

        int idxOfI = v.lastIndexOf('i');
        System.out.println(idxOfI);

        int idxOfE = v.lastIndexOf('e');
        System.out.println(idxOfE);

        System.out.println("Index ler toplami: " + (idxOfA + idxOfI + idxOfE));

        //Note: lastIndexOf() Strinde olmayan karakter icin kullanilirsa her zaman "-1" verir.


        //Example 9: Bir string deki tekrarsiz karakterleri ekrana yazdiriniz
        //           abbccdc ==> ad

        String y = "aac";

        char ch1 = y.charAt(0);

        if(y.indexOf(ch1)==y.lastIndexOf(ch1)){
            System.out.println(ch1);
        }

        char ch2 = y.charAt(1);
        if(y.indexOf(ch2)==y.lastIndexOf(ch2)){
            System.out.println(ch2);
        }

        char ch3 = y.charAt(2);
        if(y.indexOf(ch3)==y.lastIndexOf(ch3)){
            System.out.println(ch3);
        }


        //Note: Bazi kodlarin bazi sartlara bagli olarak clismasi gerekir.
        //      Bazi kodlari bazi sartlara gore aktive etmek icin "if statement" kullanilir.
        //      if you study hard, you will learn Java.

        //Example 10: Sayi pozitif ise ekrana "pozitif" yazdirin.
        int num = -12;

        if(num>0){
            System.out.println("Pozitif");
        }

        //Example 11: Sayi =1 ile 10 arasinda ise ekrana "rakam" yazdirin.
        int number = 30;

        if(number>-1 && number<10){
            System.out.println("Rakam");

        }

        //Example 12: Sayi uc basamakli ise "Wooow!" yazdirin

        int nu = -123;

        nu = Math.abs(nu);

        if(nu>99 && nu<1000){
            System.out.println("Wooow!");
        }



    }

}
