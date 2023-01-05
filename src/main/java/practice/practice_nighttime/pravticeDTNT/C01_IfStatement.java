package practice.practice_nighttime.pravticeDTNT;

import java.util.Scanner;

public class C01_IfStatement {

    public static void main(String[] args) {

        /*
        kULLANICIDAN BIR GUN ALIN
        Eger gun cuma ise "Muslumanlar icin Kutsal Gun"
        Eger gun cumaretsi ise "Yahudiler Icin Kutsal Gun"
        Eger gun Pazar ise "Hristiyanlar Icin Kutsal Gun" yazdiran kodu olusturusunuz
         */

        Scanner input = new Scanner(System.in);
        System.out.println(" Lutfen Gun Ismi Giriniz...");
        String gun = input.next().toLowerCase();//kucuk harfe cevir

        if(gun.equals("cuma")){
            System.out.println("Muslumanlar icin Kutsal Gun");
        }else if(gun.equals("cumartesi")){
            System.out.println("Yahudiler icin Kutsal Gun");
        }else if(gun.equals("pazar")){
            System.out.println("Hristiyanlar Icin Kutsal Gun");
        }else{
            System.out.println("Kutsal Gun Degil");
        }


    }
}
