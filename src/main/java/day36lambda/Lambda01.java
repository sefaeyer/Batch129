package day36lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) {

        List<Double> myList = new ArrayList<>();
        myList.add(12.0);
        myList.add(4.0);
        myList.add(7.0);
        myList.add(3.6);
        myList.add(26.8);
        myList.add(38.4);

        List<Double> half = getHalfElementsGraterThanFiveDistinctReversed(myList);
        System.out.println("half = " + half);

        List<String> list = new ArrayList<>();
        list.add("Tom");
        list.add("John");
        list.add("Ajda");
        list.add("Angelina");
        list.add("Tom");
        list.add("Brad");
        list.add("Cuneyt");


        printAllAlphabeticallyUpperDistinct(list);
        System.out.println();
        printAllAlphabeticallyLowerDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinct(list);
        System.out.println();
        printAllSortWithLastCharUpperDistinct(list);
        System.out.println();
        printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(list);
        System.out.println();
//        System.out.println(removeElementIfTheLengthGreaterThanFive(list));
//        System.out.println();
//        System.out.println(removeElementIfStartsWithAorEndsWithd(list));
        System.out.println(printLengthSquare(list));
        System.out.println();
        System.out.println(printElementsLengthEven(list));
        printAllSortWithLastCharUpperDistinct2(list);

    }

    //1. Create a mathod to find the half of the elements greater than five, distinct, in reverse order, in a list
    public static List<Double> getHalfElementsGraterThanFiveDistinctReversed(List<Double> myList){
       return myList.
               stream().
               distinct().
               filter(t->t>5).
               map(t->t/2).
               sorted(Comparator.reverseOrder()).
               collect(Collectors.toList());
    }

    //2. Tum list elemanlarini buyuk harf ile alfabetik sirada tekrarsiz olarak yazdiriniz:
    public static void printAllAlphabeticallyUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted().forEach(t-> System.out.print(t+" "));
    }

    //3. Tum list elemanlarini kucuk harf ile alfabetik siranin tersinde tekrarsiz olarak yazdiriniz:
    public static void printAllAlphabeticallyLowerDistinct(List<String>list){
        list.stream().distinct().map(t->t.toLowerCase()).sorted(Comparator.reverseOrder()).forEach(t-> System.out.print(t+" "));
    }

    //4. Tum list elemanlarini buyuk harf ile uzunluklarina gore artan sirada tekrarsiz olarak yazdiriniz:
    public static void printAllSortWithLengthUpperDistinct(List<String>list){
        list.stream().distinct().map(t->t.toUpperCase()).sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.print(t+" "));
    }

    //5. Tum list elemanlarini buyuk harf ile son harflerine gore artan sirada tekrarsiz olarak yazdiriniz:
    public static void printAllSortWithLastCharUpperDistinct(List<String>list){
        list.
                stream().
                distinct().
                map(t->t.toUpperCase()).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).//t->t.charAt(t.length()-1) ==> lambda expression
//                sorted(Comparator.reverseOrder()) .
                forEach(Utils::printInTheSameLineWithASpace);
    }

    //5. Tum list elemanlarini buyuk harf ile son harflerine gore artan sirada tekrarsiz olarak yazdiriniz:
    public static void printAllSortWithLastCharUpperDistinct2(List<String>list){
        list.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(Utils::getLastChar).reversed()).//t->t.charAt(t.length()-1) ==> lambda expression
            //  sorted(Comparator.reverseOrder()) .
        forEach(t-> System.out.print(t+" "));
    }

    //6. Tum list elemanlarini buyuk harf ile son harflerine gore artan sirada tekrarsiz olarak yazdiriniz.
    //  Uzunluklari ayni olan elemanlar alfabetik sirada
    public static void printAllSortWithLengthUpperDistinctSameLengthsInAlphabeticalOrder(List<String>list){

        list.
                stream().
                distinct().
                map(String::toUpperCase).//Method Reference denir.
                sorted(Comparator.comparing(String::length).
                thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);

    }

    //Example 7: Karakter sayisi 5 den fazla olan elemanlari siliniz:
//    public static List<String> removeElementIfTheLengthGreaterThanFive(List<String > list){
//        list.
//                removeIf(t->t.length()>5);
//
//        return list;
//    }


    //8. A ile baslayan veya d ile bitan elemanlari siliniz.
//    public static List<String> removeElementIfStartsWithAorEndsWithd(List<String > list){
//        list.removeIf(t->t.startsWith("A") || t.endsWith("d"));
//        return list.stream().distinct().collect(Collectors.toList());
//    }

    //9. List elemanlarini character sayilarinin karelerini aliniz ve bir list olarak ekrana yazdiriniz.
    public static List<Integer> printLengthSquare(List<String > list){

        return list.stream().map(Utils::getLengthSquare).collect(Collectors.toList());

    }

    //10. List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.
    public static List<String> printElementsLengthEven(List<String > list){
        return list.stream().filter(Utils::isLengthEven).collect(Collectors.toList());

    }



}
