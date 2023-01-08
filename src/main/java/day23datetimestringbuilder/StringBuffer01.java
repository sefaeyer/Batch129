package day23datetimestringbuilder;

public class StringBuffer01 {

    /*
            String olusturmak icin String class, StringBuilder ve StringBuffer kullanilabilir.
            1. StringBuffer java nin String uretmek icin olusturdugu ilk class tir. Java 5 te uretilmisdir
            2. StringBuffer synchronized dir, StringBuilder synchronized degildir
            3. StringBuffer thread-safe dir, StringBuilder thread-safe degildir.
            4. StringBuffer ve StringBuilder ikisi de mutable dir

            Note 1: Immutable String lazim oldugunda String class kullaniriz.
            Note 2: Mutable String lazim oldugunda StringBuilder veya StringBuffer kullaniriz
            Note 3: StringBuffer Multitread ve synchronization lazim oldugunda tercih edilir.
                    StringBuilder Multitread ve synchronization gerekmezse tercih edilir.
     */

    public static void main(String[] args) {

        StringBuffer sbf = new StringBuffer("Java");
        System.out.println(sbf);

        System.out.println(sbf.capacity());//20


    }

}
