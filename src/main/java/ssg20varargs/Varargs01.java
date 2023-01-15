package ssg20varargs;

public class Varargs01 {

    public static void main(String[] args) {

        // birden fazla sayilari toplayan bir method olustur

        add(3);
        add(3,4);
        add(4,5,6);
        add(1,2,3,4,5,6,7,8,9,10);

        //array ===

    }

    public static void add (int... a ){

        int sum =0;// local variable

        for(int w:a){
            sum=sum+w;

        }
        System.out.println(sum);

    }


}
