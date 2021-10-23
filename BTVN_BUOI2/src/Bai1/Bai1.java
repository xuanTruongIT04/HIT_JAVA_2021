package Bai1;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int x, y, z;
       System.out.print("Nhap so thu nhat:");
       x = sc.nextInt();
       System.out.print("Nhap so thu hai:");
       y = sc.nextInt();
       System.out.print("Nhap so thu ba:");
       z = sc.nextInt();
       if(x > y && x > z) System.out.println("Max la: " + x);
       else if(y > x && y > z) System.out.println("Max la: " + y);
       else if(z > x && z > y) System.out.println("Max la: " + z);
        }
}
