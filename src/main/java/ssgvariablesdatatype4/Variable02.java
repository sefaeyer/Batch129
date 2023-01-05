package ssgvariablesdatatype4;

public class Variable02 {

    public static void main(String[] args) {

        //  /2- isim ve soyisim icin iki variable olusturun ve bunlari
        //	isminiz : Sefa
        //	soyisminiz : Eyer

        String name = "Sefa";
        String surName = "Eyer";
        String fullName = name + surName;
        System.out.println(name +" "+surName);


        //6- Bir tamsayi, bir de char degisken olusturun ve bunlarin toplamini yazdirin.
        int sayi5=20;
        char harf='a';

        System.out.println(sayi5+'a');//20+97=117
        System.out.println(""+sayi5+'a');//20a

        // 1- Farkli 3 data turunde variable olusturun ve bunlari yazdirin
        String okulIsmi="yildiz kolej";
        char ilkharf= 'Y';
        int yil=2019;

        System.out.println(okulIsmi.charAt(0)+" "+ okulIsmi.charAt(okulIsmi.length()-1));


    }

}
