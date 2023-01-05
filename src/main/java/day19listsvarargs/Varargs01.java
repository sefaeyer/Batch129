package day19listsvarargs;

public class Varargs01 {

    /*
        Varargs lar method olustururken parametre sayisinda bize esneklik verir
        Method'un parantezleri icine yazilanlara "parametre" denir
        Method'u cagirirken kullanilan sayilara da "argument" denir.

        Note1: Bir method da 1 den fazla varargs parametre kullanilamaz cunku ikincisi unreachable code olur.
        Note2: ""Varargs"" disindaki paranmetrelerle kullanilabilir ama ""varargs"" her zaman son parametre olmalidir.
     */

    public static void main(String[] args) {

        addTwoNumbers(3,5);
        addThreeNumbers(4,7,2);
        add(4,5,6,7,54,23,12,4,7,9);

    }

    // Iki sayiyi toplayan method olusturunuz
    public static void addTwoNumbers(int a, int b){
        System.out.println(a+b);
    }

    //Uc sayiyi toplayan method olustururum
    public static void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }

//    add(4,5,6,7);
    //Istedigimiz sayida sayiyi toplamak icin bir method olusturunuz
    public static void add(Integer... a){

        int sum = 0;

        for(int w :a){
            sum=sum+w;
        }
        System.out.println(sum);
    }

}
