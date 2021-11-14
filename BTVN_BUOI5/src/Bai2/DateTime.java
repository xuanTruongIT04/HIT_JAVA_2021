package Bai2;

import java.util.Scanner;

public class DateTime {
    private int ngay, thang, nam;
    public void InputDate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngày : ");        ngay = sc.nextInt();
        System.out.print("Nhập tháng: ");        thang = sc.nextInt();
        System.out.print("Nhập năm  : ");        nam = sc.nextInt();
    }

    public void OutputDate(){
        System.out.println("\nNgày: " + ngay + "/" + thang + "/" + nam);
    }
}
