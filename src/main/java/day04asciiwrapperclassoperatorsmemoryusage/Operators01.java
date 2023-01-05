package day04asciiwrapperclassoperatorsmemoryusage;

public class Operators01 {

    /*
        1) + - * / işlemleri java da matematikte kullanıldığı gibi kullanılır
        Note 1: int / int ==> int olur
        Note 2: double / int ==> double olur. Cunku javada matematiksel işlemlerde farklı data tipleri kullanılırsa sonuc buyuk data tipinde olur.

        2)Java da "Logical operator" lar vardır.
        AND ve OR işlemleri "logical operator"lerdir
            i) AND(&&) işleminden true alabilmek için her şey true olmalıdır
               AND işlemi "perfectionist"tir.
               AND işleminde bir tane false işlemi sonucu false yapar.

            ii) OR(||) işleminde bir tane true sonucu true yapmaya yeter.
                OR işleminde sonucun false olması için her şeyin false olması gerekir.
                OR işlemi Polyanna gibidir. Bir tane true mutlu eder.

            iii) NOT(!) operator u True olanı False, False olanı True yapar.
                 !true = false
                 !false = true
                 !!true = true

         3) Comperison (Karşılaştırma) Operators
                <, >, <=, >=, ==, !=
            Note: Karşılaştırma operatörlerini kullandığınızda kesinlikle boolean (True veya False) alırsınız.

        Note: Biz AND işlemi için "&&" kullanırız ama "&" kullanımı da geçerlidir.
              Farkları nedir?
              "&&" kullnım ilk ifade false  olduğunda diğerlerini kontrol etmez ve hızlı çalışır.
              "&" kullnım ilk ifade false  olduğunda diğerlerini kontrol eter ve yavaş çalışır.
              Bu yuzden hep "&&" kullanırız.
     */

    public static void main(String[] args) {

        boolean first = 3<5;
        boolean second = 2+3!=5;
        boolean third = 2+3*5>=19;

        System.out.println(first + " - " + second + " - " + third);

        System.out.println(first && second);

        System.out.println(first || second || third);


    }

}
