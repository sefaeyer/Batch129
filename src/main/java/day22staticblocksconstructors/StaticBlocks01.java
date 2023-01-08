package day22staticblocksconstructors;

public class StaticBlocks01 {

    //Bir variable olusturdugunuzda deger atamazsaniz o variable i initialize etmediniz demektir.
    //Static variable lar static block lar icinde initialize adilirse o class in icinde
    // herseyden once hazir hale getirilmis olur.
    // Bazen main method calistirilmadan once variable larin hazir hale getirilmesi gerekir bu yuzden static blocklar kullanilir.

    //Note 1. Static block lar static variable lari initialize etmek icin kullanilirlar.
    //Note 2. Static block lar class icinde herseyden once calistirilirlar.

    static double pi;
    static  String shape;

    public static void main(String[] args) {
        System.out.println(pi);
        System.out.println("main method");;
    }

    static{
        pi=3.14;
        System.out.println("Static Block 1");
    }

    static{
        shape = "Circle";
        System.out.println("Static Block 2");
    }

}
