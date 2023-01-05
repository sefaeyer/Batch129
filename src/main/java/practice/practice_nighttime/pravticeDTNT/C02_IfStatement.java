package practice.practice_nighttime.pravticeDTNT;

import java.util.Scanner;

public class C02_IfStatement {

    public static void main(String[] args) {

        /*
        Kullanicidan alacaginiz 2 sayiyi yine kullaniciya sectireceginiz dort islemden biri ile isleme koyup yazdiriniz.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen\ntoplama yapmak icin 1, \ncikarma yapmak icin 2, \ncarpma yapmak icin 3, " +
                "\nbolme yapmak icin 4 giriniz ...");//kullaniciya secmesi icin menu olusturdum
        int islem = input.nextInt();

        System.out.println("Lutfen iki tane tam sayi giriniz...");

        double num1=input.nextDouble();
        double num2=input.nextDouble();

        if(islem ==1){
            System.out.println("Toplama islemi sonucu : "+num1+" + "+num2+" = "+(num1+num2));
        }else if(islem==2){
            System.out.println("Cikarma islemi sonucu : "+num1+" - "+num2+" = "+(num1-num2));
        }else if(islem==3){
            System.out.println("Carpma islemi sonucu : "+num1+" x "+num2+" = "+(num1*num2));
        }else if(islem==4){
            System.out.println("Bolme islemi sonucu : "+num1+" / "+num2+" = "+(num1/num2));
        }else{
            System.out.println("Hatali islem kodu girdiniz");
        }

    }
}
