package ssg02;

import java.util.Scanner;

public class Calisma01 {

    public static void main(String[] args) {

        /*
      Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz
            X X X X X
            X X X X X
            X X X X X
        */

        Scanner input = new Scanner(System.in);

        System.out.println("sutun sayisi giriniz..");
        int sutun = input.nextInt();

        System.out.println("satir sayisi giriniz..");
        int satir = input.nextInt();

        for(int i = 1; i<=satir; i++){


            for(int k = 1; k<=sutun; k++){


                System.out.print("X ");
            }

            System.out.println();
        }


    }
}
