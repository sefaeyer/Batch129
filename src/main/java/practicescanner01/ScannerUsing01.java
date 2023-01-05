package practicescanner01;

import java.util.Scanner;

public class ScannerUsing01 {

    public static void main(String[] args) {

        //  uzunluk, genişlik, yükseklik olan dikdörtgenler prizmasının hacmini hesaplayan bir program yazıniz
        // İpucu: dikdörtgenin hacmi= width*height*length;

        Scanner input =new Scanner(System.in);
        System.out.println("Uzunlugu giriniz");
        int length= input.nextInt();

        System.out.println("Genisligi  giriniz");
        int width= input.nextInt();


        System.out.println("Uzunlugu giriniz");
        int height= input.nextInt();

        System.out.println("dikdörtgen Hacmi : "+ length*width*height);

        System.out.println("dikdörtgen Hacmi : "+ dikdortgenHascmi(length,height,width));

    }
    public static int dikdortgenHascmi(int lenght, int width,int hieght){
        return lenght*width*hieght;

    }
}
