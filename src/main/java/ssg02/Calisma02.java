package ssg02;

import java.util.Scanner;

public class Calisma02 {

    public static void main(String[] args) {

        /*
                Example 1: Asagidaki sekli cizen kodu yaziniz
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
         */

        Scanner input = new Scanner(System.in);

        System.out.println("satir sayisi giriniz..");
        int satir = input.nextInt();

        for(int i = 1; i<=satir;i++){
            for(int k=1; k<=satir;k++){
                System.out.print(k+" ");

            }
            System.out.println();
        }


    }
}
