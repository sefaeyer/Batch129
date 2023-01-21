package day28exceptions;

public class Exceptions05 {

    public static void main(String[] args) {

        int a = 11;
        int b = 12;
        String s = "My Java";

        getCharFromString(s,a,b);

    }

    //try kisminda birden fazla exception olusturma ihtimali olan code varsa, coklu catch kullanabiliriz.

    //Coklu catch kullandiginizda exception class lar arasinda parent-child iliskisi yoksa catch lerin sirasi onemli degildir.
    //Ama code daki siralamaya uymak tavsiye edilir.

    //Coklu catch kullandiginizda exception class lar arasinda parent-child iliskisi varsa catch lerin sirasi onemlidir.
    //Child olan class ustte olmalidir yoksa hata verir.

    //Exception Class lar arasinda parent-child iliskisi varsa ya child class i uste yazarak child ve parent class lar
    //icin ozellestirilmis code lar yazarsiniz.(Hirsiz 155, Doctor 112)
    //Veya child i hic kullanmaz sadece parent ile exception lari handle etmeye calisiriz.
    public static void getCharFromString(String s, int a, int b){

        try{
            int idx = a/b;

            char ch = s.charAt(idx);

            System.out.println(ch);

        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Olmayan index hatasi");
        }
    }
}
