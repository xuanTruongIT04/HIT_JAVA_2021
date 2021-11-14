package Bai2;

import java.util.Scanner;

public class SanPham {
    private String maSP, tenSP;
    private int soLuong;
    private double donGia;
    public void InputSP(){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nNhập mã sản phẩm : ");     maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");     tenSP = sc.nextLine();
        System.out.print("Nhập số lượng    : ");     soLuong = sc.nextInt();
        System.out.print("Nhập đơn giá sp  : ");     donGia = sc.nextDouble();
    }

    public void OutputSP(){
        System.out.printf("%-15s %-25s %-15d %-15f %-15f\n", maSP, tenSP, soLuong, donGia, soLuong*donGia);
    }
}
