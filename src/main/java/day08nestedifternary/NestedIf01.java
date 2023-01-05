package day08nestedifternary;

import java.util.Scanner;

public class NestedIf01 {

    /*
        Java "Negatif If" leri calistirirken cok zamana ihtiyac duyar. (Time Consuming)
        Bu yuzden biz mumkun oldugu kadar kullanmayin.
     */

    public static void main(String[] args) {

        /*
        Example 1: Kullanicidan 3 tane pozitif bir tamsayi aliniz.
                Bu 3 sayinin ucgen olusturma durumunu kontrol ediniz
        Eger ucgen ise "eskenar" Ucgen olma durumunu kontrol ediniz.
        INFO :
        Ucgen Olma Sarti: herhangi iki kenar toplami ucuncu kenarda buyuk olmali
                          herhangi iki kenar farki ucuncu kenardan kucuk olmali
        a+b>c>a-b
        a+c>b>a-c
        b+c>a>b-c
        a=b=c ise eskenar ucgen
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Ucgenin kenarlari icin 3 tane uzunluk giriniz...");

        //Kullanici yanlislikla negatif bir sayi girdiyse code asagidaki gibi yazilabilir.
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        boolean ucgenmi = (a+b>c && c>Math.abs(a-b)) && (a+c>b && b>Math.abs(a-c)) && (b+c>a && a>Math.abs(b-c));

        //Kullanicinin negatif bir sayi girmesini affetmiyorsam

        if(a<=0 || b<=0 || c<=0){

            System.out.println("Ucgenin kenarlari sifir ve negatif olamaz...");

        }else if(ucgenmi){

            if(a==b && b==c && c==a){
                System.out.println("Ucgen hem de Eskenar Ucgen...");

            }else{
                System.out.println("Ucgen ama Eskenar degil...");
            }

        }else{
            System.out.println("Sen Ucgen Degilsin...");
        }


    }
}
