package mini_projects.RestaurantBillGenerator;
//3
public class Dish {
   //yiyeceklerin field lari okunsun ama degistirilemesin
   private int code;
   private String name;
   private double price;

   //yiyecek obje olusturulurken ozellikleri de set edilsin


    public Dish(int code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    //dish objelerini yazdirmak icin toString
    @Override
    public String toString() {
        return  "code=" + code +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
