package day05typecastingstringmanipulations;

public class TypeCasting01 {

    /*
        Numeric primitive data type larının birbirinie donusturulmesıne "Type Casting" denir.
        Numeric (Sayısal) Data Type:  byte - short - int  long - float - double

        Note 1: Kucuk data type lerini buyuk data type lerıne cevirmeyi java otomatik olarak yapabilir.
                Bu işleme "AutoWidening"(Otomatik Genişletme) denir.

        Note 2: Buyuk data type lerini kucuk data type lerıne cevirmek riskli bir iştir
                Bu işlemi kod yazanlar yapar.
                Bu işleme "ExplicitNarrowing"(Aciktan daraltma) denir.
     */



    public static void main(String[] args) {

        // byte data type ini int data type ine ceviriniz
        byte age = 13;
        int ageInt = age;//AutoWidening

        //long data type ini short data type ine ceviriniz
        long weight = 234;
        short weightShort = (short)weight;//ExplicitNarrowing

        //int data type ini float data type ine ceviriniz

        int height =180;
        System.out.println(height);
        float heightFloat = height;
        System.out.println(heightFloat);

        // doubledata type ini short data type ine ceviriniz.

        double value = 123.45;
        System.out.println(value);
        short valueShort = (short)value;
        System.out.println(valueShort);//123

        //Dikkat!
        //Donusum yaptıgınız sayı (260) donusecegi data type inin sınırları dısındaysa Java kullandıgınız sayı ile modulus işlemi yapar
        //ve mod işleminin sonucu sizin yeni degeriniz olur.

        // Example1
        short num = 260;
        System.out.println(num);//260

        byte numByte = (byte)num;
        System.out.println(numByte);//127????

        // Example2
        short n = 1023;
        System.out.println(n);//1023

        byte nByte = (byte)n;
        System.out.println(nByte);//-1












    }
}
