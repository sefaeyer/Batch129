package advanced_practice.Advanced_practice08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Q04_Bakkal {

    /*
        Bakkal günlük gelir programı yazınız.
        -Tüm günlerin gelirlerini gösteren bir method,
        -Haftalık gelir ortalamasını gösteren bir method,
        -Hangi günlerin ortalama gelirden fazla geliri olduğunu gösteren bir method,
        -Hangi günlerin ortalama gelirden az geliri olduğunu gösteren bir method,
        -Hangi günlerin ortalama gelire eşit olduğunu gösteren bir method oluşturunuz.
     */

    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi","Pazar"));
    static List<Double> gunlukKazanclar = new ArrayList<>();
    static double toplamKazanc=0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gun =0;
        while(gun<7){
            System.out.println(gunler.get(gun)+" gununun kazancini gir");
            double kazanc =input.nextDouble();
            gunlukKazanclar.add(kazanc);
            toplamKazanc+=kazanc;
            gun++;
        }
        System.out.println("Gunluk Kazanclar = " + gunlukKazanclar);
        System.out.println("Toplam Kazanc = " + toplamKazanc);
        System.out.println("Ortalama Gelir() = " + ortalamaGelir());
        System.out.println("Ortalama Ustu Gunler() = " + ortalamaUstuGunler());
        System.out.println("Ortalama Alti Gunler() = " + ortalamaAltiGunler());
        System.out.println("Ortalama Gunler() = " + ortalamaGunler());

    }

    static  double ortalamaGelir(){
        return toplamKazanc/7;
    }

    static String ortalamaUstuGunler(){
        String ortalamaUstuGunler="";
        for(int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)>ortalamaGelir()){
                ortalamaUstuGunler+=gunler.get(i)+" ";
            }

        }
        return ortalamaUstuGunler();
    }

    static String ortalamaAltiGunler(){
        String ortalamaAltiGunler="";
        for (int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)<ortalamaGelir()){
                ortalamaAltiGunler+=gunler.get(i)+" ";
            }

        }
        return ortalamaAltiGunler();
    }

    static String ortalamaGunler(){
        String ortalamaGunler="";
        for (int i=0; i<7; i++){
            if(gunlukKazanclar.get(i)==ortalamaGelir()){
                ortalamaGunler+=gunler.get(i)+" ";
            }

        }
        return ortalamaGunler();
    }


}
