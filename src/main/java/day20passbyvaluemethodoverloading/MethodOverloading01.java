package day20passbyvaluemethodoverloading;

public class MethodOverloading01 {

    /*
        1. Method Overloadung yaparken method ismi degistirilmez
        2. Method Overloadung yaparken parametreler degistirilir
            i. Parametre degistirirken parametrelerin data type leri degistirilebilir.
            ii. Parametre degistirirken,parametrelerin data type'lari farklı ise yerleri degistirilebilir.
            iii. Parametre degistirirken,parametrelerin sayisi degistirilebilir.
        3. Java icin isim ve parametreleri ayni olan iki method tamamiyla aynidir
           Bu yuzden ismi ve parametre Method signature olarak adlandirilir
        4. Method Overloading olustururken return type i degistirmenin hicbir etkisi yoktur
           Method Overloading olustururken acces modifier i degistirmenin hicbir etkisi yoktur
           Method Overloading olustururken method u static veya non static yapmanin hicbir etkisi yoktur
           Method Overloading olustururken method body yi degistirmenin hicbir etkisi yoktur

        5. private method lar overload edilebilirler. Cunku method overloading sadece bir class in icinde olur
           private olmak ise baska class lara gidildiginde problem olusturur

        6. Static method lar overload edilebilirler.

     */

    public static void main(String[] args) {

        add(2,4);

    }
    private static void add(int a, int b){
        System.out.println(a+b);
    }
    private static void add(double a, double b){
        System.out.println(a+b);
    }

    private static void add(double a, int b){
        System.out.println(a+b);
    }

    private static void add(int a, double b){
        System.out.println(a+b);
    }

    private static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
