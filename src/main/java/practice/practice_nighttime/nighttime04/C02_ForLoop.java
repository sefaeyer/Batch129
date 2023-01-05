package practice.practice_nighttime.nighttime04;

import java.util.Scanner;

public class C02_ForLoop {

    public static void main(String[] args) {

// Girilen bir stringin harflerini teker teker ekrana alt alta olacak
// sekilde yazdiriniz, bosluk " " veya 'a' harfi geldiginde bunlari yazmasin


        /*gazi antep
        g
        z
        i
        n
        t
        e
        p

         */


        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir ifade giriniz");
        String str = input.nextLine();

        for (int i = 0; i < str.length() ; i++) {

            if(str.charAt(i)=='a'  || str.charAt(i)==' '){
                continue;
            }

            System.out.println(str.charAt(i));

        }



    }
}
