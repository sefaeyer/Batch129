package mini_projects.RestaurantBillGenerator;

import java.util.Scanner;

/*
Proje: Restaurant Fiş Üretme Uygulaması(BillGenerator)
       1-Bir restaurantın online sipariş sisteminde hesabı
       yazdıran uygulama tasarlayınız.

       2-Restauranttaki yiyecekler bir listte tutulsun.
         Yiyeceklerin kodu, ismi ve ücreti olsun.

       3-Yiyecek menüsü, sipariş oluşturma/iptal ve hesap
         oluşturma için seçim menüsü gösterilsin.

       4-Yiyecek menü:Listedeki yiyecekler menü şeklinde listelensin
         Sipariş girme:Yiyeceğin kodu ve istenilen adet girilerek sipariş oluşturulsun
                       Her sipariş için kod üretilsin(başlangıç 1000 artarak devam eder)
                       Her bir yiyecek siparişi için tutar hesaplansın

         Sipariş iptal:Sipariş kodu girilerek sipariş silinsin
         Hesap oluşturma: Tutarları ile birlikte tüm siparişleri ve
                          toplam tutarı gösteren bir hesap fişi yazdırılsın.
*/
public class RestaurantBillGenerator {
    public static void main(String[] args) {
        getSelectionMenu();


    }
    //1-islem secimi icin menu godterelim
    public static void getSelectionMenu(){
        Scanner inp=new Scanner(System.in);
        DishService dishService = new DishService();//listede 10 tane dish var
        OrderService orderService = new OrderService();

        //2-menu tekrar tekrar gosterilsin
        //3-yiyecekler icin class olusturalim
        //7-siparis icin class olusturalim
        int select=-1;
        while (select!=0){
            System.out.println("-----------------------------------------------");
            System.out.println("*** Lezzet Restaurant Siparis Uygulamasi ***");
            System.out.println("1- Menu");
            System.out.println("2- Siparis gir");
            System.out.println("3- Siparis iptal");
            System.out.println("4- Hesap olustur");
            System.out.println("0- CIKIS");
            System.out.println("Seciminiz:..");
            select= inp.nextInt();
            System.out.println("-----------------------------------------------");
            switch (select){
                case 1:
                    //menu goster
                    dishService.showMenu();
                    break;
                case 2:
                    //siparis olustur
                    orderService.createOrder(dishService);
                    break;
                case 3:
                    //siparis iptal
                    orderService.deleteOrder();
                    break;
                case 4:
                    //hesap
                    orderService.printBill();
                    break;
                case 0:
                    System.out.println("Iyi Gunler Dileriz...");
                    break;
                default:
                    System.out.println("Hatali giris!");
                    break;
            }

        }
    }
}
