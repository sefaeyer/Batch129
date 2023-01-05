package day18lists;

import java.util.ArrayList;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Ajda");
        names.add("Cuneyt");
        names.add("Mahsun");
        names.add("Muslum");
        names.add("Orhan");

        List<String> females = new ArrayList<>();
        females.add("Ajda");
        females.add("Emel");

        //names.containsAll(females) names list inde females list indeki tum elemanlarin var olup olmadigini kontrol eder.
        // Tamami varsa size true verir, herhangi biri yoksa sie false verir.
        boolean r = names.containsAll(females);
        System.out.println(r);

        //names.subList(1,4); names list indeki indexi 1 2 ve 3 olan elemanlari bir list in icinde size verir.
        // Ikinci index olan 4 dahil olmaz.
        List<String> subList =  names.subList(1,4);
        System.out.println(subList);


        names.retainAll(females);

        System.out.println(names);
        System.out.println(females);

        //Example 1: Elektronik aletker ve ev aletleri listkeriniz var.
        //           Elektronik ev aletkerini listeleyiniz.

        List<String> electronics = new ArrayList<>();
        electronics.add("TV");
        electronics.add("Radio");
        electronics.add("Refrigerator");
        electronics.add("Mobile Phone");
        electronics.add("Notebook");

        List<String> homeGoods = new ArrayList<>();
        homeGoods.add("Carpet");
        homeGoods.add("Fork");
        homeGoods.add("Radio");
        homeGoods.add("Chair");
        homeGoods.add("TV");

        //homeGoods.retainAll(electronics)  homeGoods ile electronics listelerinin ortak elemanlarini homeGoods list i icinde verir.
        // Baska bir deyisle (in other words) homeGoods listindeki ortak olamayan elemanlari siler.
        homeGoods.retainAll(electronics);

        System.out.println(homeGoods);


        //isEmpty() list te hic eleman yoksa size true verir. 1 veya daha fazla eleman varsa false verir.
        //isEmpty() esasinda "names.size()==0" demektir. isEmpty onerilir
        names.isEmpty();


        System.out.println(names.hashCode());//2041509


    }
}
