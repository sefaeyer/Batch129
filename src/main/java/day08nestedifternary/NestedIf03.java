package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {


        /*  Example 3:
            Password'un ilk harfi buyuk harf ise
            'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin

            Passwordun ilk harfi kucuk harf ise
            'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
            A ==> gecerli
            B C Ç D E F G Ğ H İ I J K L M N O Ö P R S Ş T U Ü V Y Z==> gecersiz
            a b c ç d e f g ğ h i ı j k l m n o ö p r s ş t u ü v y ==> gecersiz
            z ==>gecerli
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Password unuzu giriniz...");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if(firstChar>='A' && firstChar<='Z'){
            if(firstChar=='A'){
                System.out.println("Gecerli Password...");
            }else{
                System.out.println("Gecersiz Password cunku buyuk harf ama 'A' degil...");
            }
        }else if(firstChar>='a' && firstChar<='z'){
            if(firstChar=='z'){
                System.out.println("Gecerli Password");
            }else{
                System.out.println("Gecersiz Password cunku kucuk harf ama 'z' degil...");
            }
        }else{
            System.out.println("Ilk character harf olmali...");
        }
    }
}
