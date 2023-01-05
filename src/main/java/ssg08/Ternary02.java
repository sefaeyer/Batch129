package ssg08;

import java.util.Scanner;

public class Ternary02 {

    public static void main(String[] args) {

        // kullanicidan bir tamsayi alip tek mi cift mi yazdiran bir kod yazalim

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int sayi= scan.nextInt();

        System.out.println(sayi%2==0 ? "cift" : "Tek");

        System.out.println("************");

        String str = sayi%2==0 ? "cift" : "Tek";
        System.out.println(str);
    }
}
