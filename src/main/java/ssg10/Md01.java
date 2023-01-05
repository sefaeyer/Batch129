package ssg10;

import java.util.Arrays;

public class Md01 {

    public static void main(String[] args) {

        int a [][]  = new int[3][2];
        System.out.println(Arrays.deepToString(a));

        a[1][1] = 5;
        a[2][0] = 1;
        a[2][1] = 9;
        a[1][0] = 3;
        a[0][1] = 7;
        a[0][0] = 4;

        System.out.println(Arrays.deepToString(a));

        System.out.println();

        System.out.println(Arrays.toString(a[1]));
        System.out.println(a[1][0]);

    }
}
