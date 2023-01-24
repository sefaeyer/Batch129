package advanced_practice.advanced_practice11.abstraction_alan_hesaplama;

public class AbstractionRunner {

    //Dikdörtgen ve üçgenin alanlarını hesaplayan bir kod yazınız.(abstraction kullanın)

    public static void main(String[] args) {

        Dikdortgen dikdortgen = new Dikdortgen();
        System.out.println(dikdortgen.AlanHesapla(5,4));
        System.out.println(dikdortgen.AlanHesapla(7,4));


        Ucgen ucgen = new Ucgen();
        System.out.println(ucgen.AlanHesapla(6,2));
        System.out.println(ucgen.AlanHesapla(10,5));
    }

}
