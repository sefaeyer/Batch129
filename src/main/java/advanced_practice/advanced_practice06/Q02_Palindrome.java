package advanced_practice.advanced_practice06;

import java.util.Scanner;

public class Q02_Palindrome {

    //Bir String değerin Palindrome olup olmadığını kontrol eden bir kod yazınız.

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Bir String Deger Giriniz");
        String str = scan.nextLine().replaceAll(" ","").toLowerCase();
        String strReverse = "";

        for(int i=str.length()-1; i>-1; i--){

            strReverse += str.charAt(i);

        }

        if(strReverse.equals(str)){
            System.out.println("Bu bir  PALINDROME dur!!!");
        }else{
            System.out.println("PALINDROME degildir");
        }


    }
}
