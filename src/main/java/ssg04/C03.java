package ssg04;

public class C03 {

    public static void main(String[] args) {

        //Example 1: verilen bir string te ilk 'a' harfinden onceki tum characterleri konsola yazdiriniz
        //          I love Java==> "I love J"

        String str = "Tramvay";

        for (int i= 0; i<str.length();i++){

            char ch = str.charAt(i);

            if(ch=='a'){
                break;
            }

            System.out.print(ch);

        }
        System.out.println(" ");


    }
}
