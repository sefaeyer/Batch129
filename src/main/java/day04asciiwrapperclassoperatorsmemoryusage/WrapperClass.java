package day04asciiwrapperclassoperatorsmemoryusage;

public class WrapperClass {

    public static void main(String[] args) {

        //primitive ler:    char    -  boolean -  byte  - short -    int  - long - float - double
        //Wrapper Class: Character  -  Boolean  - Byte  - Short - Integer - Long - Float - Double
        //Wrapper Class'lar non primitive dir o yuzden memory de çok yer kaplarlar. sart değilse wrapper class tercih etmeyin

        int n = 12;//"n" yazıp nokta koyarsanız hiç metod görünmez
        Integer m = 12;//"m" yazıp nokta koyarsanız birçok metod görürsünüz.

        byte p = 23;
        Byte r = 43;
        //Example
        short max = Short.MAX_VALUE;
        System.out.println(max);


        int ball = 6;
        Integer newBall = ball;


        System.out.println(newBall);
        System.out.println(Integer.compare(newBall, ball));



        short minShort = Short.MIN_VALUE;
        System.out.println(minShort);

        //Example: int data type ının minimum degeri ile byte data type ının maximum toplamını blun


        int minInt = Integer.MIN_VALUE;
        System.out.println(minInt);
        byte minByte = Byte.MAX_VALUE;
        System.out.println(minByte);

        System.out.println(minInt + minByte);

        //Exmp3: 1)Primitive int i Wrapper Integer a çevirin
        int num = 22;

        Integer wrapperNum = num;

        System.out.println(wrapperNum);  //22

        //       2) Wrapper Byte ı primitive Byte a çevirin

        Byte k = 43;

        byte primitiveK = k;

        System.out.println(primitiveK); //43

        //Example 4: 1)Primitive Char I Wrapper Character A çevirin

        char initialAhmet ='A';
        Character initialWrapper = initialAhmet;

        //           2)Wrapper Boolean ı primitive boolean a çevirin

        Boolean isOld = true;
        boolean isOldWrapper = isOld;


        //Example5: Size string olarak verile ki fiyatın toplamını ekrana yazdırınız
        String shirt = "2300";
        String shoes = "5200";

        //Javada "+" sembolu iki sayı arasında ise toplama işlemi olur
        //Javada "+" sembolu iki string arasında veya bir string ve bir sayı arasında ise concatenation olur
        //Concatenation işlemlerinde Java matematikteki işlem önceliği kurallarını kullanır.
        //İşlem önceliği: önce üslü sayılar sonra parantez içi, sonra çarpma ve bölme, en sonda da toplama ve çıkarma yapılır.

        System.out.println(shirt + shoes);// 23005200

        double totalPrice = Double.valueOf(shirt) + Double.valueOf(shoes);

        System.out.println(totalPrice);

        //Example&: Size string olarak verile ki fiyatın toplamını ekrana yazdırınız
        //Note: valuOf() metodu tüm karakterleri rakam olan String leri sayılara çevirir.
        //      Eğer valuOf() metodu kullanırken String in içine rakam olmayan karakter varsa hata verir.
        String tv = "$11000";
        String radio = "$3000";

        System.out.println(tv + radio);//$11000$3000

        int totallPrice = Integer.valueOf(tv) + Integer.valueOf(radio);

         

    }

}
