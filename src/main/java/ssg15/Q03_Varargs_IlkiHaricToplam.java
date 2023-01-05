package ssg15;

public class Q03_Varargs_IlkiHaricToplam {

    public static void main(String[] args) {

        //verilen sayilardan ilk iki hariz tum sayilari toplayip ilk sayiyla carp

        int sayi1 = 5;
        int sayi2 = 7;
        int sayi3 = 2;
        int sayi4 = 4;
        int sayi5 = 9;

        sonuc(sayi1,sayi2,sayi3,sayi4,sayi5);

    }

    private static void sonuc( int sayi , int ... sonuc) {
        int sum = 0;
        for(int w:sonuc){
            sum=sum+w;

        }

        System.out.println("Sonuc = " + sum);
    }
}
