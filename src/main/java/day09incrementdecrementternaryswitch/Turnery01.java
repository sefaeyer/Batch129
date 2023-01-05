package day09incrementdecrementternaryswitch;

public class Turnery01 {

    public static void main(String[] args) {

        //Example 1
        int a = 10;
        int b = 20;

        int r1 = a<b ? a++ : ++b;

        System.out.println(r1);//10
        System.out.println(a);//11
        System.out.println(b);//20

        //Example 2:  Verilen bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //            -4 ==> -1*-4      4 ==> 4    0 ==> 0

        int c = 4;
        int r2 = c<0 ? -1*c : c;
        System.out.println(r2);//4

        //Example 3: Iki sayinin isareti ayni ise bu sayilari carpan
        //           isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum" mesaji veren kod

        int m = -5;
        int n = 6;

        //"Object" Java da butun Non-Primitive data type (class) lerinin ortak "Parent"(Baba) idir.
        //"Object" in parent i yoktur.
        //Farkli data type leri icin ortak variable olusturmak istediginizde, data type olarak object kullanabilirsiniz.
        //Java'da "Object", insanlik aleminde "Hz. Adem" e benzer.
        Object r3 = (m>0 && n>0) || (m<0 && n<0) ? m*n : "Farkli isaretli sayilari carpamiyorum";
        System.out.println(r3);

        //Example 4: Size verilen sayinin uc basamakli olup olmadigini kontrol eden kodu yaziniz

        int p = -436;

        int r = Math.abs(p);

        String r4 = (r>99 && r<1000)  ? p + "   Uc Basamakli" : p + "   Uc Basamakli Degil...";

        System.out.println(r4);




    }
}
