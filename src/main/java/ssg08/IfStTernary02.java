package ssg08;

import java.util.Scanner;

public class IfStTernary02 {

    public static void main(String[] args) {


        //Soru 1) Kullanicidan bir tamsayi isteyin
        // ve sayinin tek veya cift oldugunu yazdirin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();


        if(sayi%2==0){
            System.out.println(sayi + " cift sayidir");
        }

        if(sayi%2!=0){
            System.out.println(sayi + " tek sayidir");
        }


        if(sayi%2==0){
            System.out.println(sayi + " cift sayidir");


        }else{
            System.out.println(sayi + " tek sayidir");
        }

    }

}
