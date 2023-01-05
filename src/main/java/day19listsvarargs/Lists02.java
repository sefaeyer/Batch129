package day19listsvarargs;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lists02 {

    public static void main(String[] args) {

        /*
        Rastgele kullanici adi olusturan JAVA kodu yaziniz.
            1. Kullanicidan ismini isteyelim
            2. Kullanici adindaki bastaki ve sondaki bosluklari silelim.
            3. Kullanici adinin alinabilir olup olmadigina bakalim.
            4. Eger bizim listemizde oyle bir kullanici adi yoksa kullanici adi, kullanicinin girdigi isim olsun.
            5. Eger bu kullanici adi zaten varsa, sonuna rastgele sayi olusturup ekleyelim, ve gosterelim.
        */

        List<String> databaseIsim = new ArrayList();
        databaseIsim.add("AYSE");
        databaseIsim.add("AHMET");
        databaseIsim.add("SERDAR");
        databaseIsim.add("OKAN");
        databaseIsim.add("BETUL");


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kullanici adinizi giriniz...");
        String userName = scan.nextLine().toUpperCase().trim();

        //1. yol: Ramdom tam sayi icin
        //int random = (int)(Math.random()*100);
        //2. Yol:
        int random = new Random().nextInt(100);

        while(databaseIsim.contains(userName + random)){
            random = (int)(Math.random()*100);
        }

        if(databaseIsim.contains(userName) || databaseIsim.contains(userName + random)){

            System.out.println(userName + " kullaimda, tekrar kullanilamaz");
            databaseIsim.add(userName + (int)(Math.random()*100));
        }else{
            System.out.println("Bu username kullanilabilir");
            databaseIsim.add(userName);

        }
        System.out.println(databaseIsim);



    }
}
