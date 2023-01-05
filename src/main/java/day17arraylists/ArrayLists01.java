package day17arraylists;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayLists01 {

    /*
        1.ArrayList ler coklu data depolamak icin kullanilir.
        2.ArrayList ler non primitive data type indeki coklu datalari depolamak icin kullanilir
         * List ler non primitive data kabul ederler, array ler ise primitive data veya reference kabul ederler
        3.ArrayList leri olustururken icine koyacaginiz eleman sayisini basta soylemeye gerek yoktur.
         * List ler eleman sayisinda flexible dirlar, ama array ler flexible degildirler.
        4.Madem Array ler eleman sayisinda flexible degil nicin Java array leri iptal etmedi.
            i. Eleman sayisi belli olan data lari depolamak icin Array ler tercih edilir.
            ii. Array ler cok hizli calisir
            iii. Array ler memory de cok az yer kaplar
     */

    public static void main(String[] args) {

        //List nasil olusturulur

        ArrayList<Integer> ages = new ArrayList<>();

        System.out.println(ages);// []

        //Listlere eleman nasil eklenir
        //List e eleman eklemek icin add() methodu nu kullaniriz
        //add() method u elemanlari sizin verdiginiz sirada ekler. insertion order
        ages.add(9);
        ages.add(12);
        ages.add(10);

        ages.add(1, 656);
        ages.add(3, 777);
        ages.add(888);
        System.out.println(ages);// [9, 656, 12, 777, 10]

        //List e coklu eleman nasil eklenir Veya List e baska bir list nasil eklenir?
        //Bir List e eleman eklemek icin o elemanlari bir list in icine koymalisiniz

        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        ages.addAll(2, newAges);
        System.out.println(ages);// [9, 656, 12, 777, 10, 8, 9, 10]

        //Bir List teki tum elemanlari nasil silebilirim?
//        ages.clear();
//        System.out.println(ages);

        //Bir elemanin List te olup olmadigini nasil kontrol ederiz
        boolean r = ages.contains(656);
        System.out.println(r);

        // Bir List in baska bir list ile ayni olup olmadigini nasil kontrol ederiz
        //Iki list in esit olabilmesi icin ayni index te ayni elemanlar olmalidir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("Tom");
        names1.add("Jim");
        names1.add("Kim");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("Tom");
        names2.add("Kim");
        names2.add("Jim");

        boolean s = names1.equals(names2);
        System.out.println(s);// false


        //Example 1 : Verilen iki integer List te tamamiyla ayni elemanlarin olup olmadigini
        //            kontrol eden kodu yaziniz

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(10);
        nums1.add(9);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(9);
        nums2.add(10);

        Collections.sort(nums1);

        Collections.sort(nums2);

        boolean t = nums1.equals(nums2);
        System.out.println(t);

    }
}
