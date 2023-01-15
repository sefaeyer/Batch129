package ssg20varargs;

public class Varargs02 {

    public static void main(String[] args) {

        // bir kisinin sisim soyisim ve adresi yazdiran bir method
        //Ornek: Ahmet Necip Kadikoy Istanbul

        NoVarargisimSoyisimAdres("Sefa","Eyer", "Adana");

//        display("Merhaba");//one argument
//        display("Sefa","Eyer","Adana");//3 arguments
//        display("Hos Geldiniz","!");// 2 arguments
        display2(35,"Merhaba","Sefa","Eyer","Adana");

    }

    public static void NoVarargisimSoyisimAdres(String isim, String soyisim, String adres){
        System.out.println(isim+" "+soyisim+" "+adres);
    }

    public static void display(String ... Value){
        for(String str:Value){
            System.out.print(str +" ");
        }
    }

    public static void display2(int a, String ... d){
        for(String w:d){
            System.out.print(w+" ");

        }
        System.out.println("Yas: "+a);
    }



}
