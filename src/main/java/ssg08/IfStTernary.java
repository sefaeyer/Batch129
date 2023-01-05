package ssg08;

public class IfStTernary {

    public static void main(String[] args) {
        //if
        int a = 12;
        int b = 13;

        if (a<b && b<100){
            System.out.println("Isteginiz gerceklesecek");
            System.out.println("body icinde tum kodlar calisir");
        }

        if(a>0){
            System.out.println(" a sifirdan buyuk");
            System.out.println("  if ve ternary ");
        }
        if (a<b && b<100) // {} parantez olmadigi icin sadece ilk satir kosula bagli calisir. diger satir her zaman calisir
            System.out.println("Isteginiz gerceklesecek");
            System.out.println("body icinde tum kodlar calisir");

    }

}
