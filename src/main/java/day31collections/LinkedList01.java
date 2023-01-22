package day31collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedList01 {

    /*
        1. Interface lerden object olusturulamaz cunku interface lerin constructor i yoktur.
        2. Abstract Class lardan object olusturulamaz, constructor lari vardir ama object olusturmada kullanilamaz.
        3. Interface lerin constructor lari olmadigindan collection olustururken interface isimleri new keyword undan sonra kullanilamaz.
        4. Class --> class ==>  extends
           class --> interface ==> implements
           interface --> interface ==> extend
           interface --> class ==x BU MUMKUN DEGILDIR
        5)ArrayList'ler eleman silme ve eleman eklemede basarisizdirlar o yuzden eleman silme ve ekleme islemleri coklukla
            yapilacaksa ArrayList kullanmak tavsiye edilmez.
        6)LinkedList'lerde eleman yerine "Node" kelimesi kullanilir. En bastaki Node'a "Head", en sondaki Node'a "Tail" denir.
        7)LinkedList'ler yapiları dolayisiyla index kullanmadıklarından, eleman silmede ve eklemede re-index yapilmasına gerek yoktur.
            Bu da LinkedList'leri eleman ekleme ve silmede çok başarılı hale getirir, bu yüzden eleman ekleme ve silmenin çok yapılması
            gereken durumlarda LinkedList kullanmak tavsiye edilir.
        8)LinkedList'lerde "search" islemi zor yapilir cunku LinkedList'ler index kullanmaz index kullanmayinca herhangi
            bir elemani bulmak icin en bastan tum elemanlar kontrol edilir bu da cok fazla is demektir.

     */
    public static void main(String[] args) {

        List<String> cityNames = new LinkedList<>();

        LinkedList<String> names = new LinkedList<>();
        names.add("Steve");
        names.add("Ajda");
        names.add("Raj");
        names.add("Megan");
        names.add("Brandon");

        System.out.println(names);// [Steve, Carl, Raj, Megan, Brandon]

        names.addFirst("Cuneyt");
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon]

        names.addLast("Ajda");//This method is equivalent to add().
        System.out.println(names);//[Cuneyt, Steve, Carl, Raj, Megan, Brandon, Ajda]

        names.add(3,"Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Carl, Raj, Megan, Brandon, Ajda]

        names.remove("Ajda");// Ilk Ajdayi siler
        System.out.println(names);

        names.remove(4);
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda]

        names.add("Suleyman");
        names.add("Suleyman");
        System.out.println(names);//[Cuneyt, Steve, Suleyman, Raj, Brandon, Ajda, Suleyman]

        String r1 = names.remove();//Retrieves and removes the head (first element) of this list. (Cut + Paste)
        System.out.println("r1 = " + r1);//r1 = Cuneyt
        System.out.println(names);//[Steve, Suleyman, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeFirstOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman, Suleyman]

        names.removeLastOccurrence("Suleyman");
        System.out.println(names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        // Retrieves, but does not remove, the head (first element) of this list. (Copy + Paste)
        // Returns: the head of this list, or null if this list is empty
        String r2 = names.peek();
        System.out.println(r2);//Steve
        System.out.println( names);//[Steve, Raj, Brandon, Ajda, Suleyman]

        // Retrieves removes the head (first element) of this list. (Cut + Paste)
        // Returns: the head of this list, or null if this list is empty
        // remove  bos linkedlist te kullanilirsa hata verir,poll() bos linkedlist te kullanilirsa null verir.
        names.poll();

        // Retrieves removes the head (first element) of this list. (Cut + Paste)
        names.pop();

    }
}
