package practice.practice_nighttime.pravticeDTNT;

import java.util.Scanner;

public class C01IciBosUcgenLoop {

    public static void main(String[] args) {

        /*

                      *
                     * *
                    *   *
                   *     *
                  * * * * *

        */

     //   Scanner input = new Scanner(System.in);
     //   System.out.println("satir sayisi giriniz..");
     //   int row = input.nextInt();
        int row = 5;

        for(int i=1; i<=row; i++){
            for(int bosluk = row; bosluk >=i; bosluk--){
                System.out.print(" ");

            }
            for(int yildiz = 1; yildiz<=i; yildiz++){

                if ( yildiz == 1 || yildiz == i){
                    System.out.print("* ");
                }else if(i==row){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }

            }

            System.out.println();
        }

    }

}
