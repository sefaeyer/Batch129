package day10switchloops;

public class Loops01 {

    /*
        Code Standarts
        i) Tekrar(Repetition) olmamalidir
        ii) Dynamic olmalidir
        iii) Tamir(fix) ve update kolay yapilabilmelidir
     */

    public static void main(String[] args) {

        //Example 1: Ekrana 5 kere "Hi" yazdiriniz
        //1. Yol: Tavsiye edilmez
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");

        //2. Yol:
        //Ayni adimlar tekrar tekrar yapilmasi gerektiginde "Loop" lar kulanilir.
        //Dort tane loop var: for-loop, while-loop, do-while-loop, for-each-loop

        //for-loop
        //   Baslangic degeri  Loop un calisma sarti   Increment/Decrement
        for (int i = 3; i < 6; i++) {
            System.out.println("Hi!");
        }

        //Example 2: 11 den 14 e kadar tum tam sayilari ekrana yazdiran kodu olusturunuz
        for (int i = 11; i < 15; i++) {

            System.out.println(i);

        }

        //Example 3: 40 den 23 e kadar tum cift tam sayilari ekrana yazdiran kodu olusturunuz
        //1. yol:    Tercih edilmez
        for (int i = 40 ; i>22 ; i-=2){
            System.out.println(i);
        }

        //2. yol:
        for (int i = 40; i > 22; i--) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        //Example 3: 18 den 56 ya kadar tum tek tam sayilari ekrana yazdiran kodu olusturunuz

        for(int i = 18; i<57 ; i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }



    }
}
