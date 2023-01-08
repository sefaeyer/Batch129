package day23datetimestringbuilder;

public class StringBuilder01 {

    /*
        Java da String, String class kullanilarak veya StringBuilder Clas kullanilarak olusturulabilir.
        String class kullanarak urettiginiz stringler "Immutable" dir (Degistirilemez)
        StringBuilder Class kullanarak urettiginiz string ler "Mutable" dir (degistirilebilir).

     */
    public static void main(String[] args) {

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        //String i degistirdikten sonra ayni string e assign java yine yeni bir konteyner olusturur.
        // degismis degeri yeni konteyner in icine koyar ve eski konteyneri gosteren adresi yeni konteyner a yonlendirir.
        // dolayisiyla eski konteyner adressiz kalir ve garbage collector adressiz olan conteyner i siler.
        String a = "Money";
        a = a+" More";
        System.out.println(a);

        System.out.println(s);
        System.out.println(t);
        System.out.println(w);

        //Mutable
        //StringBuilder kullanarak String uretmenin 1. yolu:
        StringBuilder sb1 = new StringBuilder("Phyton");

        sb1.append("!").append("?").append(".");
        sb1.append("?");
        System.out.println(sb1);

        //StringBuilder kullanarak String uretmenin 2. yolu:
        StringBuilder sb2 = new StringBuilder();
        System.out.println(sb2.length());
        //StringBuilder kullandiginizda baslangic kapasitesi 16 dir. asim oldugunda var olan kapasite kadar ve iki fazlasi eklenir.
        // 16 ==> 16*2+2    -    34 ==> 34*2+2
        System.out.println(sb2.capacity());

        sb2.append("Java");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        sb2.append("xxxxxxxxxxxxxxx");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//34 = 16*2+2

        sb2.append("yyyyyyyyyyyyyyyy");
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());//70 = 34*2+2


        //StringBuilder kullanarak String uretmenin 3. yolu:
        StringBuilder sb3 = new StringBuilder(2);
        sb3.append("Flo");
        System.out.println(sb3);
        System.out.println(sb3.length());
        System.out.println(sb3.capacity());

        sb3.insert(2, "xxxxxx");
        System.out.println(sb3);

        //toString methodu StringBuilder i String e cevirir
        //String class ta var olan ama StringBuilder class ta var olmayan split() method gibi methodlara
        // ihtiyac duydugumuzda toString methodu ile String class a gecer ve o methodlari kullaniriz.
        sb3.toString().split("l");

        //String i tekrar StringBuilder a cevirebilirsiniz
        StringBuilder sb4 = new StringBuilder(sb3);

        //reverse method u string leri ters cevirir
        sb3.reverse();
        System.out.println(sb3);//oxxxxxxlF

        //deleteCharAt(1) index 1 deki karakteri siler
        sb3.deleteCharAt(1);
        System.out.println(sb3);//oxxxxlF

        //delete(1,6) index 1 deki karakter den index 5 (6 dahil olmadigi icin 5) deki
        // karaktere kadar tum karakterleri siler.
        sb3.delete(1,6);
        System.out.println(sb3);//olF

        StringBuilder sb5 = new StringBuilder("Kava");
        StringBuilder sb6 = new StringBuilder("Java");

        //sb5 ile sb6 yi alfabetik siralama olarak karsilastirir
        System.out.println(sb5.compareTo(sb6));

        // index 2 deki karakteri m yapar
        sb6.setCharAt(2,'m');
        System.out.println(sb6);

        sb6.replace(1,3,"xyzt");
        System.out.println(sb6);

        // Stringbuilder Class'da kullanmamiza izin verilen substring() method gibi bazi String Class methodlari vardir,
        //Bu method'lari StringBuilder ustunde kullaninca StringBuilder'in orijinal degeri degismez
        //String class indan oldugu icin orjinal degeri degistirmez
        String sb7 = sb6.substring(1,3);//orjinal degeri degistirmez
        System.out.println(sb6);
        System.out.println(sb7);



    }
}
