package day22staticblocksconstructors;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Date;

public class DateTime01 {

    public static void main(String[] args) {

        //Date Class
        Date myDate = new Date();

        System.out.println(myDate);
        System.out.println(myDate.getTime());

        //Icinde bulundugumuz an nasil alinir

        System.out.println(LocalDate.now());

        System.out.println(LocalTime.now());

        System.out.println(LocalDateTime.now());

        //Dunyanin her hangi bir yerindeki saati nasil aliriz
        System.out.println(LocalDateTime.now(ZoneId.of("Asia/Tokyo")));
        System.out.println(LocalDateTime.now(ZoneId.of("Europe/Moscow")));

        //Ileriki bir tarihe nasil gidilir.
        System.out.println(LocalDate.now().plusYears(7).plusMonths(5).plusDays(35));

        //Geriki tarihe nasil gidilir
        System.out.println(LocalDate.now().minusYears(4).minusMonths(3).minusDays(2));

        //Ileriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().plusHours(3));

        //Geriki bir zamana nasil gidilir
        System.out.println(LocalTime.now().minusMinutes(45));

        //Zamanda belli bir bolumu nsail aliriz.
        System.out.println(LocalTime.now().getHour() + ":"+ LocalTime.now().getMinute());


        //Tarihte belli bir bolumu nsail aliriz.
        System.out.println(LocalDate.now().getMonthValue() + " : " + LocalDate.now().getDayOfMonth());

        //Iki tarih nasil karsilastirilir
        //02.13.2005 - 03/01/2007
        boolean result = LocalDate.of(2005,02,13).isAfter(LocalDate.of(2007,03,01));
        System.out.println(result);


        //Tarihlerin formatlari nasil degistirilir
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MMMM/yyyy");

        System.out.println(dtf.format(LocalDate.now()));
    }


}
