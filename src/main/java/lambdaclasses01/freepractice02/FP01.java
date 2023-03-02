package lambdaclasses01.freepractice02;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class FP01 {

    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);


        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");


        System.out.println(getHalfElementsGraterThanFiveDistinctReversed(myList));
        System.out.println();
        buyukHarfAlfabetikTekrarsiz(list);
        System.out.println();
        kucukHarf(list);
        System.out.println();
        buyukHarfUzunluklarinaGoreArtanSiraTekrarsiz(list);
        System.out.println();
        buyHarfSonHarfGoreAzalan(list);
        System.out.println();
        buyHarfSonHarfGoreArtanTekrarsiz(list);
        System.out.println();
  //      System.out.println("besten Buyuk Olanlar(list) = " + bestenBuyukOlanlar(list));
        System.out.println();
  //      System.out.println(aVedSil(list));
        System.out.println("kareleriAl(list) = " + kareleriAl(list));
        System.out.println("ciftEl(list) = " + ciftEl(list));

    }
    //1)Create a method to find the half of the elements greater than 5 , distinct, in reverse order in list
    public static List<Double> getHalfElementsGraterThanFiveDistinctReversed(List<Double>myList){
        return myList.
                stream().
                distinct().
                filter(t->t>5).
                map(t->t/2).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());

    }


    //2. Tum list elemanlarini buyuk harf ile alfabetik sirada tekrarsiz olarak yazdiriniz:
    public static void buyukHarfAlfabetikTekrarsiz(List<String>list){
        list.stream().map(t->t.toUpperCase()).distinct().sorted().forEach(t-> System.out.print(t+" "));
    }

    //3)Tum list elemanlarini kucuk harfle alfabetik siranin tersinde  tekrarsiz olarak yazdiriniz.
    public static void kucukHarf(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    //4)Tum list elemanlarini buyuk harfle uzunluklarina gore artan sirada  tekrarsiz olarak yazdiriniz.
    public static void buyukHarfUzunluklarinaGoreArtanSiraTekrarsiz(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));
    }

    //5)Tum list elemanlarini buyuk harfle son harflerine  gore azalan  sirada  tekrarsiz olarak yazdiriniz.
    public static void buyHarfSonHarfGoreAzalan(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(t-> System.out.print(t+" "));
    }

    //6. Tum list elemanlarini buyuk harf ile uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz.
    //   Uzunluklari ayni olan elemanlar alfabetik sirada
    public static void buyHarfSonHarfGoreArtanTekrarsiz(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(Utils::printInTheSameLineWithASpace);
    }

    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz:
//    public static List<String> bestenBuyukOlanlar(List<String>list){
//        list.removeIf(t->t.length()>5);
//        return list;
//    }

    //8. A ile baslayan veya d ile bitan elemanlari siliniz.
//    public static List<String> aVedSil(List<String>list){
//        list.removeIf(t->t.startsWith("A") || t.endsWith("d"));
//        return list;
//    }

    //9. List elemanlarini character sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz.
    public static List<Integer> kareleriAl(List<String>list){
        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());
    }

    //10. List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> ciftEl(List<String>list){
        return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());
    }


}
