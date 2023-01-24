package freepractice.fp04;

public class StatikKeyword {


    /*
        soru 1)bir static birde non-static(instance) variable olusturun ve arasindaki farklari inceleyin
     */

    static int sayi = 21;
    int rakam = 5;

    public static void main(String[] args) {

        System.out.println(sayi);
        StatikKeyword obj1 = new StatikKeyword();

        System.out.println(obj1.rakam);
        obj1.rakam++;
        sayi++;

        System.out.println(sayi);
        System.out.println(obj1.rakam);


    }
}
