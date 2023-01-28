package day34mapsiterators;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable01 {

        /*
            1. HashTable "thread-safe" ve "synchronized" dir.
            2. HashTable entry leri rastgele siralar.
            3. HashTable lar HashMap lere gore daha yavastirlar.
            4. HashTable lar key lerde ve value lardanull kullanilmasina musaade etmezler.

            Note: 1. multi thread ve synchronization kullanmaniz gerekirse,
                  2. key lerde ve value larda null kullanmak yasak ise; HashTable kullanmak gerekir..
         */
    public static void main(String[] args) {

        Hashtable<Integer, Integer> ht = new Hashtable<>();

        ht.put(1,2);
        ht.put(2,4);
        ht.put(6,8);

        System.out.println("ht = " + ht);// ht = {6=8, 2=4, 1=2}

    }
}
