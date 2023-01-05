package day11forloop;

public class ForLoop01 {

    public static void main(String[] args) {

        //Example 1: verilen bir string te ilk 'a' harfinden onceki tumcharacterleri konsola yazdiriniz
        //          I love Java==> "I love J"

        String s = "Tramvay";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (ch=='a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println(" ");


        //Example 2: Verilen bir stringte son 'a'dan sonraki tum karakterleri ters sirada yazdiriniz.
        //          "Germany" ==> yn olarak yazdir
//        String t = "Germany";
//        for (int i=t.length()-1;i>=0;i-- ){
//
//            char sh = t.charAt(i);
//
//            if(sh(i)=='a'){
//                break;
//            }
//            System.out.print(sh);
        }
    }
