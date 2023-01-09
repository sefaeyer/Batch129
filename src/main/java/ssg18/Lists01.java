package ssg18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists01 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

//        List<Integer> list2 = new ArrayList<Integer>();
//
//        ArrayList<Integer> list3 = new ArrayList<>();
//
//        Collection<Integer> list4 = new ArrayList<Integer>();

        list.add(15);
        list.add(17);
        list.add(18);
        list.add(19);
        list.add(20);

        System.out.println(list);

        for(Integer w : list){
            System.out.println(w);
        }

        System.out.println("=====================");

        for (int i = 0; i < list.size(); i++) {

            System.out.println(list.get(i));

        }

    }

}
