package day12forloopwhileloop;


public class WhileLoop01 {

    public static void main(String[] args) {

        //Example 1: 3'den 6'a kadar tamsayilari console'a yazdiriniz

        //1. Yol:

        for (int i = 3; i < 7; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        //2. Yol: while loop
        int i = 3;
        while (i < 7) {

            System.out.print(i + " ");

            i++;
        }
        System.out.println();

        //Example 2: 23'den 12'a kadar cift tamsayilari console'a yazdiriniz

        int k = 23;

        while (k > 11) {
            if (k % 2 == 0) {

                System.out.print(k + " ");
            }
            k--;
        }

        System.out.println();
        //Example 3: Verilen bir tam sayinin rakamlari toplamini konsola yazdiriniz.

        //1. yol: While Loop
        int m = -57;

        m = Math.abs(m);

        int sum = 0;

        while(m>0){


            sum = sum + m%10;

            m/=10;//bolme ile decrement yapma
        }

        System.out.println(sum);

        //
        //2: Yol: For Loop
        //

        int a = 684;//18

        int toplam = 0;

        for(int n = a; n>0; n/=10){

            toplam = toplam + n%10;

        }

        System.out.println(toplam);


    }
}
