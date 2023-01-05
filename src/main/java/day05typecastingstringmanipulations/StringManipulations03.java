package day05typecastingstringmanipulations;

import java.util.Scanner;

public class StringManipulations03 {

    public static void main(String[] args) {

        /*
            Example 1: Aşağıdaki kurallara göre kullanıcının girdiği password u kontrol ediniz.
                i)En az 8 karakter olsun
                ii)Space karakteri password da olmasın
                iii)En az bir tane buyuk harf olsun
                iv)En az bir tane kucuk harf olsun
                v)En az bir tane sembol olsun
                vi)En az bir tane rakam olsun
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen passwordunuzu giriniz...");//"Ac123?Sd"
        String pwd = input.nextLine();

        //i)En az 8 karakter olsun
        boolean first = pwd.length()>7;
        //System.out.println(first);

        //ii)Space karakteri password da olmasın
        boolean second = !pwd.contains(" ");
        //System.out.println(second);

        //iii)En az bir tane buyuk harf olsun
        //Note: Buyuk harf olmayanları sil,
        //      Kalan karakter sayısına bak,
        //      Karakter sayısı sıfır ise buyuk harf yok demektir
        //      sıfırdan buyuk ise var demektir.

        boolean third = pwd.replaceAll("[^A-Z]", "").length()>0;
        //metodları aynı satırda yanyana kullanmaya "method chain"
        //System.out.println(third);

        //iv)En az bir tane kucuk harf olsun

        boolean fourth = pwd.replaceAll("[^a-z]","").length()>0;
        //System.out.println(fourth);

        //v)En az bir tane sembol olsun (harf ve rakam harici her şey)

        boolean fifth = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;
        //System.out.println(fifth);

        //vi)En az bir tane rakam olsun

        boolean sixth = pwd.replaceAll("[^0-9]","").length()>0;
        //System.out.println(sixth);

        System.out.println("Password geçerli mi? " + (first && second && third && fourth && fifth && sixth));



    }
}
