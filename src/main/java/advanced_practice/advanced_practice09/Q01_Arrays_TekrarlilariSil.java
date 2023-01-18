package advanced_practice.advanced_practice09;

import java.util.Arrays;

public class Q01_Arrays_TekrarlilariSil {

    public static void main(String[] args) {

        int[] arr1 = {10,20,20,20,30,30,40,50,50,60,20,-5};
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr1);

        int idx=0;

        for(int i=0; i< arr1.length-1;i++){
            if(arr1[i]!=arr1[i+1]){
                arr1[idx]=arr1[i];
                idx++;
            }
        }

        arr1[idx]=arr1[arr1.length-1];
        idx++;

        System.out.println(Arrays.toString(arr1));

        int[]newArr = new int[idx];

        for(int i=0; i<idx; i++){
            newArr [i]=arr1[i];

        }
        System.out.println(Arrays.toString(newArr));

    }
}
