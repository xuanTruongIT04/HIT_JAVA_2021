package Bai2;
import java.util.Scanner;

public class NhanSu {

    private String maNS, hoTen;
    private Date NS = new Date();
    public void Nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma nhan su: ");          maNS = sc.nextLine();
        System.out.print("Nhap ho ten nsu: ");          hoTen = sc.nextLine();
        NS.Nhap();
    }
    public void Xuat(){
        System.out.println("Ma nhan su: " + maNS);
        System.out.println("Ho ten nsu: " + hoTen);
        NS.Xuat();
    }

}
