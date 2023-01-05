package ssg11;

import java.util.Scanner;

public class IfElseIf {

    public static void main(String[] args) {

        // Soru 2) Kullanicidan 100 uzerinden notunu isteyin.
        // Not'u harf sistemine cevirip yazdirin.
        // 50’den kucukse "D",
        // =50  <60 arasi "C",
        // =60  <80 arasi "B",
        // =80’nin uzerinde ise "A"

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen aldiginiz notu girin");
        double notSayi = scan.nextDouble();

        if(notSayi<0 || notSayi>100){
            System.out.println("Gecerli bir sayi giriniz");
        }else if(notSayi<50){
            System.out.println("D");
        }else if(notSayi<60 ){
            System.out.println("C");
        }else if(notSayi<80 ){
            System.out.println("B");
        }else{
            System.out.println("A");
        }


    }
}
