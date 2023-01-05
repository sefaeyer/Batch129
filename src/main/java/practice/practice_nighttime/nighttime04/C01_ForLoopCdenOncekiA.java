package practice.practice_nighttime.nighttime04;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class C01_ForLoopCdenOncekiA {

    public static void main(String[] args) {

         /*
            Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki ilk
            'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
         */

        //alakacaranlik ==> 2

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen c ve a harflerini iceren bir cumle giriniz");
        String str = input.nextLine().toLowerCase();

        int sayac = 0;
        if (str.contains("a") && str.contains("c")) {

            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == 'a') {

                    sayac++;

                } else if (str.charAt(i) == 'c') {
                    break;
                }//else if

            }//for loop

            System.out.println("c den onceki a larin sayisi: " + sayac);
        }

        else
            System.out.println("c ve a harflerinin her ikisini icermelidir..");


    }
}
// if(str.contains("a")&& sadaadadadadtr.contains("c")){
//         for (int i = 0; i < str.length(); i++) {
//              if (str.charAt(i) == 'a') {
//              sayac++;
//           } else if (str.charAt(i) == 'c') {
//                   break;
//           }//else if
//              }//for loop
//        System.out.println("c'den onceki a'larin sayisi : "+sayac);
//              }else
//        System.out.println("Lutfen 'c' ve 'a' harflerini iceren bir cumle giriniz");
