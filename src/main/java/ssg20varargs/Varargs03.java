package ssg20varargs;

public class Varargs03 {

    public static void main(String[] args) {

        //Kac tane il ismi verilirse verilsin
        // iclerinden en uzun  olani yazdiran method

        String il1 = "Adana";
        String il2 = "Ankara";
        String il3 = "Istanbul";
        String il4 = "Bursa";
        String il5 = "cihan";

        enUzunIlIsmi(il1,il2,il3,il4,il5);



    }
    public static void enUzunIlIsmi(String ... str){
        String enUzunIlIsim="";//0

        for(String w:str){
            if(w.length()>enUzunIlIsim.length()){// 5>0
                enUzunIlIsim=w;
            }

        }

        System.out.println("enUzunIlIsim = " + enUzunIlIsim);

    }

}
