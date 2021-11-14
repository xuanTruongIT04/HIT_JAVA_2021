package Bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class LopHoc {
    private String maLH, tenLH, ngayMo;
    ArrayList<SinhVien> x = new ArrayList<>();
    private int n;
    private String giaoVien;

    public LopHoc() {
    }

    public String getMaLH() {
        return maLH;
    }

    public String getTenLH() {
        return tenLH;
    }

    public String getNgayMo() {
        return ngayMo;
    }

    public ArrayList<SinhVien> getX() {
        return x;
    }

    public int getN() {
        return n;
    }

    public String getGiaoVien() {
        return giaoVien;
    }

    public void setMaLH(String maLH) {
        this.maLH = maLH;
    }

    public void setTenLH(String tenLH) {
        this.tenLH = tenLH;
    }

    public void setNgayMo(String ngayMo) {
        this.ngayMo = ngayMo;
    }

    public void setX(ArrayList<SinhVien> x) {
        this.x = x;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setGiaoVien(String giaoVien) {
        this.giaoVien = giaoVien;
    }
}
