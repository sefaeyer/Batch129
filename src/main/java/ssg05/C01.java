package ssg05;

import java.util.Arrays;

public class C01 {

    public static void main(String[] args) {

        int num[] = new int[5];
        num[0]=11;
        num[1]=23;
        num[2]=134;
        num[3]=523;
        num[4]=6;

        Arrays.sort(num);

        System.out.println(Arrays.toString(num));
        System.out.println(num[0]+ num[num.length-1]);


    }
}
