package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop02 {

    public static void main(String[] args) {

        /*
            Kullanicidan br tam sayi aliniz
            Tamsayi 100 den kucuk ise kullaniciya ""kaybettiniz"" mesaji vererek oyunu sonlandiriniz.
            Tamsayi 100 ve 100 den buyuk ise "Kazandiniz" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);

        int num = 0;

        do{
            System.out.println("bir sayi giriniz..");
            num = input.nextInt();


            if(num>=100){
                System.out.println("Kazandiniz");
            }

        }while(num>=100);

        System.out.println("Kaybettiniz! Oyun Sonlandi!!");

    }

}
