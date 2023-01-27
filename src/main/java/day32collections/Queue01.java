package day32collections;

import java.util.LinkedList;
import java.util.Queue;

public class Queue01 {

    /*
        Queue larda ilk gelen ilk isleme girer. FIFO

     */

    public static void main(String[] args) {

        Queue<String> myQueue = new LinkedList<>();
        myQueue.add("Milk");
        myQueue.add("Butter");
        myQueue.add("Jam");
        myQueue.add("Egg");
        myQueue.add("Luxury water");

        System.out.println("myQueue = " + myQueue);


        //Ilk eleman ile ilgili method lar

        myQueue.poll();

        myQueue.element();

        myQueue.peek();

        myQueue.remove();

         /*
            poll() ile remove() ikisi de ilk elemanı siler ve size verir.
            poll() bos "Queue" lar icin "null" verir, remove() ise "Queue" lar icin Exception atar.
         */
        /*
            element() ile peek() ikiside ilk elemani silmeden size verir.
             peek() bos "Queue" lar icin "null" verir, element() ise bos "Queue" ler icin Exception atar.
         */

        myQueue.offer("Avocado");
        System.out.println("myQueue = " + myQueue);
    }

}
