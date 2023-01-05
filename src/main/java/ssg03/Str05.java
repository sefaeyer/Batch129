package ssg03;

public class Str05 {

    public static void main(String[] args) {

        String str = "bu4ak17654";
        str = str.replaceAll("[\\d]","*");//[a-zA-Z]
        System.out.println(str);

    }
}
