package ssg04;

import java.util.Scanner;

public class C06 {

    public static void main(String[] args) {

        //interviewQuestions1
        /*
         * Kullanicidan bir cumle ve bir harf alin,
         * Cumlede harfin kac kere
         * kullanildigini bulup, yazdirin
         *
         * ORNEK:
         *
         * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
         *
         * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Cumler giriniz. ");
        String str = input.nextLine().toLowerCase();


        System.out.println("harf giriniz..");
        char ch = input.next().toLowerCase().charAt(0);

        int counter = 0;

        for(int i=0; i<str.length();i++){

           if (str.charAt(i)==ch){
               counter++;
           }
            System.out.println("Girdiginiz "+ch+" karakteri "+counter+" kez kullanildi ");

            input.close();
        }







    }
}
