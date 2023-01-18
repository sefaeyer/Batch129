package advanced_practice.Advanced_practice08;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Q01_NestedLoop_AtbashCode {

    /*
     Kullanıcıdan aldığınız bir metni 'Atbash Code' yöntemi ile şifreleyen bir kod yazınız.
     Ortadoğuda kullanılan en eski şifreleme biçimlerinden biridir.
     Arami alfabesinin tersten yazılması ile oluşturulan bir kodlayıcıya sahiptir.
     Örn: A-->Z, B-->Y ...
     "abcdefghijklmnopqrstuvwxyz";
     "zyxwvutsrqponmlkjihgfedcba";
    */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //1. Yol:

        System.out.println("metin gir");
        String metin = input.nextLine();
        String alfabe = "abcdefghijklmnopqrstuvwxyz";

        for (int i = 0; i < metin.length(); i++) {
            for (int j = 0; j < alfabe.length(); j++) {

                if (metin.charAt(i) == alfabe.charAt(j)) {
                    System.out.print(alfabe.charAt(alfabe.length() - 1 - j));
                }
            }
        }

        //2. Yol:
        System.out.println("\n==2. Yol===");

        for (int i = 0; i < metin.length(); i++) {

            int index = 'z'-metin.charAt(i);
            System.out.print((char)('a' + index));

        }



    }
}
