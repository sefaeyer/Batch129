package day13whileloopdowhileloop;

import java.util.Scanner;

public class WhileLoop01 {

    public static void main(String[] args) {

        /*
        //    Example 1: Kullanicinin verdigi sayi icin carpim tablosu olusturup console a yazdiriniz
        //               3 ==> 3x1=3  3x2=6  3x3=9  3x4=12  3x5=15...
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Carpim tablosunu gormek istediginz sayiyi giriniz..");
        int num = input.nextInt();

        int i = 1;

        while (i<11){

            System.out.println(num +"x" + i + "=" + (num*i));

            i++;
        }

        //    Example 2: Verilen bir string te her harfin sonrasina "*" sembolunu yazdiriniz
        //          Java ==> J*a*v*a*

        System.out.println("Bir kelime giriniz..");
        String word = input.next();
        String newWord = "";

        int k = 0;

        while(k<word.length()){

            newWord = newWord + word.charAt(k) + "*";

            k++;

        }

        System.out.println(newWord);
    }
}
