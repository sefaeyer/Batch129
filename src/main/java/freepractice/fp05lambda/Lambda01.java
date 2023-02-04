package freepractice.fp05lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        elementlerBosluk(nums);
        System.out.println();
        ikiyeBolunenElementler(nums);
        System.out.println();
        tekSayiKare(nums);
        System.out.println();
        printCubeDistinctOddElement(nums);
        System.out.println();
        ciftSayiKareToplami(nums);
        sumOfNonDistinctEvenSquare(nums);
        enBuyukDeger(nums);
        minDeger(nums);
        yedidenBuyuk(nums);


    }

    //  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void elementlerBosluk (List<Integer>nums){
        nums.stream().forEach(t-> System.out.print(t+" "));
    }

//  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ikiyeBolunenElementler(List<Integer>nums){
        nums.stream().filter(t->t%2==0).forEach(t-> System.out.print(t+" "));
    }

    //  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina
    //  bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekSayiKare(List<Integer>nums){
        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));
    }

    //  Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni
    //  satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void printCubeDistinctOddElement(List<Integer>nums){
        nums.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t-> System.out.print(t+" "));
    }

    //7)Create a method to calculate the "sum" of the "squares" of "distinct" "even" elements
    //7. cift sayilarin tekrarsiz olarak kareleri toplami
    public static void ciftSayiKareToplami(List<Integer>nums){
        Integer sum = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
        System.out.println("sum = " + sum);

    }
    //8)Create a method to calculate the "product" of the "square" of "distinct" "even" elements
    //Tekrarsız sayıların karelerinin carpimini gösteren methodu yazınız
    public static void sumOfNonDistinctEvenSquare(List<Integer>nums){
        Integer productEvenSquare = nums.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(1,(t,u)->t*u);
        System.out.println("productEvenSquare = " + productEvenSquare);

    }

    //9)Create a method to find the "maximum value" from the list elements
    public static void enBuyukDeger(List<Integer>nums){
        Integer max = nums.stream().distinct().reduce(Integer.MIN_VALUE,(t,u)-> t>u ? t : u);
        System.out.println("max = " + max);
    }

    //10)Create a method to find the minimum value from the list elements
    public static void minDeger(List<Integer>nums){
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t,u) -> t<u ?  t : u );
        System.out.println("min = " + min);

    }

    //11)Create a method to find the minimum value which is greater than 7 and even from the list
    //   12 9 131 14 9 10 4 12 15 ==> 10 <-- 7 den buyuk en kucuk cift sayi
    public static void yedidenBuyuk(List<Integer>nums){
        Integer r1 = nums.stream().distinct().filter(t-> t>7 && t%2==0).sorted().reduce((t,u)->t).get();
        System.out.println("r1 = " + r1);
    }




}
