package ssgvariablesdatatype4;

public class Swap01 {

    public static void main(String[] args) {

        //example
        int sayi1=10;
        int sayi2=20;
        System.out.println("Swap’dan once sayi1: " + sayi1 + ", sayi2 : "+ sayi2);

        //1. yol
        // int temp = sayi1;
        // sayi1 = sayi2;
        // sayi2 = temp;
        // System.out.println("Swap’dan sonra sayi1: " + sayi1 + ", sayi2 : "+ sayi2);

        //2. Yol
        //sayi1=sayi1+sayi2;
        //sayi2=sayi1-sayi2;
        //sayi1=sayi1-sayi2;
        //System.out.println("Swap’dan sonra sayi1: " + sayi1 + ", sayi2 : "+ sayi2);


        //example
        int s1=10;
        int s2=20;
        System.out.println("Swap’dan once s1: " + s1 + ", s2 : "+ s2);

        s1=s1+s2;//30
        s2=s1-s2;//10
        s1=s1-s2;//20

        System.out.println("Swap’dan sonra s1: " + s1 + ", s2 : "+ s2);

    }
}
