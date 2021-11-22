package Bai1;
import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Nhập chuỗi: ");
        str = sc.nextLine();
        int dem = 0;
        int tich =1;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                dem ++;
                tich *= (str.charAt(i) - '0');
            }
        }
        System.out.println("Có " + dem + " ký tự số");
        if(dem == 0) tich = 0;
        System.out.println("Tích: " + tich);
    }
}
