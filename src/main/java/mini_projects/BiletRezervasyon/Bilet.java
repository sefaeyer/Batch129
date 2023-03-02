package mini_projects.BiletRezervasyon;

public class Bilet {
    //mesafe, yolculuk tipi, fiyat, koltuk no

    public double distance;
    public int typeNo;
    public double price;
    public int seatNo;

    //5- bileti yazdiralim
    public void printBilet(Bus bus){
        System.out.println("Toplam Tutar: "+this.price);
        System.out.println("---Bilet Detayi---");
        System.out.println("Otobus Plakasi: "+bus.numberPlate);
        System.out.println("Mesafe        : "+this.distance);
        System.out.println("Yolculuk Tipi : "+(this.typeNo==1 ? "Tek Yon" : "Gidis-Donus"));
        System.out.println("Koltuk No     : "+this.seatNo);
        System.out.println("Keyifli Yolculuklar Dileriz...");
    }
}
