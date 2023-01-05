package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        //Example 1: String array olusturun icine 5 tane eleman ekleyin sonrada
        // ilk eleman ile son elemanın icerdigi karakter sayiları toplamını ekrana yazdırın

        String arr[] = new String[5];

        arr[0] = "Math";
        arr[1] = "Science";
        arr[2] = "Music";
        arr[3] = "English";
        arr[4] = "Art";
        System.out.println(Arrays.toString(arr));//[Math, Science, Music, English, Art]

        System.out.println(arr[0].length() + arr[arr.length-1].length());//7

        //Example 2: String array olusturun icine 5 tane eleman ekleyin sonrada
        // tum elemanlarin icerdigi karakter sayiları toplamını ekrana yazdırın

        String brr[] = new String[5];

        brr[0] = "Miami";
        brr[1] = "Istanbul";
        brr[2] = "Frankfurt";
        brr[3] = "Dhaka";
        brr[4] = "Athena";

        //1. Yol: for loop
        int totalChar = 0;

        for(int i =0 ; i<brr.length; i++  ){

            totalChar = totalChar + brr[i].length();
        }

        System.out.println(totalChar);//33

        //2. Yol: for each loop (enhanced loop) ==> baslangic degeri loop un calisma sarti ve inc/dec kismini kendisi halleder
        //        for each loop array lerde ve collection larda kullanilir.

        int sum = 0;

        for (String w : brr){

            sum = sum + w.length();
        }

        System.out.println(sum);//33
    }
}
