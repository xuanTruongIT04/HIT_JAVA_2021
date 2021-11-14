package Bai3;

import java.util.Scanner;

public class Nguoi {
    private String hoTen, ngaySinh, queQuan;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập họ tên   : ");      hoTen = sc.nextLine();
        System.out.print("Nhập ngày sinh: ");      ngaySinh = sc.nextLine();
        System.out.print("Nhập quê quán : ");      queQuan = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-25s %-15s %-25s", hoTen, ngaySinh, queQuan);
    }
}
