package ssg18;

import java.util.ArrayList;
import java.util.List;

public class Lists03 {

    public static void main(String[] args) {

        // verilen bir array'den istenen elementi(kac tane varsa) silip, kalanlari
        // yeni bir list  olarak yazdiran bir method olusturun

        int arr[]={3,4,2,3,5,7,3,8,5,2,4};

        int istenmeyenElem=4;
        System.out.println("===========");
        istenmeyenElemanSilveYaz(arr,3);



    }

    public static void istenmeyenElemanSilveYaz(int [] arr , int istenmeyeneleman){

        List<Integer> list = new ArrayList<>();

        for(Integer w: arr){
            if(w!=istenmeyeneleman){
                list.add(w);
            }

        }

        System.out.println(list);




    }

}
