package Bai2;
import java.util.*;

public class Book extends Document{
    private int numberOfPage;
    private String author;

    public Book() {
    }

    public Book(int numberOfPage, String author) {
        this.numberOfPage = numberOfPage;
        this.author = author;
    }

    public int getNumberOfPage() {
        return numberOfPage;
    }

    public String getAuthor() {
        return author;
    }

    public void setNumberOfPage(int numberOfPage) {
        this.numberOfPage = numberOfPage;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void input() {
        super.inputDo();
        System.out.print("Nhập số trang sách: "); this.numberOfPage = sc.nextInt();
        System.out.print("Nhập tác giả: "); this.author = sc.nextLine();
    }

    public void output(){
        super.outputDO();
        System.out.println("Số trang sách: " +numberOfPage);
        System.out.println("Tác giả: " +author);
    }

}
