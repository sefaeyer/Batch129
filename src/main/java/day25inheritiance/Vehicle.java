package day25inheritiance;

/*
        1. Child Class tan bir object olusturdugunuzda Constructor lar en ustteki
           parent class tan baslatilarak alta dogru calistirilir
        2. Child class taki constructor dan parent class taki constructor a gidebilmek icin "super()" kullanilir.
        3. Parent class ta birden fazla constructor varsa istenilen constructor ""super()"" ifadesinin parantezi
           icine yazilan paametreler yardimi ile secilebilir
        4. Ayni class icindeki constructor lari secmek icin ""this()"" kullanilir
           Ayni class ta birden fazla constructor varsa istenilen constructor ""super()"" ifadesinin parantezi
           icine yazilan paametreler yardimi ile secilebilir
        5. super() ifadesini yazmak istege baglidir. yazmasaniz da java sanki super varmis gibi davranir.
           Ama kodunuzu daha okunur kilmak icin yazmaniz tavsiye edilir.
        6. super() ve this() ifadeleri constructor icerisinde herzaman ilk satirda olmalidir.
        7. Bir constructor icinde ""super()"" ve ""this()"" ifadelerinden sadece biri olabilir.
        8. Inheritance da variable lari ve method lari cagirmak icin ""this"" veya ""super"" kullanilir
           "this" ayni class icindeki variable ve method lari cagirmak icin kullanilir.
           "super" parent class icindeki variable ve method lari cagirmak icin kullanilir.
        9. Inheritance ta obje kullanarak variable cagirirsaniz obje nin data tipini temsil eden class tan variable i
           aramaya baslayiniz. o class ta yoksa parentlere bakiniz.
        10. Inheritance ta obje kullanarak method cagirirsaniz obje nin constructor ini temsil eden class tan method u
           aramaya baslayiniz. o class ta yoksa parent lere bakiniz.

        OOP Principals:  Object Oriented Prohramming
        1. Inheritance +
        2. Polymorphism -
        3. Encapsulation -
        4. Abstraction -
 */

public class Vehicle {

    public void engine(){
        System.out.println("Vehicle engine..");
    }

    public int price = 12000;

    public Vehicle(){
        System.out.println("Vehicle 1");
    }

    public Vehicle(int price){
        System.out.println("Vehicle 2: "  + price);
    }


}
