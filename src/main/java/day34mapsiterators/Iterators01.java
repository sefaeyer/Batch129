package day34mapsiterators;

import java.util.*;

public class Iterators01 {

    /*
        Iterator'lar Loop'ların yaptığı işi yapar.
        Iterator lar tıpkı loop'ta olduğu gibi elemanı alarak işleme sokar.
        Javanın Iterator'ları ortaya çıkarma sebebi sonsuz Loop tehlikesidir.
        Iterator'larda sonsuz loop yoktur.Iterator'lar Java tarafından sonradan oluşturulmuşlardır.
        Loop'ların yaptıkları bütün işlemleri yaparlar.
        Loop lar ile Iterator larin performance farki yoktur
        ama Iterator lar eleman silme ve update etmede daha basarilidirlar.

        Iki tip Iterator vadir:
        1. Iterator: Sadece elemanlari remove edebilirsiniz
                     Sadece soldan saga calisir. Yani tek yonludur.
        2. ListIterator: Elemani remove etme, update ve add yapabilirsiniz.
                         Hem soldan saga hem de sagdan sola calisabilir yani cift yonludur.
 */
    public static void main(String[] args) {

        //Iterator
        List<String> list1 = new ArrayList<>();
        list1.add("Ali");
        list1.add("Can");
        list1.add("Aliye");
        System.out.println("list1 = "+list1);

        Iterator<String> itr1 = list1.iterator();

        while(itr1.hasNext()){

            itr1.next();

            itr1.remove();
        }
        System.out.println("list1 = " + list1);

        List<String> list2 = new ArrayList<>();
        list2.add("Ali");
        list2.add("Can");
        list2.add("Aliye");
        System.out.println("list2 = " + list2);

        ListIterator<String>listItr = list2.listIterator();

        while(listItr.hasNext()){
            String el = listItr.next();
            listItr.set(el+"!");
        }
        System.out.println("list2 = " + list2);

        //Example 2:
        List<String> list3 = new ArrayList<>();
        list3.add("Ali");
        list3.add("Can");
        list3.add("Aliye");
        System.out.println("list3 = " + list3);

        ListIterator<String> listItr2 = list3.listIterator();

        while (listItr2.hasNext()){
            listItr2.next();
        }

        while (listItr2.hasPrevious()){

            String el = listItr2.previous();
            System.out.println(el + " <==");

        }
    }


}
