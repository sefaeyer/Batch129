package day37lambda;

import day36lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda01 {

    public static void main(String[] args) {

        List<Integer> myList = new ArrayList<>();

        myList.add(12);
        myList.add(8);
        myList.add(23);
        myList.add(10);
        myList.add(7);

        System.out.println(getSumOfAllElements(myList));
        System.out.println(getSumFromSevenToSeventy());
        System.out.println(getProductFromThreeToNine());
        System.out.println(getProductFromThreeToNine222());
        System.out.println(getFactorial(5));
        System.out.println(getSumOfEvensBetweenTwoInt(24, 14));
        System.out.println("getSumOfDigitsBetweenTwoInts(a,b) = " + getSumOfDigitsBetweenTwoInts(190, 180));


    }
    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.


    //Example 1: Verilen list'teki tum sayilarin toplamini veren method'u olusturunuz.
    public static int getSumOfAllElements(List<Integer> myList){
        return myList.stream().reduce(Math::addExact).get();
    }

    //Example 2: 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz.
    public static int getSumFromSevenToSeventy(){
        return IntStream.rangeClosed(7,70).reduce(Math::addExact).getAsInt();
    }
    //rangeClosed==> baslangis ve bitis araligi veriyor
    //Intstream==> integerlari yukardan asagi diziyor.


    //Example 3: 3 ten 9 a kadar tamsayilarin carpimini veren methodu olustur
    public static int getProductFromThreeToNine(){
        return IntStream.rangeClosed(3,9).reduce(Math::multiplyExact).getAsInt();
    }
    public static int getProductFromThreeToNine222(){
        return IntStream.range(3,10).reduce(Math::multiplyExact).getAsInt();
    }

    //4. Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz:
    public static int getFactorial(int x){
        if(x==0){
            return 1;
        }else if(x<0){
            System.out.println("Faktoriyel islemi negatif sayilarla yapilamaz");
            return -1;
        }else {
            return IntStream.rangeClosed(1, x).reduce(Math::multiplyExact).getAsInt();
        }
    }

    //5) Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    public static int getSumOfEvensBetweenTwoInt(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).filter(Utils::isNumberEven).sum();
    }

    //5) Size verilen iki tamsayi arasindaki tum tamsayilarin rakamlari toplamini veren kodu yaziniz.
    public static int getSumOfDigitsBetweenTwoInts(int a, int b){
        if(a>b){
            int temp = a;
            a=b;
            b=temp;
        }
        return IntStream.range(a+1,b).map(Utils::getSumOfDigits).sum();
    }

}
