package Bai3;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    private String maSV, nganh;
    private int khoa;

    public SinhVien() {
    }

    public String getMaSV() {
        return maSV;
    }

    public String getNganh() {
        return nganh;
    }

    public int getKhoa() {
        return khoa;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }

    public void setKhoa(int khoa) {
        this.khoa = khoa;
    }
}
