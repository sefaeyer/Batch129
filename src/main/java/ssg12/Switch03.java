package ssg12;

import java.util.Scanner;

public class Switch03 {

    public static void main(String[] args) {

        // Ayakkabi Boyutu kontrol etmek için Java Programı
        // switch...case ifadesini kullanarak
        //Boyyutu icin size ler: small -Medium- Large- Extra -Large-unKnown-

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ayakkabi numarasi giriniz");
        int ayakkabiNo = scan.nextInt();

        String size = null;

        switch (ayakkabiNo){

            case 36:
            case 37:
            case 38:
                size="Small";
                break;

            case 39:
            case 40:
            case 41:
                size="Medium";
                break;

            case 42:
            case 43:
            case 44:
                size="Large";
                break;

            case 45:
            case 46:
            case 47:
                size="X Large";
                break;

            default:
                System.out.println("Gecerli numara giriniz");

        }

        System.out.println(size);
    }

}
