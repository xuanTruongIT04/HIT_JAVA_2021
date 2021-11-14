package Bai3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class RunMain {

    public static void Nhap(LopHoc k){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã lớp học: ");                  k.setMaLH(sc.nextLine());
        System.out.print("Nhập tên lớp học: ");                 k.setTenLH(sc.nextLine());
        System.out.print("Nhập ngày mở lớp: ");                 k.setNgayMo(sc.nextLine());
        System.out.print("Nhập số lượng sinh viên: ");          k.setN(sc.nextInt());

        for(int i=0; i<k.getN(); i++){
            SinhVien sv = new SinhVien();
            System.out.println();
            sc.nextLine();
            sv.Nhap();
            System.out.print("Nhập mã sinh viên: ");            sv.setMaSV(sc.nextLine());
            System.out.print("Nhập tên ngành   : ");            sv.setNganh(sc.nextLine());
            System.out.print("Nhập khoá học    : ");            sv.setKhoa(sc.nextInt());
            k.x.add(sv);
        }
        System.out.print("Nhập tên giáo viên: ");               k.setGiaoVien(sc.nextLine());
        System.out.println();
    }

    public static void Xuat(LopHoc k){
        System.out.print("\n\nMã lớp học: " + k.getMaLH());
        System.out.print("\t\t\t\t\tTên lớp học: " + k.getTenLH());
        System.out.println("\t\t\t\t\tNgày mở lớp: " + k.getNgayMo());
        System.out.printf("%-25s %-15s %-25s %-15s %-25s %-15s\n", "Họ tên", "Ngày Sinh", "Quê Quán", "Mã Sinh Viên", "Ngành học", "Khoá học");
        for(int i=0; i<k.getN(); i++){
            k.x.get(i).Xuat();
            System.out.printf(" %-15s %-25s %-15d\n", k.x.get(i).getMaSV(),  k.x.get(i).getNganh(), k.x.get(i).getKhoa() );
        }
    }

    public static int DemK15(LopHoc k){
        int dem = 0;
        for(int i=0; i<k.getN(); i++){
            if(k.x.get(i).getKhoa() == 15) dem ++;
        }
        return dem;
    }

    public static void SapXep(LopHoc k){
        for(int i=0; i< k.getN(); i++)
            for(int j=i+1; j< k.getN(); j++)
            if (k.x.get(i).getKhoa() > k.x.get(j).getKhoa()) Collections.swap(k.getX(), i, j);
    }

    public static void main(String[] args) {
        LopHoc k = new LopHoc();
        Nhap(k);
        Xuat(k);
        System.out.println("\nCó " + DemK15(k) + " sinh viên khoá K15!");
        SapXep(k);
        Xuat(k);
    }
}
