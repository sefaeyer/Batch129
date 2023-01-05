package day14arraysforeachloop;

import java.util.Arrays;

public class Arrays03 {

    public static void main(String[] args) {

        //Example 1: String bir array olusturunuz, 6 tane eleman yerlestiriniz,
        // character sayisi 5 ten cok olan elemanlari siliniz.

        String colors[] = new String[6];
        colors[0] = "Red";
        colors[1] = "Orange";
        colors[2] = "Blue";
        colors[3] = "Yellow";
        colors[4] = "Green";
        colors[5] = "Brown";

        System.out.println(Arrays.toString(colors)); //[Red, (Orange), Blue, (Yellow), Green, Brown]

        //Logic: yeni bir array olusturup karakter sayisi 5 ve 5 ten kucuk olan elemanlari
        // yeni array e transfer edecegiz. boylelikle yeni array de karakter sayisi 5 tn buyuk eleman olmayacak

        //Soru: array olusturmak icin iki sey belirlenmelidir.
        // 1. elemanlarin data tipi,
        // 2. yeni array de kac tane eleman olacak

        //Verilen Array de 5 ve 5 ten buyuk eleman sayisi bulunur

        int counter = 0;

        for (String w : colors){
            if(w.length()<=5){
                counter++;
            }
        }

        System.out.println(counter);//4

        String newColors[]= new String[counter];

        //Character sayisi 5 ve 5 ten kucuk olanlari yeni array e transfer et
        int idx = 0;

        for(String w : colors){

            if(w.length()<=5){
                newColors[idx] = w;
                idx++;

            }
        }

        System.out.println(Arrays.toString(newColors));
    }
}
