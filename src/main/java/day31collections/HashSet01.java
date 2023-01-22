package day31collections;

import java.util.HashSet;

public class HashSet01 {

    /*
        "Hash" bir tekniktir biz bu tekniği kullanarak Java benzersiz datalar üretir.
        "Set" tekrarsız data depolamak icin kullanilan bir Collection dir.
         Set tekrar kabul etmez. Yani tekrarsız verileri depolamak için kullanılır.

         Set ler 3 e ayrilir:
            1. HashSet: a. Super hizlidir. Cunku verdiginiz elemanlari siralamak icin zaman kaybetmez
                           yani hashSe lere eklenen elemanlar rastgele siralanirlar
                        b. HashSet ler tekrarli elemana musade etmez.
                        c. HashSet ler sadece 1 tane "null" i eleman olarak kabul ederler.
            2. LinkedHashSet: a. LinkedHashSet elemanlari insertion order a gore dizer.
                              b. LinkedHashSet elemanlari siralamakta zaman kaybettigi icin HashSet e gore yavastir.
            1. TreeSet: a. TreeSet elemanlari natural order a gore dizer.
                        b. Natural order yaparken cok zaman harcar, o yuzden en yavas Set tir.
     */
    public static void main(String[] args) {

        HashSet<Integer> hs = new HashSet<>();
        hs.add(12);
        hs.add(234);
        hs.add(78);
        hs.add(5);

        System.out.println(hs);//[5, 234, 12, 78] ==> Elemanlar rastgele siralandi.

        int hc = hs.hashCode();
        System.out.println(hc);


    }


}
