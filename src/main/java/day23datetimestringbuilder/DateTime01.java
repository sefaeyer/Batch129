package day23datetimestringbuilder;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime01 {

    public static void main(String[] args) {


        //Example 1. Time i formatlayiniz
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

        //hh ==> 12 lik saat sistemini kullanir.   -  HH==> 24 luk saat sistemini kullnir
        //formatin yanina bosluk birakip a yazarsaniz am veya pm yazar. "hh:mm a"
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm:ss a");

        System.out.println(dtf.format(myTime));


    }
}
