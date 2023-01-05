package ssg14;

public class NestedLoop02 {

    public static void main(String[] args) {

        for (int i = 1; i <=5 ; i++) {
            System.out.print("* ");
            for (int j = 1; j <=(-1*i+5) ; j++) {
                System.out.print("* ");
            }
            System.out.println(i);
        }

    }
}
