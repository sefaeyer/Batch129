package ssg04;

import java.util.Arrays;

public class C02 {

    public static void main(String[] args) {

        //Example 2: Integer array olusturun icine 6 tane eleman ekleyin bu elemanlarin en buyugu ile en kucugunun
        //          toplamini ekrana yazdirin

        int numbers[] = new int [6];

        numbers[0]= 34;
        numbers[1]= 12;
        numbers[2]= 45;
        numbers[3]= 42;
        numbers[4]= 14;
        numbers[5]= 26;

        System.out.println(Arrays.toString(numbers));

//        Arrays.sort(numbers);
//        System.out.println(Arrays.toString(numbers));

//        System.out.println(numbers[0]+ numbers[numbers.length-1]);

        //2. Yol:
        System.out.println();
        int minimum = numbers[0];
        int maximum = numbers[0];

        for (int w :numbers){

            minimum = Math.min(minimum, w);
            maximum = Math.max(maximum, w);

        }

        System.out.println(minimum+maximum);



    }
}
