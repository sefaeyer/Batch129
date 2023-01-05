package ssg15;

public class Q02_Varargs_SafranBoluEvleri {

    public static void main(String[] args) {

        String str1 = "Safran";
        String str2 = "bolu";
        String str3 = "evleri";
        String str4 = "cok";
        String str5 = "guzel";

        sehir(str1,str2,str3,str4,str5);


    }

    private static void sehir(String ...str) {

        String sum ="";

        for (String w:str) {
            sum=sum+w+" ";
        }
        System.out.println("Cumle = " + sum);

    }
}
