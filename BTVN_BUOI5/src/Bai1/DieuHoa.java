package Bai1;

import java.util.Scanner;

public class DieuHoa extends SanPham {
    private double congSuat, giaBan;

    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        super.Nhap();
        System.out.print("Nhập Công Suất: ");       congSuat = sc.nextDouble();
        System.out.print("Nhập Giá Bán  : ");       giaBan = sc.nextDouble();
    }

    public void Xuat(){
        super.Xuat();
        System.out.printf(" %-15f %-15f\n", congSuat, giaBan);
    }

    public double getGiaBan() {
        return giaBan;
    }
}
