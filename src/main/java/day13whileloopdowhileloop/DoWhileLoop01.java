package day13whileloopdowhileloop;

public class DoWhileLoop01 {

    public static void main(String[] args) {


        // 1) While Loop
        int i = 1;

        while(i<1){
            System.out.println("Sen Bir While loopsun..."); // Zero Execution
            i++;
        }

        // 2) Do While Loop
        int k = 1;

        do{
            System.out.println("Sen Bir Do While loopsun"); // Zero Execution yoktur

            k++;
        }while(k<1);

    }
}
