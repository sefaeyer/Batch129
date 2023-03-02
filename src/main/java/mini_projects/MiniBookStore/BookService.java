package mini_projects.MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-a-bookla ilgili islemler
public class BookService implements ProductService{
    Scanner inp=new Scanner(System.in);
    //3-booklari saklamak icin list olustur
    List<Book> books = new ArrayList<>();
    //4-baslangicta sistemde mevcut kitaplar olsun:test etmek icin
    public BookService(){
        Book book1=new Book("Fareler ve Insanlar","120",15,"J.Steinbeck","Penguin","A111");
        Book book2=new Book("Sefiller","150",5,"V.Hugo","Penguin","A222");
        Book book3=new Book("Suc ve Ceza","120",15,"Dostoyevski","Dream","A333");
        this.books.add(book1);
        this.books.add(book2);
        this.books.add(book3);
    }


//5-islem menusu
    @Override
    public void processMenu() {
        int choice;
        do{
            System.out.println("------------------------");
            System.out.println("1-Kitaplari Listele");
            System.out.println("2-Kitap Ekle");
            System.out.println("3-Kitap Sil");
            System.out.println("4-Yayinevine gore Filtrele");
            System.out.println("0-Geri Don");
            System.out.println("Seciminiz:");
            choice=inp.nextInt();
            inp.nextLine();

            switch (choice){
                case 1:
                    listProduct();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    System.out.println("Yayinevi : ");
                    String pub=inp.nextLine();
                    filterProducts(pub);
                    break;
                case 0:
                    System.out.println("Ana Menuye yonlendiriliyorsunuz");
                    break;
                default:
                    System.out.println("Hatali giris!");
                    break;
            }



        }while(choice!=0);


    }
//6-kitaplari formatla yazdiralim
    @Override
    public void listProduct() {
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                "ID","Kitap Adi","Yazari","Yayinevi","ISBN","Birim Fiyat","Stok Durumu");
        System.out.println("-------------------------------------------------------------------------------------");
        this.books.forEach(book-> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),book.getPrice(),book.getStock()));
        System.out.println("-------------------------------------------------------------------------------------");
        System.out.println();

    }
//7- yeni kitap ekleme
    @Override
    public void addProduct() {
        System.out.println("ISBN: ");
        String isbn=inp.nextLine();
        boolean isExists=false;
        for(Book book:this.books){
            if(book.getIsbn().equals(isbn)){
                System.out.println("Bu kitap sistemde zaten kayitli, lutfen urun guncelleme yapiniz.");
                isExists=true;
                break;
            }
        }
        if(!isExists){
            System.out.println("Kitap adi:");
            String name=inp.nextLine();
            System.out.println("Yazar adi:");
            String author=inp.nextLine();
            System.out.println("Yayinevi:");
            String publisher=inp.nextLine();
            System.out.println("Birim fiyati:");
            String price=inp.nextLine();
            System.out.println("Stok:");
            int stock=inp.nextInt();
            inp.nextLine();
            Book newBook=new Book(name,price,stock,author,publisher,isbn);
            this.books.add(newBook);
        }
        listProduct();


    }
//updateProduct  - stok artirma azaltma fiyat degistirme - ODEV

    //8- kullanicidan alinan id ile urunu bulalim ve listeden silelim
    @Override
    public void deleteProduct() {
        boolean isExists=true;
        System.out.println("Kitap id:");
        int id=inp.nextInt();
        for(Book book:this.books){
            if(book.getId()==id){
                isExists=true;
                this.books.remove(book);
                System.out.println("Urun silindi.");
                break;
            }else{
                isExists=false;
            }
        }
        if(!isExists){
            System.out.println("Urun bulunamadi");
        }

    }
//9- kitaplari yayinevine gore filtreleyelim
    @Override
    public void filterProducts(String filter) {
//        this.books.stream().
//                filter(book->book.getPublisher().equalsIgnoreCase(filter)).
//                forEach(book -> System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
//                        book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),
//                        book.getPrice(),book.getStock()));
        int counter=0;
        for(Book book:this.books){
            if(book.getPublisher().equalsIgnoreCase(filter)){
                System.out.printf("%-2s | %-20s | %-15s | %-10s | %-4s | %-10s | %-3s\n",
                        book.getId(),book.getName(),book.getAuthorName(),book.getPublisher(),book.getIsbn(),book.getPrice(),book.getStock());
                counter++;
            }else{

            }
        }
        if(counter==0){
            System.out.println("Urun bulunamadi.");
        }



    }
}
