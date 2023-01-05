package ssgvariablesdatatype4;

public class Variable01 {

    public static void main(String[] args) {

        int level = 12;
        System.out.println(level);

        String str = "A";
        System.out.println(str);

        char ch = 'a';
        System.out.println(ch);

        //Example:
        // 3 tam sayi degisken olusturun
        // bunlari konsolda tek tek yazidirin
        //toplamini yazdir
        //etiket koy yazdir

        int a = 5;
        int b = 6;
        int c = 7;

        System.out.println(a + " " +  b + " " + c);
        int sum = a+b+c;
        System.out.println(sum);
        System.out.println(a+b+c);
        System.out.println("Toplam  : "+ sum);
        System.out.println("Toplam  : " + (a+b+c));

        //2 Tamsayi degiskeni olusturun ve bunlarin carpimini etiketle konsolda yazdirin

        int d = 3;
        int e = 4;
        System.out.println("Carpim :"+d*e);


    }
}
