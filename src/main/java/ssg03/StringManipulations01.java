package ssg03;

import java.util.Scanner;

public class StringManipulations01 {

    public static void main(String[] args) {

        //soru 1)Girilen iki String veriyi karşılaştıran Java kodu yazınız.


        String a = "Java iyidir.";
        String b = "Java IYIDIR.";

        System.out.println(a.equalsIgnoreCase(b));


        //Soru 2) Kullanicidan email adresini girmesini isteyin,
        //          mail@gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
        //          @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
        //          @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin

//        Scanner scan = new Scanner(System.in);
//        System.out.println("email giriniz..");
//        String email=scan.nextLine();
//
//        if(!email.contains("@gmail.com")){
//            System.out.println("Lutfen gmail hesabi giriniz");
//
//        }else if(email.endsWith("@gmail.com")){
//            System.out.println("Emil adresiniz kaydedildi");
//        }else{
//            System.out.println("Lutfen yazimi konrol edin");
//        }


        //Soru 3)Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        //      "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        //       iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        //       iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.

        String str = "JAVA buyuk dunya kucuk";
        str = str.toLowerCase();

        if(str.contains("buyuk")){
            System.out.println(str.toUpperCase());
        }else if(str.contains("kucuk")){
            System.out.println(str.toLowerCase());
        }else if(!(str.contains("buyuk"))&&(str.contains("kucuk"))){
            System.out.println("Cumlu kucuk veya buyuk kelimesi icermiyor");
        }else System.out.println("gegerger");

    }

}
