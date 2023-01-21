package advanced_practice.advanced_practice10;

public class Q02_Arrays_HarfKullanimSayilari {

    /*
  Girilen String'de hangi harfin kaç kere kullanıldığını yazan bir kod yazınız.
  Input: String str = "Java is so Good";
  Output: String strOutput = "J1 a2 v1 i1 s2 o3 G1 d1";
   */

    public static void main(String[] args) {

        String str = "Java is so Good";
        String [] arrr1 = str.split("");
        int kullanimSayisi;
        String sonuc="";

        for (String w:arrr1) {
            kullanimSayisi=0;
            for(String u:arrr1){

                if(w.equals(u)){
                    kullanimSayisi++;
                }
            }
            if(!sonuc.contains(w)){
                sonuc+=w+kullanimSayisi+" ";

            }

        }
        System.out.println();
        System.out.print("sonuc: "+sonuc);
    }


}
