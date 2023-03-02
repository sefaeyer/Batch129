package mini_projects.MiniBookStore;
//2-product islemleri icin standart
public interface ProductService {
    void processMenu();
    void listProduct();
    void addProduct();
    void deleteProduct();
    void filterProducts(String filter);
}
