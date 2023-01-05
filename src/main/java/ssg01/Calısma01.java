package ssg01;

public class Calısma01 {

    //Odev1: Dikdortgen alan hesaplayan method olustur ve kullan
    //Odev2: Dikdortgenin cevresini hesaplayan method olustur ve kullan
    //Odev3: Dairenin cevresini hesaplayan method olustur ve kullan
    //Odev4: Dairenin alanını hesaplayan method olustur ve kullan

    public static void main(String[] args) {

        //int circleAreaResult = circleArea(3);
       // System.out.println("Dairenin Alani : "+circleAreaResult);

        int ddAlanSonuc = ddAlan(4,5);
        System.out.println("Dikdorten Alani : "+ ddAlanSonuc);

        int ddCevreSonuc = ddCevre(4,5);
        System.out.println("Dikdortgenin Cevresi : "+ddCevreSonuc);


    }

    public static int circleArea(int a){
        return 3*a*a;
    }

    public static int ddAlan(int a, int b){
        return a*b;
    }

    public static int ddCevre(int a, int b){
        return 2*(a+b);
    }






}
