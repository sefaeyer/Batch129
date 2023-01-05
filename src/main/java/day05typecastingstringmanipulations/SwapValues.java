package day05typecastingstringmanipulations;

public class SwapValues {

    //Swap yer değiştirme demektir. 1. kapta patates var 2. kapta domates var. (Swap)==> 1. kapta domates 2. kapta patates

    public static void main(String[] args) {

        int a = 12;
        int b = 5; //Swap ten sonra a=5 B=12 'ye döndür

        int temp = 0;
        System.out.println( "a: " + a);
        System.out.println( "b: " + b);

        //1. Yol:
        //1. Adım
        temp = a;
        //2. Adım
        a = b;
        //3. Adım
        b = temp;

        System.out.println("a: " +a);
        System.out.println("b: " +b);

        //2. Yol
        int x = 12;
        int y = 5;

        System.out.println("x :" + x);
        System.out.println("y: " + y);

        x = x + y;
        y = x - y;
        x = x - y;

        System.out.println("x :" + x);
        System.out.println("y: " + y);




    }

}
