package day30exceptionsinterface;

    /*
        1. Bir interface i bir class in parent i yapmak icin implement keyword unu kullaniriz.
        2. Java parent lar Class oldugunda multiple parent e musade etmez ama biz bazen multiple
            parent a ihtiyac duyariz.
            Bu ihtiyaci gidermek icin Interface ismini verdigi yeni bir yapi olusturdu.
            Bu yapi sayesinde bir Class icin coklu Interface Parent olusturabiliriz.
        3. Coklu interface parent lerin herbirinin icine ayni isimli method lar koyabiliriz.
            Mesela Ac nin, Engine in ve Security nin her birinin iclerine run() methodu koymak gibi
            Child Class herhangi birini override ettiginde hepsini override etmis gibi olur sonra da
            body yi Child Class ta yazarak uygulamasni yapmis olur.

     */

public class Civic implements Ac, Engine, Security {


    @Override
    public void cool() {
        System.out.println("Civic cools perfectly");
    }

    @Override
    public void run() {
        System.out.println("Ac runs perfectly");
    }
}
