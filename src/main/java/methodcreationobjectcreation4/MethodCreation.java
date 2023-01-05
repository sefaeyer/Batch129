package methodcreationobjectcreation4;

public class MethodCreation {

    // string’i yazdiran method olusturalim
    // hosgeldiniz diyen bir method olusturun
    // kapanma mesaji yazn bir method olustur
    //degerli arkadaslar SSG dersimizde Hosgeldiniz
    //Ali can Bey
    // Iki saynini Bolma yapiniz
    //2//
    // Bizi tercih ettiginiz icin tesekkur ederiz

    public static void hosGeldinizSsgDersleri(){
        System.out.println("degerli ark SSG hosgeldnz");
    }

    public static void StringYazdir(){
        System.out.println("Iki sayiyi ekleme yapiniz");
        Calculator.ekleme(12,5);//17
    }
    public static void isimVeSoyIsimYazdir(String isim,String soyisim){
        System.out.println(isim + " "+soyisim);
    }

    public static void KapanmaMethodu(){
        System.out.println("bizi tercih ettiginiz icin tesekkur ederiz");
    }

    public static void main(String[] args) {
        hosGeldinizSsgDersleri();
        isimVeSoyIsimYazdir("Sefa", "Eyer");
        Calculator.ekleme(8,9);
        StringYazdir();
        KapanmaMethodu();








    }
}
