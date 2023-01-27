package day32collections;

import com.sun.source.tree.Tree;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSet01 {

    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(12);
        ts.add(25);
        ts.add(8);
        ts.add(32);
        ts.add(3);
        System.out.println(ts);// [3, 8, 12, 25, 32]
        long two = System.nanoTime();

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(25);
        hs.add(8);
        hs.add(32);
        hs.add(3);

        TreeSet<Integer> hts = new TreeSet<>(hs);
        System.out.println(hts);// [3, 8, 12, 25, 32]

        long three = System.nanoTime();

        System.out.println("TreeSet suresi "+(two-one));
        System.out.println("HashSet suresi "+(three-two));

        //Note: TreeSet eleman eklemede cok yavastir. HashSet ise cok hizlidir.
        //      TreeSet in bu negatif yonunden kurtulmak icin eleman eklerken HashSet olusturur,
        //          elemanlari ekler ve sonra HashSet i TreeSet e ceviririz.

        System.out.println(ts);

        int first = ts.first();
        System.out.println(first);

        int second = ts.last();
        System.out.println(second);

        int floor1 = ts.floor(15);
        System.out.println("floor1 = " + floor1);//12 ==>15 elemanlardan biri degil o yuzden 15 den bir onceki eleman yazdirildi

        //floor() method unda kullanabileceginiz sayi en kucuk elemandan kucuk olamaz.
        int floor2 = ts.floor(12);
        System.out.println("floor2 = " + floor2);//12 ==> 12 elemanlardan biri o yuzden 12 direkt yazdirildi.

        int ceiling1 = ts.ceiling(15);
        System.out.println("ceiling1 = " + ceiling1);//25==>15 elemanlardan biri degil o yuzden 15 den bir sonraki eleman yazdirildi

        //ceiling() methodunda kullanabileceginiz sayi en buyuk elemandan buyuk olamaz.
        int ceiling2 = ts.ceiling(25);
        System.out.println("ceiling2 = " + ceiling2);//25==> 25 elemanlardan biri o yuzden 25 direkt yazdirildi.

        SortedSet<Integer> tailSet1 = ts.tailSet(12);
        System.out.println("tailSet1 = " + tailSet1);// [12, 25, 32] =>  12 elemanlardan biri o yuzden 12 ve sonraki elemanlaar
                                                                        // bir Set icinde yazdirildi.

        SortedSet<Integer> tailSet2 = ts.tailSet(15);
        System.out.println("tailSet2 = " + tailSet2);// [25, 32] ==> 15 elemanlardan biri degil o yuzden 15 den  sonraki elemanlar
                                                                    // bir Set icinde yazdirildi

        NavigableSet<Integer> tailSet3 = ts.tailSet(12, true);
        System.out.println("tailSet3 = " + tailSet3); // 12 elemanini dahil olup olmayacagini true ve false ile Javaya bildiriyoruz,
                                                        // buna gore dahil ediyor veya dahil etmiyor.

        SortedSet<Integer> headSet1 = ts.headSet(12);
        System.out.println("headSet1 = " + headSet1);// [3, 8] ==>  12 elemanlardan biri o yuzden 12 den onceki elemanlaar
                                                                    // bir Set icinde yazdirildi.

        SortedSet<Integer> headSet2 = ts.headSet(12,true);
        System.out.println("headSet2 = " + headSet2);

        Integer higher1 = ts.higher(12);
        System.out.println("higher1 = " + higher1);// 12 de bir sonraki elemani verir.

        Integer lower1 = ts.lower(12);
        System.out.println("lower1 = " + lower1);


    }
}
