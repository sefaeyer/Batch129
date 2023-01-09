package ssg18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists04 {

    public static void main(String[] args) {

        // verilen bir array'i listeye cevirin

        String arr[]={"A" , "B" , "C"};
        System.out.println(Arrays.toString(arr));


        //1. Yol
        List<String> arraydenList = new ArrayList<>();
        for (String w:arr ){
            arraydenList.add(w);
        }
        System.out.println(arraydenList);


        //2. Yol
        List<String> arraydenList2 = Arrays.asList(arr);
        System.out.println(arraydenList2);


        //3. Yol
        List<String> list3 = new ArrayList<>(List.of(arr));
        System.out.println(list3);


    }
}
