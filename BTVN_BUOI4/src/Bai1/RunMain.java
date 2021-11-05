package Bai1;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Sach []a;
        int n;
        System.out.print("Nhap so luong sach: ");
        n =sc.nextInt();
        a = new Sach[n];
        for(int i=0; i<n; i++){
            a[i] = new Sach();
            System.out.println("\nNhap cuon sach thu " + (i+1)+": ");
            a[i].Nhap();
        }
        System.out.printf("%-15s %-25s %-30s %-15s %-15s\n", "MA SACH", "TEN SACH", "NHA XUAT BAN", "SO TRANG", "GIA TIEN");
        for(int i=0; i<n; i++)
            a[i].Xuat();
    }
}
