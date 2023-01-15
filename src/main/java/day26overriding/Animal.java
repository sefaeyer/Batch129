package day26overriding;

/*
        1. Parent class taki method u child class icinde ozellestirerek kullanmaya overriding denir
        2. Overriding de method un parantezine methodun isminie dokunulmaz, method un body sine degistirilir.
        3. @Override ==> Override Annotation: Override kurallarinin java tarafindan kontrol edilmesini saglar
        4. Overriding de parent class taki method a overridden  method denir, child class taki
           method a ise overriding method denir
        5. Private method lar override edilemezler.
        6. Child class taki override edilmis method (overriding method) un access modifier i parent
           class taki override edilmis method (overriden) un access modifier indan dar olamaz
           Overriden method ==> protected ise overriding method ==> protected + public
           Overriden method ==> default ise overriding method ==> default + protected + public
           Overriden method ==> private ise overriding method ==> override edilemez. Bkz: 5. kural.
        7. Child Class ta override edilen method un(overriding) return type i method un return
           ettigi data type inin aynisi veya o data type inin parent i olarak secilebilir.
        8. Method un return type i primitive ise overriding yaparken return type degistirilemez.
           Cunku return type ya ayni olur ya da parent ten secilir. ama primitive ler arasinda
           parent child iliskisi olmadigindan parent secmek mevzu bahis olamaz. o zaman tek secenek
           aynisi olmalidir kalir.
        9. Method un return type i Wrapper Class ise overriding yaparken return type degistirilemez.
           Cunku return type parent child iliskisi yoktur.
       10. Method un retun type i void ise overriding yaparken return type degistirilemez.


          11) Final kelimesini "Variable"larda kullanabilirsiniz.
                    ->final variable ise
                    i) mutlaka değer atanmalıdır
                    ii) ilk atanan değer değiştirilemez

         12) Final kelimesini "Method" larda kullanabilirsiniz.
                     ->method final ise;
                      i)methodun body'si değiştirilemez
                      ii)method body'si değiştirilemeyince override yapmak mümkün olmaz

         13) Final kelimesini "Class"larda kullanabilirsiniz.
                     ->class final ise;
                       i)o class'ın child'ı olamaz
         14. Final method lar ve static method lar override edilemezler.
         15. Override yapabilmek icin inheritance sarttir. inheritance yoksa parent ve
             child yoktur zaten. Parent - child iliskisi sarttir.
         16. Method overloading compile time polymorphism dir. Method overriding Run
             Time Polymorphism dir.
         17. Method Overloading "static Polymorphism" dir,
             Method Overriding "dynamic Polymorphism" dir.
 */
public class Animal {

    public void eat(){
        System.out.println("Animals eat...");
    }

    public  void drink(){
        System.out.println("Animals drink...");
    }

    public Animal create(){
        return new Animal();
    }

    public int add(int a, int b){
        return a+b;
    }

    public Integer multiply(int a, int b){
        return a*b;
    }

}
