package Bai1;

import java.util.Scanner;

public class SanPham {
    private String maSP, tenSP, tenHangSX, ngayNhap;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm : ");     maSP = sc.nextLine();
        System.out.print("Nhập tên sản phẩm: ");     tenSP = sc.nextLine();
        System.out.print("Nhập tên hãng    : ");     tenHangSX = sc.nextLine();
        System.out.print("Nhập ngày nhập   : ");     ngayNhap = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15s %-25s %-35s %-15s", maSP, tenSP, tenHangSX, ngayNhap);
    }

    public String getTenHangSX() {
        return tenHangSX;
    }
}
