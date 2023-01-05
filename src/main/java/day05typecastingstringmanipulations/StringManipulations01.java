package day05typecastingstringmanipulations;

public class StringManipulations01 {

    // String bir non primitive data type idir ve aynı zamanda bir Class tır.

    public static void main(String[] args) {

        String s = "Java is easy";

        //Example 1: "s" String'indeki tüm karakterleri buyuk harf yapınız.

        String sUpper = s.toUpperCase();
        System.out.println(sUpper);

        //Example 2: "s" String'indeki tüm karakterleri kucuk harf yapınız.

        String sLower = s.toLowerCase();
        System.out.println(sLower);

        //Example 3: "s" String'indeki ilk karakteri alınız.

        char firstChar = s.charAt(0);
        System.out.println(firstChar);

        //Example 4: "s" stringindeki ikinci ve sondan ikinci karakteri alınız ve yanyana yazdırınız.

        char secondChar = s.charAt(1);
        char lastSecondChar = s.charAt(10);

        //1. Yol:
        System.out.print(secondChar);
        System.out.println(lastSecondChar);

        //2. Yol:!!!!!!!
        System.out.println("" + secondChar + lastSecondChar);

        //Example 5: "s" String indeki kullanılan karakter sayısını bulunuz.

        int sLength = s.length();
        System.out.println(sLength);

        //Example 6: "s" String indeki ilk 4 karakteri alınız.

        String sub1 = s.substring(0, 4); // ilk index 0, ikinci index bitişin bir sonrakini yazıcaz. "0" dahil, "4" hariç [0,4)
        System.out.println(sub1);

        //Example 7: "s" String indeki "is" kelimesini alınız.

        String sub2 = s.substring(5, 7);
        System.out.println(sub2);

        //Example 8: "s" String indeki "easy" kelimesini alınız.

        String sub3 = s.substring(8, 12);
        System.out.println(sub3);

        //2. Yol:... Bir karakterden başlayıp String in sonuna kadar almak isterseniz 2. index i yazmaya gerek yoktur.
        //s.substring(8, 12); yerine s.substring(8); yazınız.
        String sub4 = s.substring(8);
        System.out.println(sub4);

        //Example 9: "s" String inde "money" kelimesinin var olup olmadığını kontrol ediniz.

        boolean isExist = s.contains("money");// Buyuk kucuk harfe duyarlıdır.
        System.out.println(isExist);

        /*
            Bir metod ogrenirken 3 sey mutlaka ogrenin:
            i)Bu metod ne is yapar.
            ii)Bu metod'un farklı kullanımları nasıldır?
            iii)Bu metod size ne return eder?
         */

        //Example 10: "s" String inin belli bir hafle başlayıp başlamadığını kontrol ediniz.

        boolean isStart = s.startsWith("Java");
        System.out.println(isStart);

        //Example 11: "s" String inin 6. karakterden itibaren belli bir hafle başlayıp başlamadığını kontrol ediniz.

        boolean isBegin = s.startsWith("i",5);
        System.out.println(isBegin);




    }
}
