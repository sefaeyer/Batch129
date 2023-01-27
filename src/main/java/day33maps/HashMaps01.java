package day33maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMaps01 {

    /*
        1. Map lerde USA = 400,000,000 seklinde data depolamamaiz gerektiginde kullanilir.
        2. USA=400,000,000 data sinin USA kismi ""key"" olarak adlandirilir ve key ler unique dir.
        3. USA=400,000,000 data sinin 400,000,000 kismi ""value"" olarak adlandirilir ve tekrarli olabilir.
        4. Map lerde depoladiginiz her bir data ya ""Entry"" denir, ""Eleman"" denmez.
        5. Entry ler unique tir. Cunku key kisimlari unique oldugundan her bir entry digerlerinden farklidir.

        6. ""HashMap"" ler cok hizlidir cunku HashMap ler Entry leri siralama ile ugrasmazlar.
        7. ""HashMap"" lerde bir tane key i null yapabilirsinz.
        8. ""HashMap"" lerde birden fazla value yu ""null"" yapabilirsiniz.
        9. ""HashMap"" ler ""multi thread"" icin kullanilamazlar ve synchronization yoktur.
     */
    public static void main(String[] args) {

        // HashMap nasil olusturulur?
        HashMap<String, Integer> hm = new HashMap<>();
        System.out.println("hm = " + hm);

        //HashMap lere nasil entry eklenir
        hm.put("USA", 400000000);
        hm.put("Germany", 83000000);
        hm.put("Albenia", 3000000);
        //Ayni key i kullarak yeni bir entry eklerseniz var olanı update etmis olursunuz
        hm.put("Albenia", 2800000);
        hm.put(null, 12000000);
        hm.put(null, 18000000);
        hm.put("Myanmar", null);
        hm.put("Bhutan", null);
        System.out.println("hm = " + hm);

        //HashMap lerde sadece key leri almak istiyorum.
        Set<String> hmKeys = hm.keySet();
        System.out.println("hmKeys = " + hmKeys);

        //HashMap lerde sadece value leri almak istiyorum.
        //Example 1. hm Map indaki ulkelerin toplam nufusunu bulunuz.
        Collection<Integer> hmValues = hm.values();
        int sum = 0;

        for(Integer w: hmValues){
            if(w!=null) {
                sum = sum = w;
            }
        }
        System.out.println("sum = " + sum);

        //HashMap lerde belirli bir key nin value sunu nasil alabiliriz?
        Integer usaPopulation = hm.get("USA");
        System.out.println("USA Population = " + usaPopulation);

        //HashMap lerde replace method u varolan bir key nin value sunu degistirmek icin kullanilir.
        hm.replace("Bhutan", 35000000);
        System.out.println("hm = " + hm);

        //Hashmap lerde putIfAbsent() methodu  entry varsa birsey yapmaz, yoksa yeni entry olusturur.
        hm.putIfAbsent("USA", 700000000);
        hm.putIfAbsent("India", 700000000);
        System.out.println("hm = " + hm);

        //Example 2: Yeni ogretmenin maasi standart(10000) ucretten 1000 TL fazla, eski ogretmenin maasi standart ucreten 2000 TL fazla olsun
        HashMap<String, Integer> salaries = new HashMap<>();

        salaries.put("Ali", 8000);
        salaries.put("Ayse", 5000);
        salaries.put("Veli", 9000);
        salaries.put("Tom", 9900);

        String teacherName = "Tom";

        if(salaries.keySet().contains(teacherName)){
            salaries.put(teacherName, 12000);
        }else{
            salaries.putIfAbsent(teacherName, 11000);
        }
        System.out.println("salaries = " + salaries);

        //replace methodu
        hm.replace("USA", 400000000, 500000000);
        System.out.println("hm = " + hm);

        //getOrDefault olan key lerin degerini verir, olmayan key ler icin de ikinci yazilan parametreye yazilan degeri verir
        Integer r = hm.getOrDefault("Bhutan", 110);
        System.out.println("r = " + r);

        //entrySet() methodu Map i Set e cevirir.
        //Setlerin methodlarini kullanabilmek icin entrySet methodunu kullanarak Map i Set e ceviririz.
        Set<Map.Entry<String,Integer>> myEntries = hm.entrySet();
        System.out.println("myEntries = " + myEntries);

        //Example 3. Ulke ismindeki character sayisini ulke nufusuna ekleyen ve sonucu console a yazdiran kodu yaz.
        for(Map.Entry<String,Integer> w : myEntries){
            if(w.getValue()!=null && w.getKey() != null){
                int toplam = w.getValue() + w.getKey().length();
                System.out.println("toplam = " + toplam);
            }

        }


    }
}
