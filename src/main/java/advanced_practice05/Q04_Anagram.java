package advanced_practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Q04_Anagram {

    public static void main(String[] args) {

        /*
       İki kelimenin "Anagram" olup olmadığını kontrol eden bir method oluşturunuz.
       - Anagram, başka bir kelimenin karakterlerinden yeni bir kelime oluşturmaktır. -
       Örn:
       * bahriyeli <> harbiyeli.
       * sızlanma <> anlamsız.
       * asya <> yasa.
       * Bursa Dağı <> su bardağı
       * kan ara <> Ankara.
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz..");
        String word1 = scan.nextLine();
        System.out.println("bir kelime daha giriniz..");
        String word2 = scan.nextLine();

        anagram(word1,word2);

    }//main

    public static void anagram(String word1, String word2){

        String [] arr1 = word1.toLowerCase().replaceAll(" ","").split("");
        String [] arr2 = word2.toLowerCase().replaceAll(" ","").split("");

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if(Arrays.equals(arr1,arr2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Anagram DEGIL!!");
        }

    }



}
