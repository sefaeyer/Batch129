package ssg10;

import java.util.Arrays;

public class Md02 {

    //Example bir integer multidimensional array olustur
    // toplam eleman sayisini console a yazdiriniz.

    public static void main(String[] args) {

        int a[][]= { {13,213,4},{12,87},{4,7,1,9},{99} };
        System.out.println(Arrays.deepToString(a));

        int sum= 0;

        for (int [] w : a){

            sum = sum+w.length;

        }
        System.out.println(sum);

    }




}
