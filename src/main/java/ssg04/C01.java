package ssg04;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        //Example 1: String array olusturun icine 7 tane eleman ekleyin sonrada
        // ilk eleman ile son elemanın icerdigi karakter sayiları toplamını ekrana yazdırın

        String days[] = new String[7];
        days[0] = "Monday";
        days[1] = "Tuesday";
        days[2] = "Wednesday";
        days[3] = "Thursday";
        days[4] = "Friday";
        days[5] = "Saturday";
        days[6] = "Sunday";

        System.out.println(Arrays.toString(days));

        System.out.println("ilk gun ve son gunun toplam karakter sayisi: "+(days[0].length()+days[days.length-1].length()));




    }
}
