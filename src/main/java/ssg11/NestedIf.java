package ssg11;

public class NestedIf {

    public static void main(String[] args) {

        // bir kisinin kan bagisinda olup olmadigini control ediniz .
        // yas:18 baslamali
        // kilo : 50 dan ust olmali
        //Yaş ve kilo için iki değişken oluşturma

        int yas = 18;
        int kilo = 49;

        if(yas>17){
            if(kilo>49){
                System.out.println("Kan Bagisinda Bulunabilirsiniz");
            }else{
                System.out.println("50 Kilodan fazla olmalisiniz");
            }
        }else{
            System.out.println("18 yasinda olmalisiniz");
        }


    }
}
