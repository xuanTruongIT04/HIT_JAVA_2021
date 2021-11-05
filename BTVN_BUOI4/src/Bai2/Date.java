package Bai2;
import java.util.Scanner;

public class Date {

    private int D, M, Y;
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ngay: ");              D = sc.nextInt();
        System.out.print("Nhap thang: ");             M = sc.nextInt();
        System.out.print("Nhap nam: ");               Y = sc.nextInt();
    }
    public void Xuat(){
        System.out.println("Date: " + D + "  / " + M + " / " + Y );
    }

}
