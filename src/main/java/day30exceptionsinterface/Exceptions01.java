package day30exceptionsinterface;

public class Exceptions01 {

    public static void main(String[] args) {

        int a = 12;
        int b = 2;

        int c[] = {3, 6, 9, 12};

        m(c, a, b);

    }
    /*
     1. Exception alinsa da alinmasa da calistirmamiz gereken kodlari finally block icine yazariz.
     2. DB ile baglantiyi kesme isini yapan kodlar gibi kodlar her halukarda calistiirlmalidir,
        bu tarz kodlari finally block icine yazariz.
     3. try block yalniz kullanliamaz.
        try block  + 1 catch block mumkundur.
        try block  + 1 catch + 1 finally block mumkundur.
        try block + coklu catch block mumkundur.
        try block + coklu catch + 1 finally block mumkundur.
        try block + 1 finally block mumkundur.
     4. Coklu finally block kullanilamaz.

     */
    public static void m(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];

            System.out.println(element);
        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Cut the connection with the DB");
        }
    }
}
