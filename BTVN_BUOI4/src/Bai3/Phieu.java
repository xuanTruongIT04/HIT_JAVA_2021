package Bai3;
import java.util.Scanner;

public class Phieu {

    private String maPhieu;
    private Hang[] x;
    private int n;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma phieu: ");
        maPhieu = sc.nextLine();
        System.out.print("Nhap so luong hang hoa: ");
        n = sc.nextInt();
        x = new Hang[n];
        for(int i=0; i<n; i++)
        {
            x[i] = new Hang();
            System.out.println("\nNhap thong tin hang thu " + (i+1) + ": ");
            x[i].Nhap();
        }
    }

    public void Xuat(){
        System.out.println("Ma phieu:" + maPhieu);
        double sum = 0;
        System.out.println();
        System.out.printf("%-15s %-25s %-15s\n", "MA HANG", "TEN HANG", "DON GIA");
        for(int i=0; i<n; i++){
            sum += x[i].getDonGia();
            x[i].Xuat();
        }
        System.out.println("\nTONG TIEN CUA PHIEU: " + sum);
    }

}
