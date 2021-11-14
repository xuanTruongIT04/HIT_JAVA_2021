package Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class Phieu {
    private String maPhieu, tenPhieu;
    private DateTime a  = new DateTime();
    ArrayList<SanPham> x = new ArrayList<>();
    private int n;
    public void InputPhieu(){

        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã phiếu : ");        maPhieu  = sc.nextLine();
        System.out.print("Nhập tên phiếu: ");        tenPhieu = sc.nextLine();
        a.InputDate();
        System.out.print("Nhập số lượng sản phẩm: ");         n = sc.nextInt();
        for(int i=0; i<n; i++){
            SanPham sp = new SanPham();
            sp.InputSP();
            x.add(sp);
        }
    }
    public void OutputPhieu(){
        System.out.print("\nMã phiếu: " + maPhieu);
        System.out.print("\t\t\t\t\t\t\t\t\tTên phiếu: " + tenPhieu);
        a.OutputDate();

        System.out.printf("\n%-15s %-25s %-15s %-15s %-15s\n", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Thành Tiển");
        for(int i=0; i<n; i++)
            x.get(i).OutputSP();
    }
}
