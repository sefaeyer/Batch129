package day34mapsiterators;

import java.util.HashMap;
import java.util.TreeMap;

     /*
        1. TreeMap entry leri key lere gore natural order a koyar.
        2. TreeMap coook yavastir cunku natural order yapmak coook zaman ister.
        3. TreeMap thread-safe ve synchronized degildir.
        4. TreeMap lerin key lerinde null kullanilamaz ama value larda istediginiz kadar kullanabilirsiniz.

     */
public class TreeMap01 {

    public static void main(String[] args) {

        long one = System.nanoTime();

        TreeMap<String, Integer> stdAges1 = new TreeMap<>();
        stdAges1.put("Ali",21);
        stdAges1.put("Kemal",21);
        stdAges1.put("Ayse",21);
        stdAges1.put("Murat",21);

        System.out.println("stdAges1 = " + stdAges1);

        long two = System.nanoTime();

        HashMap<String, Integer> stdAges2 = new HashMap<>();
        stdAges2.put("Ali",21);
        stdAges2.put("Kemal",21);
        stdAges2.put("Ayse",21);
        stdAges2.put("Murat",21);

        System.out.println("stdAges2 = " + stdAges2);

        long three = System.nanoTime();

        HashMap<String, Integer> stdAges3 = new HashMap<>();
        stdAges3.put("Ali",21);
        stdAges3.put("Kemal",21);
        stdAges3.put("Ayse",21);
        stdAges3.put("Murat",21);

        TreeMap<String, Integer> stdAges4 = new TreeMap<>(stdAges3);

        System.out.println("stdAges4 = " + stdAges4);

        long four = System.nanoTime();

        System.out.println("TreeMap: "+ (two-one));
        System.out.println("HashMap: "+ (three-two));
        System.out.println("HashMap--> TreeMAp: "+ (four-three));

    }



}
