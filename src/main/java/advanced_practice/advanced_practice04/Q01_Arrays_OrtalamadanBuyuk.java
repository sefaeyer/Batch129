package advanced_practice.advanced_practice04;

import java.util.ArrayList;
import java.util.List;

public class Q01_Arrays_OrtalamadanBuyuk {

    public static void main(String[] args) {

        //Verilen bir Array'in elementlerinin ortalamasından büyük elementleri yazdıran bir kod yazınız.

        int[] arr = {5, 9, 15, 1, 0, 11,3};

        int toplam = 0;

        for(int w : arr){
            toplam+=w;
        }
        System.out.println("toplam = " + toplam);

        int ortalama = toplam / arr.length;
        System.out.println("ortalama : "+ortalama);

        for(int w : arr){
            if(w>ortalama){
                System.out.println(w);
            }

        }





    }



}
