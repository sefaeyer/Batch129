package day13whileloopdowhileloop;

import java.util.Scanner;

public class DoWhileLoop03 {

    public static void main(String[] args) {

        /*
                Gecerli: Username="admin" Password="pwd123" dur
                Kullanicidan username ve password alin
                username ve password dogru ise "Hesabiniza hosgeldiniz!" yazdirin.
                username ve password yanlis ise 4 kere "Username ve password unuzu giriniz" mesaji versin
                username ve password 4. kere yanlis girilirse "Hesabiniz Bloke Olmustur!" mesaji vererek islemi tamamlayiniz.
         */

        Scanner input = new Scanner(System.in);



        int counter = 0;

        do{

            if(counter==4){
                System.out.println("Hesabiiniz Bloke Olmustur!");
                break;
            }

            System.out.println("Username giriniz..");
            String username = input.next();

            System.out.println("Password giriniz..");
            String password = input.next();

            if(username.equals("admin") && password.equals("pwd123")){
                System.out.println("Hesabiniza Hosgeldiniz!");
                break;
            }
            counter++;
        }while(true);



    }
}
