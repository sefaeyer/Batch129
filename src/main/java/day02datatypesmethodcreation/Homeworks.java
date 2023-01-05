package day02datatypesmethodcreation;

public class Homeworks {
    public static void main(String[] args) {

        int ddAlanBul = ddAlan(42,65);
        System.out.println(ddAlanBul);

        int ddCevreBul = ddCevre(42,65);
        System.out.println(ddCevreBul);

        double drAlanBul = drAlan(3.14,4);
        System.out.println(drAlanBul);

        double drCevreBul = drCevre(3.14, 4);
        System.out.println(drCevreBul);

        int ogrSayisiBul = ogrSayisi(15,26);
        System.out.println(ogrSayisiBul);


    }

    //Odev1:

    public static int ddAlan(int a, int b){
        return a*b;
    }

    //Odev2:

    protected static int ddCevre(int a, int b){
        return 2*a+2*b;
    }

    //Odev3:

    public static double drAlan(double a, double yaricap){
        //a yerine 3.14 yazınız
        return a*yaricap*yaricap;

    }

    //Odev4:

    public static double drCevre(double a, double yaricap){
        //a yerine 3.14 yazınız
        return 2*a*yaricap;
    }

    //Çalışma:

    public static int ogrSayisi(int a, int b){
        return a+b;
    }


}
