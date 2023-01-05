package day12forloopwhileloop;

public class ForLoop05 {

    public static void main(String[] args) {

        //Example 1: Hic sayi kullanmadan 1 den 100'e kadar olan sayilari console'a yazdiriniz

         for(int i = 'd'/'d' ; i<='d';i++ ){
            System.out.println(i+" ");

        }

        //Note 1:  Bazi loop lar hic calismayabilir

        for(int i = 1; i<0; i--){
            System.out.println("Hi!");//Zero execution
        }

        //Note 2: Bazi loop lar sonsuz defa calisabilir
        //        Bu tarz loop lara "infinte(sonsuz) loop denir"
        //        Genellikle increment/decrement kisminda yapilan hatadan kaynaklanir
//        for(int i = 1; i<2; i++){
//            System.out.println("Java makes money...");
//        }

        //Note 3: Baska bir infinte(sonsuz) loop
        //        Loop olusturdugunuzda ikinci kismi yazmazsaniz ""infinite loop"" olur
//        for(int i = 1;  ;  ){
//            System.out.print("Hi! ");
//        }
    }
}
