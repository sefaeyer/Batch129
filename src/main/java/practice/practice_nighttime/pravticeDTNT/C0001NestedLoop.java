package practice.practice_nighttime.pravticeDTNT;

import java.util.Scanner;

public class C0001NestedLoop {

    public static void main(String[] args) {


        //EX: Dikey olarak bolunen bir agac sekli ciziniz.. agacin tac uzunlugunu kullanicidan aliniz..
        // Not :govde sabit sayi =5 olsun

        /*


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


        */

        Scanner input = new Scanner(System.in);
        System.out.println("tac uzunlugunu giriniz..");
        int tac = input.nextInt();
        
        String yaprak = "";

        for (int i = 0; i < tac; i++) {

            yaprak+="^";

            System.out.println(yaprak);

            
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println("|||");

        }

    }
}
