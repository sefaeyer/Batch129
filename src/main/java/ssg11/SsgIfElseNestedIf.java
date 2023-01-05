package ssg11;

import java.util.Scanner;

public class SsgIfElseNestedIf {

        // girilen bir karakterin, harf olup olmadigini bulalim

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char karakter = scan.next().charAt(0);

        boolean buyukMuKucukMu = (karakter >= 'A'&& karakter<='z');
        if (buyukMuKucukMu) {
            System.out.println("Bu bir harf");
        }else{
            System.out.println("Bu bir harf degildir");
        }
    }
}
