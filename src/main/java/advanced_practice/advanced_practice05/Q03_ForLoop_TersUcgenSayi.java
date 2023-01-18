package advanced_practice.advanced_practice05;

public class Q03_ForLoop_TersUcgenSayi {

    public static void main(String[] args) {

        /*
        Şekli Yazdırınız:
          1 2 3 4 5 6
           2 3 4 5 6
            3 4 5 6
             4 5 6
              5 6
               6
    */

        for (int i = 1; i <=6 ; i++) {//satir kontrolu  // 6 kez calisacak
            for(int bosluk=1; bosluk<i; bosluk++ ){
                System.out.print(" ");
            }

            for (int j = i; j <= 6 ; j++) {//sutun kontrolu
                System.out.print(j+" ");
            }
            System.out.println();

        }

    }
}
