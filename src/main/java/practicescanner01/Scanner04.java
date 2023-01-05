package practicescanner01;

import java.util.Scanner;

public class Scanner04 {

    public static void main(String[] args) {

        //Kullanıcıdan bir tamsayı girmesini iste ve ardından
        // tamsayı çift ise “Çift” yazsin
        // tamsayı tek ise “Tek” yazsin

        Scanner input  = new Scanner(System.in);
        System.out.println("Cift veya Tek sayi kontrol etmek icin bir tam sayi giriniz ... ");

        int sayi = input.nextInt();

        if(sayi%2==0){
            System.out.println("Sayi cifttir..");
        }else if(sayi%2!=0){
            System.out.println("Sayi tektir..");
        }else{
            System.out.println("Gecersiz sayi..");
        }


    }
}
