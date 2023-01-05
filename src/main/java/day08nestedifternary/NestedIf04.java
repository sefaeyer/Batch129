package day08nestedifternary;

import java.util.Scanner;

public class NestedIf04 {

    public static void main(String[] args) {

        /* Example 4:
        Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra

        Eger calisan kadin ise
            60 yasindan buyukse “Emekli Olabilir “yazdirin
        Eger calisan erkek ise
            65 yasindan buyukse “Emekli Olabilir” yazdiran kodu olusturunuz
        */

        Scanner input = new Scanner(System.in);

        System.out.println("Cinsiyetinizi giriniz... Erkek, Kadin, Diger");
        String gender = input.next();

        System.out.println("Yasinizi Giriniz...");
        int age = input.nextInt();

        if(age<0 || age>120){
            System.out.println("Lutfen Yasi 0 ile 120 Arasinda Giriniz...");

        }else if(gender.equalsIgnoreCase("Kadin")){

            if(age>60){
                System.out.println("Emekli Olabilir...");
            }else{
                System.out.println("Calismali");
            }
        }else if(gender.equalsIgnoreCase("Erkek")){

            if(age>65){
                System.out.println("Emekli Olabilir...");
            }else{
                System.out.println("Kesinlikle Calismali");
            }
        }else{
            System.out.println("Tanimli Degil...");
        }



    }
}
