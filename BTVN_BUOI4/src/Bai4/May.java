package Bai4;
import java.util.Scanner;

public class May {

    private String maMay, kieuMay, tinhTrang;
    public void Nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma may    : ");
        maMay = sc.nextLine();
        System.out.print("Nhap kieu may  : ");
        kieuMay = sc.nextLine();
        System.out.print("Nhap tinh trang: ");
        tinhTrang = sc.nextLine();
    }

    public void Xuat(){
        System.out.printf("%-15s %-15s %-15s\n", maMay, kieuMay, tinhTrang);
    }

}

