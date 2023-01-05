package memorykullanimiasciitable;

public class AsciiValue01 {

    public static void main(String[] args) {

        char ch= 'A';
        char chh= 'B';
        System.out.println(ch);

        //1. yol
        System.out.println(ch+0);

        //2. yol
        int ch1='a';
        System.out.println(ch1);

        int soruIsareti='?';
        System.out.println(soruIsareti);

        //Soru:1: Buyuk A dan Buyuk Z ye kadar tum ascii degerleri bir program yazdirinz

        for (int i = 'A'; i <='Z' ; i++) {
            System.out.print(i+ " ");
        }

        System.out.println();

        for (int i = 'A'; i <='Z' ; i++) {
            System.out.println("ASCII Valuei " +(char)i+" " + i + " ");
        }



    }
}
