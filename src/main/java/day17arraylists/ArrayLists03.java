package day17arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists03 {

    public static void main(String[] args) {

        List<String> cities = new ArrayList<>();
        cities.add("Miami");
        cities.add("Istanbul");
        cities.add("Kayseri");
        cities.add("Almaty");
        cities.add("Kayseri");
        System.out.println(cities);

        //remove() methodu index ile kullanilirsa index teki elemani olur
        //remove() methodu index ile kullanilirsa size sildigi elemani verir
        String  n = cities.remove(1);
        System.out.println(n);
        System.out.println(cities);

        //remove() methodu eleman ile kullanilirsa ilk goruneni siler
        //remove() methodu eleman ile kullanilirsa size o elemani silip silmedigini ifade eder
        //ture veya false verir
        //Eger List te var ise o elemani siler ve size true der
        //Eger List te yok ise o elemani silemediginden size false verir
        boolean p = cities.remove("Kayseri");
        System.out.println(p);
        System.out.println(cities);



    }
}
