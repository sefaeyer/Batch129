package aaaadeneme2;

import java.util.ArrayList;

public class VeriBankasi {
    public static void doktorIsimleri() {

        String isim = "";
        Doktor doktor=new Doktor();
        ArrayList<String> doctorIsimleri = new ArrayList<>();

        doktor.setIsim(isim);
        doctorIsimleri.add("Nilson");
        doctorIsimleri.add("John");
        doctorIsimleri.add("Robert");
        doctorIsimleri.add("Marry");
        doctorIsimleri.add("Alan");
        doctorIsimleri.add("Mahesh");
    }

    public static void doktorSoyisimleri() {

        ArrayList<String> doktorSoyisimleri = new ArrayList<>();

        doktorSoyisimleri.add("Avery");
        doktorSoyisimleri.add("Abel");
        doktorSoyisimleri.add("Erik");
        doktorSoyisimleri.add("Jacob");
        doktorSoyisimleri.add("Pedro");
        doktorSoyisimleri.add("Mahesh");
    }

    public static void unvanlar() {

        ArrayList<String> unvanlar = new ArrayList<>();

        unvanlar.add("Allergist");
        unvanlar.add("Norolog");
        unvanlar.add("Genel cerrah");
        unvanlar.add("Cocuk doktoru");
        unvanlar.add("Dahiliye");
        unvanlar.add("Kardiolog");
    }

    public static void hastaIsimleri() {

        ArrayList<String> hastaIsimleri = new ArrayList<>();

        hastaIsimleri.add("Warren");
        hastaIsimleri.add("Petanow");
        hastaIsimleri.add("Sophia");
        hastaIsimleri.add("Emma");
        hastaIsimleri.add("Darian");
        hastaIsimleri.add("Peter");

    }

    public static void hastaSoyIsimleri() {

        ArrayList<String> hastaSoyIsimleri = new ArrayList<>();

        hastaSoyIsimleri.add("Traven");
        hastaSoyIsimleri.add("William");
        hastaSoyIsimleri.add("George");
        hastaSoyIsimleri.add("Tristan");
        hastaSoyIsimleri.add("Luis");
        hastaSoyIsimleri.add("Cole");
    }

    public static void durumlar() {

        ArrayList<String> durumlar = new ArrayList<>();

        durumlar.add("Allerji");
        durumlar.add("Bas agrisi");
        durumlar.add("Diabet");
        durumlar.add("Soguk alginligi");
        durumlar.add("Migren");
        durumlar.add("Kalp hastaliklari");
    }

    public static void hastaIDleri() {

        ArrayList<Integer> hastaIDleri = new ArrayList<>();

        hastaIDleri.add(111);
        hastaIDleri.add(222);
        hastaIDleri.add(333);
        hastaIDleri.add(444);
        hastaIDleri.add(555);
        hastaIDleri.add(666);
    }
}
//  ArrayList<String> doctorIsimleri = { "Nilson", "John", "Robert", "Marry", "Alan", "Mahesh" };
//  ArrayList<String> doctorSoyIsimleri= { "Avery", "Abel", "Erik", "Jacob", "Pedro", "Tristen"};
//  ArrayList<String> unvanlar = { "Allergist", "Norolog", "Genel cerrah", "Cocuk doktoru",
//    "Dahiliye", "Kardiolog" };
//  ArrayList<String> hastaIsimleri = { "Warren", "Petanow", "Sophia", "Emma", "Darian",
//   "Peter" };
//  ArrayList<String> hastaSoyIsimleri= { "Traven", "William", "George", "Tristan", "Luis",
//        "Cole"};
//  ArrayList<String> durumlar= { "Allerji", "Bas agrisi", "Diabet", "Soguk alginligi", "Migren",
//        "Kalp hastaliklari"};


// int [] hastaIDleri = {111,222,333,444,555,666}
