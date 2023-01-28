package advanced_practice.advanced_practice12;

public class Q03_ForLoop_UsAlma {

    //Bir sayının istenen kuvvetini hesaplayan bir method yazınız.

    public static void main(String[] args) {

        System.out.println(kuvvetiniAl(6, -1));

    }

    public static double kuvvetiniAl(double taban, int us) {
        double sonuc = 1;

        if (us >= 0) {
            for (int i = 0; i < us; i++) {
                sonuc *= taban;

            }


            return sonuc;
        }else{

        }
        return sonuc;
    }

}
