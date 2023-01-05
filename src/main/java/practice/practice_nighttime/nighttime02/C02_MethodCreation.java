package practice.practice_nighttime.nighttime02;

public class C02_MethodCreation {

    public static void main(String[] args) {

        //Dikdortgenin alanini hesaplayan kodu yaziniz ve kullaniniz.
        System.out.println("Dikdortgenin Alani   : "+dikdortgenAlani(10, 5));
        System.out.println("Dikdortgenin Cevresi : "+dikdortgenCevre(12, 45));
        kareninAlani(25);

    }//main
    /*
        Access     static       data type   method ismi  (parametreler)
        modifier

     */
         public     static       int         dikdortgenAlani(int a, int b){

        return a*b;//carpmanin sonucunu kullaniciya verdim




    }

    //Dikdortgenin cevresini hesaplayan kodu yazip calistir



    public static int dikdortgenCevre(int a, int b){

             return 2*(a+b);


    }

    //Karenin alanini hesaplatan kodu yaziniz

    public static void kareninAlani(int a){
        System.out.println("Karenin Alani : "+(a*a));
    }

}//Class in body si
