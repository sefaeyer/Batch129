package ssg04;

public class C04 {

    public static void main(String[] args) {

        //Example 2: Verilen bir stringte son 'e'dan sonraki tum karakterleri ters sirada yazdiriniz.
        //          "Germany" ==> yn olarak yazdir

        String str = "Germany";

        for (int i =str.length()-1; i>=0; i--){

            char ch = str.charAt(i);

            if (ch=='e'){
                break;
            }
            System.out.print(ch);
        }



    }
}
