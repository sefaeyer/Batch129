package ssg19;

public class TryExample {

    static int a = 10;
    public static void main(String[] args) {

        TryExample t1 = new TryExample();
        TryExample t2 = new TryExample();

        t1.a=a+2;
        t2.a=a+3;

        System.out.println(t1.a);
        System.out.println(t2.a);


    }
}
