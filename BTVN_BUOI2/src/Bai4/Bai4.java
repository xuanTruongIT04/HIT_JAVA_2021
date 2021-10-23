package Bai4;

import java.util.*;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();
        
        s = s.trim(); // Xoa ky tu trang o dau va cuoi
        s = s.replaceAll("[0-9]",""); // Xoa cac so
        s = s.replaceAll("\\s+"," "); // Thay nhieu khoang trang bang 1 khoang trang
        
        String[] temp = s.split(" ");
        s = "";
        for( int i = 0 ; i < temp.length; i ++){
            s+= temp[i].substring(0,1).toUpperCase() + temp[i].substring(1);
        }
        System.out.println(s);
    }
}
