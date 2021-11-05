package Bai4;
import java.util.Scanner;

public class QuanLy {

    private String maQL, hoTen;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma quan li: ");          maQL = sc.nextLine();
        System.out.print("Nhap ho ten qli: ");          hoTen = sc.nextLine();
    }

    public void Xuat(){
        System.out.println("Quan li: " + maQL + "\t\t\t\t\t\tHo ten: " + hoTen);
    }

}
