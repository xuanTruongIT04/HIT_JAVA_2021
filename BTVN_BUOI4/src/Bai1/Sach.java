package Bai1;
import java.util.Scanner;

public class Sach {
    Scanner sc = new Scanner(System.in);

    private String maSach, tenSach, NXB;
    private int soTrang;
    private double giaTien;

    public void Nhap(){
        System.out.print("Nhap ma sach: ");       maSach = sc.nextLine();
        System.out.print("Nhap ten sach: ");      tenSach = sc.nextLine();
        System.out.print("Nhap ten NXB: ");       NXB = sc.nextLine();
        System.out.print("Nhap so trang: ");      soTrang = sc.nextInt();
        System.out.print("Nhap gia tien: ");      giaTien = sc.nextDouble();
        System.out.println();
    }
    public void Xuat(){
        System.out.printf("%-15s %-25s %-30s %-15d %-15f\n", maSach, tenSach, NXB, soTrang, giaTien);
    }
}
