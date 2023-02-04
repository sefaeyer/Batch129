package practice.practice_nighttime.daytime10;

public class EnumRunner {

    public static void main(String[] args) {

        Level oyun = Level.High;


        switch (oyun){
            case Low:
                System.out.println("kolay oyun");
                break;
            case Medium:
                System.out.println("orta seviye");
                break;
            case High:
                System.out.println("zor seviye");
                break;
        }


    }
}
