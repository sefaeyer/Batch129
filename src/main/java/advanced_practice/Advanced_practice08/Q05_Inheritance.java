package advanced_practice.Advanced_practice08;

public class Q05_Inheritance {

    //Dairenin alanını hesalayan bir method oluşturunuz.(matematik işlemleri için inheritance kullanınız)

    public static void main(String[] args) {
        daireAlani(5);


    }

    static void daireAlani(int r){
        Daire daireObjesi = new Daire();
        System.out.println(daireObjesi.carpma(daireObjesi.piSayisi,daireObjesi.karesiniAl(r)) );
    }



}