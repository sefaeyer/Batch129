package ssg23exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01 {

    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi= 0;
        int sayi2= 15;
        try {
            System.out.println("Hosgeldiniz");
            sayi = scann.nextInt();
            System.out.println("try bloguisti, kod duzgun calisti");
        } catch (InputMismatchException e) {
            System.out.println("try blogu calisti, kod hatali");
            System.out.println(e.getMessage());
        }catch(ArithmeticException e){

        }
        if(sayi!=0){
            System.out.println(sayi / sayi);
        }
        System.out.println("Sifirdan farkli bir sayi gir. payda sifir olamaz");
        //System.out.println(sayi);


    }
}
