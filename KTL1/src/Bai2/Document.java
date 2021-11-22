package Bai2;
import java.util.*;

public class Document {
    protected String id, name, publisher;
    protected Double price;

    Scanner sc = new Scanner(System.in) ;
    public Document() {
    }

    public Document(String id, String name, String publisher, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPublisher() {
        return publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputDo() {
        System.out.print("Nhập id sách : "); this.id = sc.nextLine() ;
        System.out.print("Nhập tên sách : "); this.name = sc.nextLine() ;
        System.out.print("Nhập NSB sách : "); this.publisher = sc.nextLine() ;
        System.out.print("Nhập giá sách : "); this.price = sc.nextDouble() ;
    }

    public void outputDO() {
        System.out.println("Id sách : " + id);
        System.out.println("Tên sách : " + name);
        System.out.println("NSB sách : " + publisher);
        System.out.println("Giá sách : " + price);

    }
}
