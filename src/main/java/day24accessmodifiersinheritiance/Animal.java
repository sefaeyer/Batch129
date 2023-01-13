package day24accessmodifiersinheritiance;

public class Animal {

    /*

            Inheritance'in faydalari;
        1) Code standardında tekrar iyi değildir.
        2) Code değişime açık olmalıdır.Hatayı düzeltmek kolay olmalı.
        3) Gelişime update'e açık olmalıdır
        4) Code atomic yapıda olmalı.
        Note 1:  "parent class"(super class)(ortak ozellikleri icerir)-"child class"(sub class)(Class'a ozel ozellikleri icerir)
        Note 2: Bir parent class'a bağlı child class'ı belirtmek için "extends" keyword kullanırız
        Note 3: public method lar child classlar tarafindan kullanilabilir.
        Note 4: protected method lar inherit edilebilir
        Note 5: default method lar obje ile ayni package de olduklari surece inherit edilebilir
                Ama default method ile obje nin uretildigi class farkli package lerde ise inherit edilemezler.
        Note 6: private method lar inherit edilemezler.
        Note 7: Java birden fazla parent i onaylamaz
        Note 8: Child --> Parent --> Grand Parent--> Grand Grand Parent sklinde ilerleyen  inheritance Multu Level Inheritance
        Note 9: Java da object class tum Java Class larinin ortak parent idir.
        note 10: Java da onject class haric tum class larin parent i vardir
        Note 11: Javada parent ten child a olan iliskilere HAS A relationship denir
                 Javada child ten parent e olan iliskilere S A relationship denir
        Note 12: Javada her clasin bir tane default constructor i vardir
                 Bu default constructi class in icinde gorunmez cunku Object class icindedir
                 default constructor a ihtiyac duydugunda parent olan Object Class a gider ve kullanir



     */

    protected void eat(){
        System.out.println("Animals eat...");
    }

     void drink(){
        System.out.println("Animals drink...");
    }




}
