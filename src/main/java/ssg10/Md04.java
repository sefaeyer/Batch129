package ssg10;

import java.util.Arrays;

public class Md04 {

    public static void main(String[] args) {

        // Example 1: Bir multi-dimensional array olusturunuz ve ve bir dimensionalli array e donusturunuz
        //            [ [2, 5], [3] , [4,7,11] ] ==> [2, 5, 3, 4, 7, 11]

        int a [][]= {{2,5},{4,7,11}};
        System.out.println(Arrays.deepToString(a));//[[2, 5], [4, 7, 11]]

        //a array indeki eleman toplam sayisini bulunuz

        int totalElement = 0;

        for (int[] w: a) {
            totalElement = totalElement + w.length;
        }
        // "b" isimli tek dimensional li bir array olusturuyoruz

        int b[] = new int [totalElement];

        //"a" arrayindeki elemanlari "b" array ine transfer ediniz
        int idx = 0;

        for(int[] w : a){
            for (int k:w){
                b[idx]=k;
                idx++;
            }
        }
        System.out.println(Arrays.toString(b));
    }
}
