package advanced_practice.advanced_practice09;

import java.util.Scanner;

public class Q03_ForLoop_RakamlariTopla {
    /*
    Kullanicidan alinan bir string icersindeki rakamlarin toplamini hesaplayan bir method

    Orn:
    input: J4\/4 1$ 34$
    output: 16

    ipucu:
    Chaarcter.isDigit()
    Integer.valueOf()
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir string giriniz");


        System.out.println("rakamlariTopla(\"a1b2c3\") = " + rakamlariTopla("a1b2c3"));

    }

    public static double rakamlariTopla(String str){

        int toplam=0;
        for(int i=0; i<str.length(); i++){

            if(Character.isDigit(str.charAt(i))){
                toplam += Integer.parseInt(""+str.charAt(i));
            }
        }
        return toplam;

    }





}
