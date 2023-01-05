package day04asciiwrapperclassoperatorsmemoryusage;

public class AsciiValues {

    //Java da her karakterin sayısal bir değeri vardır.
    // Bu değerler ASCII degerler olarak adlandırılır.
    // Bu değerlerin tamamının olduğu tabloya ASCII Table denir.

    public static void main(String[] args) {

        //Her hangi bir değerin ASCII değerini bulmak için int data type inde bir variable ın içine koyunuz.

        int ch = 'A';
        System.out.println(ch);

        int unlem = '!';
        System.out.println(unlem);

        char c1 = 'K';
        char c2 = '?';
        //Java da char ları matematiksel işlemlerde kullanırsanız, Java o char ların ASCII değerlerini kullanır.
        System.out.println(c1 + c2);//138

    }

}
