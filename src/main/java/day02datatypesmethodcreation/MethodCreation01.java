package day02datatypesmethodcreation;

public class MethodCreation01 {

    /*
            Java da method nasıl olusturulur?

            1) main method un disinda olusturulur.
            2) Access Modifier + Return Type + Method ismi + () + {}

            Olusturulan method lar nasıl kullanılır?
            1)main method un icinden kullanılır
            2)method un ismini + () yazın
            3) Islem yapacağınız sayıları parantezin içine koyun
     */

    public static void main(String[] args) {

        int sonuc = add(30,50);
        System.out.println(sonuc);

        long carpmaSonucu = multiply(3,6);

        System.out.println(carpmaSonucu);

        int islemsonuc = firstTwoMultiplyThirdAdd(2,4,6);
        System.out.println(islemsonuc);

        double kupbulma = ondalikKup(2);
        System.out.println(kupbulma);

    }

    public static int add(int a, int b){
        return a+b;
    }

    protected static long multiply(long a, int b){
        return a*b;

    }

    //Ornek1: Verilen uc sayıdan ilk ikisini carpan ve sonucu ucuncu sayı ile toplayan methodu olusturunuz ve kullanınız

    public static int firstTwoMultiplyThirdAdd(int a, int b, int c){
        return a*b+c;

    }

    //Ornek2: Verilen bir ondalık sayının kupunu hesaplayan methodu olusturup kullanınız.
 //Note: Access modifier i defoult yapmak için access modifier yazmayınız.

    static double ondalikKup(double a){
        return a*a*a;
    }

    //Odev1: Dikdortgen alan hesaplayan method olustur ve kullan
    //Odev2: Dikdortgenin cevresini hesaplayan method olustur ve kullan
    //Odev3: Dairenin cevresini hesaplayan method olustur ve kullan
    //Odev4: Dairenin alanını hesaplayan method olustur ve kullan

}
