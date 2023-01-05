package practicescanner01;

import java.util.Scanner;

public class Scanner03 {

    public static void main(String[] args) {

        //  Kullanıcıdan ad, ikinci ad, soyadı, SSN’yi alın ve ardından aşağıdaki gibi yazdırın
        //Ali Mert Can
        //kkno:123456789

        Scanner input =new Scanner(System.in);
        System.out.println("Adinizi giriniz : ");

        String isim = input.next();

        System.out.println("Ikinci isminizi giriniz : ");

        String ikinciIsim = input.next();

        System.out.println("Soyadinizi giriniz  : ");

        String soyIsim = input.next();

        System.out.println("Kimlik kart no giriniz : ");

        int kkno = input.nextInt();

        System.out.println(isim+" "+ikinciIsim+" "+soyIsim);
        System.out.println("KKNO : "+kkno);




    }
}
