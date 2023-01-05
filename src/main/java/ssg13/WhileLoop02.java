package ssg13;

import java.util.Scanner;

public class WhileLoop02 {

    // bilgisayara 1 ile 100 arasinda bir sayi tutturun
    // kullanicidan bu sayiyi tahmin etmesini isteyin
    // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
    // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sayi=1;
        int toplam = 0;
        int sayac = 0;

        do{
            System.out.println("Lutfen bir sayi giriniz");
            sayi= input.nextInt();
            toplam+=sayi;
            sayac++;

        }while(sayi!=0);
        System.out.println(sayac + " sayi girdiniz ve toplami : " + toplam);


    }
}
