package day37lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Lambda03 {

    public static void main(String[] args) {

        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        //1. Tum averageScore larin 91 den buyuk olup olmadigini kontrol eden kodu yaziniz.
        boolean result1 = coursesList.stream().allMatch(t -> t.getAverageScore() > 91);
        System.out.println("result1 = " + result1);

        //2/ Kurs isimlerinden en az birinin Turkish icerip icermedigini kontrol eden kodu yaziniz.
        boolean result2 = coursesList.stream().anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println("result2 = " + result2);

        //3. Average Score u en yuksek olan kursun ismini console a yazdiran kodu yaziniz.
        String result3 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore).
                        reversed()).
                findFirst().
                get().
                getCourseName();
        System.out.println("result3 = " + result3);

        //4. Tum Course objelerini Average Score a gore kucukten buyuge diziniz ve
        // ilk ikisi haric liste halinde console a yazdiran kodu yaziniz.
        List<Course> myList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                skip(2).
                collect(Collectors.toList());
        System.out.println("myList = " + myList);

        //5. Tum Course objelerini Average Score a gore kucukten buyuge diziniz ve
        // ilk ucunu liste halinde console a yazdiran kodu yaziniz.
        List<Course> yourList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).limit(3).collect(Collectors.toList());
        System.out.println("yourList = " + yourList);

        //6. Tum Course objelerini Average Score a gore kucukten buyuge diziniz ve
        //  ucunuyu console a yazdiran kodu yaziniz.
        Course result5 = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).skip(2).limit(1).findFirst().get();
        System.out.println("result5 = " + result5);

    }
}
