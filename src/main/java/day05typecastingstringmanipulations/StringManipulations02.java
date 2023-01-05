package day05typecastingstringmanipulations;

public class StringManipulations02 {

    public static void main(String[] args) {

        String s = "Learn Java earn money";

        //Example 1: "s" String inin "money" ile bitip bitmediğini kontrol ediniz.

        boolean isEnd = s.endsWith("money");
        System.out.println(isEnd);

        //Example 2: "s" String indeki "money" kelimesini "dollar" kelimesine ceviriniz.

        String s1 = s.replace("money", "dollar");
        System.out.println(s1);

        //Example 3: "s" String indeki "earn" kelimesini "win" kelimesine ceviriniz.

        String s2 = s.replace("earn", "win");
        System.out.println(s2);

        //Example 4: "s" String indeki "a" harflerini "*" a ceviriniz.
        //Note: replace metodunda birden fazla karakter ile çalışırsanız mecburen "" çift tırnak kullanılır, ama tek karakter ile
        //      çalışırsanız '' tek tırnak veya "" çift tırnak ile çalışailirsiniz.


        String s3 = s.replace("a", "*");
        System.out.println(s3);

        //Note: Ama ya ikisi de çift tırnak olmalıdır, ya da ikisi de tek tırak olmalıdır.
        //Example 5: "s" String indeki "n" harflerini "XXX" a ceviriniz.

        String s4 = s.replace("n", "XXX");
        System.out.println(s4);

        //Example 6: "s" String indeki bütün "e" harflerini siliniz.
        //Note: Hiçbir şey char data type inde yoktur. o yuzden replace kullanarak silme işlemi yaparsanız mutlaka çift tırnak kullanınız.

        String s5 = s.replace("e", "");
        System.out.println(s5);// Larn Java arn mony

        String t = "Ali 13 yasindadir!...";

        //Example 7: "t" String indeki bütün rakamları (0, 1, 2, 3, 4, 5, 6, 7, 8, 9) "*" a çeviriniz.
        //Note: Bir grup datayı değiştirmek için replaceAll() kullanılır.
        //Note 2: Bütün rakamlar demek için [0-9] yazılır.
        //Note 3: Bütün küçük harfler için [a-z] yazılır.
        //Note 4: Bütün BUYUK harfler için [A-Z] yazılır.
        //Note 5: Bir grup data yı ifade etmek için regex (Regular Expressiıons) kullanılır.

        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println(t1);

        /*
                Meshur Regex ler:
                1) Tum rakamlar ==> [0-9]
                2) Tum kucuk harfler ==> [a-z]
                3) Tum buyuk harfler ==> [A-Z]
                4) Tum kucuk harfler ve buyuk harfler ==> [a-zA-Z]
                5) Tum harfler ve rakamlar ==> [a-zA-Z0-9]
                6) Tum noktalama işaretleri ==> \\p{Punct}
                7) Tum sesli harfler ==> [aeiouAEIOU]
                   x, q, w harfleri == [xqw]

                8) Kucuk harflerden farklı tum karakterler ==> [^a-z]
                9) Tum harflerden farklı tum karakterler ==> [^a-zA-Z]

         */

        //Example 8: "t" String tüm rakamları ve harfleri "!" e çeviriniz.
        String t2 = t.replaceAll("[a-zA-z0-9]", "!");
        System.out.println(t2); //!!! !! !!!!!!!!!!!...

        //Example 9: "t" String tüm sesli  harfleri "?" e çeviriniz.

        String t3 = t.replaceAll("[aeiouAEIOU]", "?");
        System.out.println(t3);

        //Example 10: "t" String kucuk harfler dısındaki tum karakterleri "<>" e çeviriniz.

        String t4 = t.replaceAll("[^a-z]", "<>");
        System.out.println(t4);

        //Example 11: "t" String tum harfler dısındaki tum karakterleri "+" e çeviriniz.

        String t5 = t.replaceAll("[^a-zA-Z]", "+");
        System.out.println(t5);

        //Example 12: "t" String space dısındaki tum karakterleri "TL" e çeviriniz.

        String t6 = t.replaceAll("[^ ]", "TL");
        System.out.println(t6);

        //Example 13: "t" String sesli harfler dısındaki tum karakterleri "&" e çeviriniz.

        String t7 = t.replaceAll("[^aeiouAEIOU]", "&");
        System.out.println(t7);







    }
}
