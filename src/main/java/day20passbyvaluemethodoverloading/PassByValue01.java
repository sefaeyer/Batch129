package day20passbyvaluemethodoverloading;

public class PassByValue01 {

    /*
          1) Java "pass-by-value" sayesinde variable'larin orjinal degerlerini koruma altina alir.
    */

    public static void main(String[] args) {

        double shirt = 100;

        double studentShirtPrice = discount("student", shirt);
        double seniorShirtPrice = discount("senior", shirt);
        double veteranShirtPrice = discount("veteran", shirt);

        System.out.println("shirt = " + shirt);//100
        System.out.println("student Price = " + studentShirtPrice);//90
        System.out.println("veteran Price = " + veteranShirtPrice);//80
        System.out.println("senior Price = " + seniorShirtPrice);//95

        shirt = discount("veteran", shirt);

        System.out.println("shirt = " + shirt);//80
    }

    public static double discount(String state, double price){

        switch (state){

            case "student":
                price = price * 0.90;
                break;

            case "veteran":
                price = price * 0.80;
                break;

            case "senior":
                price = price * 0.95;
                break;

            default:
                price = price;
        }

        return price;



    }

}
