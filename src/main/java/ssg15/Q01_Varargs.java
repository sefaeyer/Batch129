package ssg15;

public class Q01_Varargs {

    public static void main(String[] args) {

        int  n1 = 1;
        int  n2 = 4;
        int  n3 = 9;
        int  n4 = 8;
        int  n5 = 10;

        nums(n1,n2,n3,n4,n5);

    }//main

    private static void nums( int ... newNums) {

        int sum = 0;

        for (int w: newNums) {
            sum=sum+w;

        }
        System.out.println("Toplam = " + sum);
    }


}
