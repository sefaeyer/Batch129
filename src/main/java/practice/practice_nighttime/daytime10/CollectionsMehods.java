package practice.practice_nighttime.daytime10;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class CollectionsMehods {


    // Kullanıcıdan 5 sayıdan olusan
    // bir liste isteyin.
    // listeyi sirala ve tersten yazdir
    // listeyi karıştırin ve yazdırin
    // 3'er sağa kaydirin ve yazdırin

    //maksimum sayıyı ve minimum sayıyı bulun, yazdırın
    // tüm maksimum sayıların yerine minimum sayıyi yazdir

    public static void main(String[] args) {
        ArrayList<Integer> arrList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Lutfen sayi giriniz");
            arrList.add(input.nextInt());
        }
        System.out.println(arrList);

        //Tersten
        arrList.sort(Collections.reverseOrder());
        System.out.println("Tersten = "+arrList);

        //karisik
        Collections.shuffle(arrList);
        System.out.println("karisik = " + arrList);

        //3 er saga kaydir
        Collections.rotate(arrList, 3);// rotate verilen listeyi distance kadar saga kaydirir.
        System.out.println("3 er saga kaymis = " + arrList);


        //maksimum sayıyı ve minimum sayıyı bulun, yazdırın
        // tüm maksimum sayıların yerine minimum sayıyi yazdir

        Integer max = Collections.max(arrList);
        Integer min = Collections.min(arrList);
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        Collections.replaceAll(arrList,max,min);
        System.out.println("arrList = " + arrList);

    }//main

}

