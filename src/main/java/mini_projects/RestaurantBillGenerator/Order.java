package mini_projects.RestaurantBillGenerator;

public class Order {
    public static int count=999;
    public int orderCode;
    public int numberOfDish;
    public double orderPrice;
    public Dish dish;

    //8-yemek ve adet parametreleriyle obje olusturalim
    public Order(Dish dish, int numberOfDish){
        count++;
        this.orderCode=count;
        this.dish=dish;
        this.numberOfDish=numberOfDish;

    }

    //9-siparisimizin fiyatini hesaplayalim
    public void setPrice(){
        this.orderPrice=this.dish.getPrice()*this.numberOfDish;
    }



}
