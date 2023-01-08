package day22staticblocksconstructors;

    /*
        Constructor nedir?
        Class tan obje uretmemize yarayan code block laridir.

        Class olusturdugumuzda java bize otomatik olarak bir constructir verir.
        Ama bu constructor gozle gorulmez. Bunlara default constructor denir.

        "default constructor" lar  "Car(){ }" seklindedir.

        Siz kendi constructor inizi olusturdugunuzda java default constructor i siler

        Bir class ta farkli parametreler kullanarak istediginiz kadar constructor olusturabilirsiniz

        Farkli constructor lar sayesinde bir class tan farkli farkli object ler olusturabiliriz

        Interview Sorusu**  Method ile constructor in farki var midir
        Cevap:              Farklidir
                            1. Methodlrda return type vardir.
                            2. Methodlarin ismi developerlar tarafindan belirlenir. Constructor larin ismi
                            Class ismi ile ayni  olmalidir.

     */

public class Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2023;
    boolean hybrid = true;

    public Car(String make, String model, int year, boolean hybrid){
        this.make=make;
        this.model=model;
        this.year=year;
        this.hybrid=hybrid;

    }

    public Car(String make, String model){
        this.make=make;
        this.model=model;
        if(year==2023){
            this.year=0;
        }
        if(hybrid==true){
            this.hybrid=false;
        }
    }

    public Car(String make, int year) {
        this.make = make;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }
}
