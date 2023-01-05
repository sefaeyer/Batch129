package day11forloop;

public class ForLoop03 {

    public static void main(String[] args) {

        //Example 1: Size verilen bir string i tersten yazdriniz
        //          "Germany" ==> ynamreG

        String s = "Java";

        String t = "";


        for (int i = s.length()-1;i>=0;i--){

            t = t + s.charAt(i);

        }
        System.out.println(t);


        //Example 2: Size verilen bir string in palindrome olup olmadigini kontrol eden kodu yaziniz
        //          civic, nalan, 11211 ==> palindrome

        //Logic: String i ters cevir sonra duz haliyle ters haliyle karsilastir, ayni isi "Palindrome" yazdir.

        String r = "Civic";
        String u = "";

        for(int i= r.length()-1;i>=0;i--){

            u = u + r.charAt(i);

        }
        if (r.equalsIgnoreCase(u)) {
            System.out.println(r + " Palindrome'dur..");
        }else{
            System.out.println(r + " Palindrome degildir..");
        }


    }
}
