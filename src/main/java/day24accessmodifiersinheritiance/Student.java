package day24accessmodifiersinheritiance;

public class Student {

    public String name = "Tom Hanks";//name herkes tarafindan bilinebilin. o yuzden public
    String stdId = "TH2023HU12001";//okul yonteimindeki insanlar tarafindan bilinebilir. o yuzden default
    protected int accountNum = 76512345;//ben esim ve cocuklarim tarafindan bilinebilir. o yuzden prtotected
    private int balance = 123000;//hesabimdaki para miktari sadece benim tarafimdan bilinebilir. bu yuzden private.

    /*
            1. Access modifier lar genis ten dara: public > protected > default > private
            2.Class lar protected ve private olamazlar, sadece public ve default olabilirler

        Access Modifier :Variable lara, class lara,  method lara ulasmayi duzenler
        Default ==> (Package Private)

            Access modifierlar genisten dara dogru;
            public > protected > default > private
        Class'lar protected ve private olamazlar. Sadece public ve default olabilirler.

        Access Modifier'lar ne ise yarar?
    -Variablelara methodlara classlara ulasmayi duzenler.
        Kac tane access modifier var ? 4. public > protected > default > private

        publicler icin hicbir sinirlama yoktur projenin her yerinden ulasilabilir
        protected ayni packagein icinden ya da farkli packagelarda o packagedeki cocuklar ulasabilir.
        default sadece ayni packageden ulasilabilir. Bu yuzden defaultlarin diger adi package private'dir
        private sadece class icinden ulasilabilir. class disinda ulasilamaz.

        protected ile defaultun farki nedir ?
        Package disina ciktigimizda childlardan protectedlara ulasabiliriz. defaultlarda ulasamayiz.
     */

}
