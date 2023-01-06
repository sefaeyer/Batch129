package day21statickeyword;

public class Student {

    /*
        1. static variable veya static method lar (class member) tum objectler icin ortak elemandir
        2. static class member lar uzerinde yapilan tum degisiklikler tum object leri etkiler.
        3. static class member lar class a, non static member lar object lere monte edilir.
           mesela bir class dan 100 tane object olustrudugunuzda non static olanlar 100 kere olusturulur
           ama static olanlar object sayisindan bagimsiz olarak bir kere olusturulur
        4. static class member lara ulasmak icin object olusturmaya gerek duyulmaz, ama non static member lara
           ulasmak icin object olusturmak sarttir.
        5. static variable lerin diger adi class variable dir
           non static variable larin diger adi instance veya object variable dir
     */

    public static String stdName = "Tom Hanks";
    public int age = 13;

    //ogrenci isminin ilk harflerini veren methodu olusturunuz
    public static String getInitials(String name){

        String first = name.substring(0,1);
        String second = name.split(" " )[1].substring(0,1);

        return first+second;

    }

    //Ogrenci ismindeki sesli harfleri sayan (a e i o u) bir method olustur

    public int countVowels (String name){

        int counter =0;

        for (int i=0; i<name.length(); i++){

            char ch = name.toLowerCase().charAt(i);

            switch (ch){
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counter++;
                break;
            }

        }

        return counter;
    }

}
