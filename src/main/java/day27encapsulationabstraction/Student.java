package day27encapsulationabstraction;

public class Student {

    /*
    Biz bazen bir Class'in icindeki datalari saklamak isteriz. Mesela ogrencinin Student id'yi herkes bilmemeli degil mi?
Arkadaslar kapsul seklinde ilaclar vardir. Bu kapsullere toz ilac koyarlar.
Napmis oluyorlar ilaci o kapsulun icinde saklamis oluyoruz. Bu kapsulu Class gibi dusunun,
icindeki toz ilaci da variable olarak dusunun. Ben bu sekilde bir ilac uretirsem ilaci kapsulun icinde saklamis olurum.
Bu ise kapsulleme ingilizce ENCAPSULATION denir. Benim ilk aldigim offerda aldigim soru buydu.
What is encapsulation could you please tell me? dedi. Ben de dedim ki "Data Hiding" dedim. Sorarlarsa boyle diyin
offer alirsiniz :)) dedi.
    "private" access yaparak encapsulation yapmis oluruz. Ilacin disindayken ilaci goremeyiz. Kapsulun icinden goruruz.
Ayni mantikla Class'in icinde olursak "private" datayi goruruz. Ayni bu kapsulde oldugu gibi.
Simdi size dicekler ki encapsulation nedir. Data Hiding. Data nasil saklanir. Access Modifier private yapariz. diyeceksiniz, dedi.
    */


    private String stdId = "AC123";
    private double gpa = 3.99;
    private boolean poor = true;

    /*
       Encapsulation yapilmis datayi okuyabilir miyiz?

       get method lar(getter) saklanmis encapsule edilmis datayi okumamiza yarar
       get method lar her zaman public olur. cunku gorunmesini istiyoruz.
       get method larin return type i variable in data type i ile ayni olur
       get method larin isimleri get+ variable name seklinde olur
       get method larin isimleri variable boolean ise is+ variable name seklinde olur
       get method lar parametre kullanmazlar
     */
    public String getStdId() {
        return stdId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isPoor() {
        return poor;
    }



    /*
        Encapsulation yapilmis data larin degeri degistirilebilir mi?

        set method lar (setter) encapsule edilmis data lari update etmemize yarar.
        set method lar her zaman public olur
        set method larin return type i her zaman void olur
        set method larin isimleri set+ variable name seklinde olur.
        set method lar variable ile ayni data type inde parametre kullanirlar.

        getter ve setter'larin ikisine birden "java beans" denir
     */

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void setPoor(boolean poor) {
        this.poor = poor;
    }

    public void setStdId(String stdId) {
        this.stdId = stdId;
    }
}
