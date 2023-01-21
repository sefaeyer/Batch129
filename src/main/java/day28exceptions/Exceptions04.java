package day28exceptions;

public class Exceptions04 {

    public static void main(String[] args) {

        String arr1[] = {"A", "G", "M", "L"};

        getElementFromArray(arr1, 1);
        getElementFromArray(arr1, 5);
        System.out.println("Hi");

    }

    //Arraylerde olmayan bir index kullanildiginda Java ArrayIndexOutOfBoundsException atar.
    public static void getElementFromArray(String[] s, int idx) {

        try {
            String el = s[idx];
            System.out.println(el);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Gecersiz index");
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
        }
    }


}

