package advanced_practice.advanced_practice09.q02_overriding;

public class Q02_Kredi_MethodOverriding {
    //Bir bankdan kredi alan musteri turlrine gore objeler olusturarak kaydeden bir kod yaz
    //Emekli: %12 standart faiz, Isci: %15 isci orani, Memur: %10 memur orani

    public static void main(String[] args) {


        Emekli emekli1 = new Emekli();
        System.out.println("emekli1.faizHesapla(2000) = " + emekli1.faizHesapla(100));

        Isci isci1 = new Isci();
        System.out.println("isci1.faizHesapla(100) = " + isci1.faizHesapla(100));

        Memur memur1 = new Memur();
        System.out.println("memur1.faizHesapla(100) = " + memur1.faizHesapla(100));
    }

}
