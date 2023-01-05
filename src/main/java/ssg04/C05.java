package ssg04;

public class C05 {

    public static void main(String[] args) {

        // Exm:   Str = Learn Java earn money
        // string i ters yazdir


        String s = "Learn Java earn money";

        for (int i =s.length()-1;i>=0;i-- ){

            char c = s.charAt(i);

            System.out.print(c);
        }


    }
}
