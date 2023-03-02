package mini_projects.RestaurantBillGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//10-order islemler
public class OrderService {
    Scanner inp=new Scanner(System.in);
    List<Order> orderList=new ArrayList<>();//1000 Adana*2

    //11- siparis olusturma
    public void createOrder(DishService dishService){
        int dishCode;
        do {
            System.out.println("Lutfen urun kodu giriniz: (Cikis icin 0 giriniz");//100
            dishCode=inp.nextInt();//code ile urunu bulmamiz gerekiyor--->12
            if(dishService.findByDishCode(dishCode)!=null){
                //urun bulundu.
                Dish dish = dishService.findByDishCode(dishCode);
                System.out.println("Adet giriniz");
                int number=inp.nextInt();
                //bu yemek daha once siparis edilmis mi---->13
                Order order;
                if(findByOrderByDish(dish)!=null){
                    order=findByOrderByDish(dish);
                    order.numberOfDish+=number;
                    order.setPrice();
                }else{
                    order=new Order(dish, number);//orderCode:otomatik:1000 Adana kebap
                    order.setPrice();// fiyat
                    this.orderList.add(order);
                }
            }//siparis olunca altta siparis listesini goruntuleyelim--->14
            listOrders();

        }while (dishCode!=0);

    }
//14 - siparisleri listele
    private void listOrders() {
        this.orderList.
                forEach(order -> System.out.printf("Siparis Kodu:%-5s  Lezzet kodu:%-4s Lezzet adi:%-15s Adet:%-2s\n",
                order.orderCode,order.dish.getCode(),order.dish.getName(),order.numberOfDish));
    }

    //13 dish bilgisi ile siparis bulma
    private Order findByOrderByDish(Dish dish){
        for(Order order:this.orderList){
            if(order.dish.equals(dish)){
                return order;
            }
        }
        return null;
    }
//15-siparis iptal
    public void deleteOrder(){

        System.out.println("Iptal etmek istediginiz siparisin kodunu giriniz");
        int code=inp.nextInt();
        boolean isValid=true;
        for(Order order:this.orderList){
            if(order.orderCode==code){
                System.out.println("Iptal etmek istediginiz miktari giriniz");
                int num=inp.nextInt();//2
                if(order.numberOfDish>num){
                    order.numberOfDish-=num;
                    System.out.println("Siparis iptal edildi "+order.dish.getName());
                }else if(order.numberOfDish==num){
                    this.orderList.remove(order);
                    System.out.println("Siparis iptal edildi "+order.dish.getName());
                }else{
                    System.out.println("Hatali giris!");
                }
                isValid=true;
                break;
            }else{
                isValid=false;
            }
        }
        if(!isValid){
            System.out.println("Siparis kodu gecersiz!");
        }
        System.out.println("                          Mevcut Siparisler    ");
        listOrders();

    }
//16-hesabi olusturma
    public void printBill(){
        double total=0;
        System.out.println("                            Lezzet Fisiniz      ");
        for (Order order:this.orderList){
            System.out.printf("Siparis Kodu:%-6s Lezzet Kodu:%-4s Lezzet adi:%-15s Adet:%-2s Tutat:%-6s Lira\n",
                    order.orderCode,order.dish.getCode(),order.dish.getName(),order.numberOfDish,order.orderPrice);
            total+=order.orderPrice;
        }
        System.out.println("Toplam Tutar: "+total);
        System.out.println("Afiyet Olsun...");
        this.orderList.clear();
    }

}
