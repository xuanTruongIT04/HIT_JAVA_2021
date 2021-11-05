package Bai4;
import java.util.Scanner;

public class PhongMay {

    private String maPh, tenPh;
    private double dienTich;
    QuanLy x = new QuanLy();
    May[] y;
    int n;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phong: ");                maPh = sc.nextLine();
        System.out.print("Nhap ten phong: ");               tenPh = sc.nextLine();
        System.out.print("Nhap dien tich: ");               dienTich = sc.nextDouble();
        x.Nhap();
        System.out.print("Nhap so luong may: ");            n = sc.nextInt();
        y = new May[n];
        for(int i=0; i<n; i++) {
            y[i] = new May();
            System.out.print("\nNhap thong tin may thu " + (i + 1) + ": \n");
            y[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.println("===========================================================");
        System.out.println("\nMa phong: " + maPh + "\t\t\t\t\t\tTen phong: " + tenPh);
        System.out.println("Dien tich: "+ dienTich);
        x.Xuat();
        System.out.printf("%-15s %-15s %-15s\n", "MA MAY", "KIEU MAY", "TINH TRANG");
        for(int i=0; i<n; i++)
            y[i].Xuat();
        System.out.println("===========================================================");
    }

}
