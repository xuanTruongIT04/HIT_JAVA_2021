package Bai3;
import java.util.Scanner;

public class Hang {

    private String maHang, tenHang;
    private double donGia;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");         maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");        tenHang = sc.nextLine();
        System.out.print("Nhap don gia: ");         donGia = sc.nextDouble();
        sc.nextLine();
    }
    public void Xuat(){
        System.out.printf("%-15s %-25s %-15f\n", maHang, tenHang, donGia);
    }

    public double getDonGia() {
        return donGia;
    }
}
