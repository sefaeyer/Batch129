package practice.practice_nighttime.nighttime04;

public class C03_DoWhileLoopMaymunSurvive {

    public static void main(String[] args) {

        /*
        INTERVIEW QUESTION
    Adada yalnız bir maymun var
    Her gün 4 muz yemesi gerekiyor
    o adada sadece 165 muz var
    Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

    */

        // int gunlukMuz = 4;
        int numberOfBanans = 165;//4    8   12  16  .... 164  ==> geriye 1 muz kaldi, yasamasi icin yeterli degil
        int survivalDays =1;     //1    2   3   4   .... 41   ==> 42. gun oldu
        boolean monkeyAlive = true;

        do {
            System.out.println("******** maymunlar yasamak icin gunde 4 muz yer *******");

            numberOfBanans-=4;
            System.out.println("Kalan Muz Sayisi "+numberOfBanans);
            survivalDays++;
            if(numberOfBanans<4){
                monkeyAlive=false;
                System.out.println("Bugun "+ survivalDays + ". Gun, yeterli muz kalmadi. Maymun sizlere omur....");
                System.out.println("Maymun "+survivalDays+". Gun oldu");

            }else
                System.out.println("Bugun "+survivalDays+ ". gun, Maymun yasiyor");




        }while(monkeyAlive);



    }
}
