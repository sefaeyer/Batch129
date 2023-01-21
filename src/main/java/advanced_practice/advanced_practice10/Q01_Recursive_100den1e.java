package advanced_practice.advanced_practice10;

public class Q01_Recursive_100den1e {

    //100'den 1'e kadar sayıları loop ve sayı kullanmadan yazdıran bir method oluşturunuz.

    public static void main(String[] args) {

        //System.out.println((int)'d');

        sayilariYazdir('z');

    }

    public static void sayilariYazdir(char ch){

        if(ch>=('b'/'b')){
            System.out.print((int)ch+" ");
            ch--;
            sayilariYazdir(ch);
        }else{
            System.out.println(" BITTI ");
        }



    }

}
