package day21statickeyword;

import java.util.List;

public class StdRunner {

    public static void main(String[] args) {

        // stdName static oldugundan ona ulasmak icin object olusturmadim
        // sadece class ismini kullanmak yeterlidir
        System.out.println(Student.stdName);

        // age non static oldugundan ona ulasmak icin object olusturmak zorundayiz
        Student std1 = new Student();
        System.out.println(std1.age);

        String initials = Student.getInitials("Sefa Eyer");
        System.out.println("initials = " + initials);

        int vowels = std1.countVowels("Sefa Eyer");
        System.out.println("vowels = " + vowels);

        //static olanlari object ile cagirmak tavsiye edilmez
        String s = std1.getInitials("Sefa Eyer");
        System.out.println("s = " + s);


        //List olusturmada yeni bir yontem..
        List<String> names = List.of("Ali", "Veli", "Can", "Kemal");
        System.out.println(names);


    }
}
