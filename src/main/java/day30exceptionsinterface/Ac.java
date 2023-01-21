package day30exceptionsinterface;



public interface Ac {

    //Interface lerin icine concrete method konulamaz. cunku concrete method larda
    // body vardir ve body o method un isi nasil yapacagini belirtir. Isin nasil yapilacagi
    // bir cok detay icerir ve bu Child Class larda kafa karisikligina sebep olur.
    // Halbuki sadece yapilmasi gereken isi soyleyip nasil yapilacagini Child a birakirsaniz
    // Child Class in kafa kariikligini engellemis olursunuz.

    //interface ler concrete method iceremezler dolayisiyla interface in icindeki hicbirsey istege bagli degildir.
    //hersey Child Class lar icin mecburidir. Bu yuzden interface lere ''to-do list'' de denir. .

    //Interface lerdeki tum method lar otomatik olarak public tir, abstract tir ama static degildir.

    //Interface lerdeki variable lar otomatik olarak public tir, static tir, final dir.

    void cool();

    void run();

    int price = 2000;
    String model = "Mitsubishi";


}
