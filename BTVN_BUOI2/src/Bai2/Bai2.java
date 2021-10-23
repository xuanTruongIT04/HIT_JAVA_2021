package Bai2;

import java.util.Scanner;
import java.util.Arrays;

public class Bai2 {	
	
		// Khai bao
		static java.util.Scanner sc = new Scanner(System.in);
		static int n;
		static int[] arr;
		
		public static void main(String[] args) {
			int sel;
				do {
					System.out.println("===================================================");
					System.out.println("1.Nhap cac so vao mang");
					System.out.println("2.Hien thi cac so trong mang");
					System.out.println("3.Chen mot so vao mang");
					System.out.println("4.Xoa mot so trong mang");
					System.out.println("5.Dao nguoc mang");
					System.out.println("6.Hien thi phan tu A[1] va cac so chia het cho no");
					System.out.println("7.Tong cac so nguyen to trong mang");
					System.out.println("8.Thoat khoi chuong trinh");
					System.out.println("===================================================");
					System.out.print("Nhap lua chon: ");
					sel = sc.nextInt();
		
						switch(sel) {
						case 1:
							Nhap();
							break;
						case 2:
							Xuat();
							break;
						case 3:
							Chen();
							break;
						case 4:
							Xoa();
							break;
						case 5:
							DaoNguoc();
							break;
						case 6: 
							HienThiPT2();
							break;
						case 7:
							TongSNT();
							break;
						case 8:
							break;
						default:
							System.out.print("Moi ban nhap lai");
						}
				}while(sel > 0 && sel < 9 );
		
		}
		
		// 1
		public static void Nhap() {
			System.out.print("Nhap so phan tu mang: ");
			n = sc.nextInt();
			arr = new int[n];
			for(int i=0; i<n; i++) {
				System.out.print("Nhap A["+i+"]= ");
				arr[i] = sc.nextInt();
			}
		}
		
		// 2
		public static void Xuat() {
			System.out.print("Hien thi cac phan tu mang: ");
			for(int i=0; i<n; i++) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println("");
		}
		
		// 3
		public static int[] Chen() {
			int [] newArr = Arrays.copyOf(arr, n+1);
			
			int k, x;
			System.out.print("Nhap so can chen: ");
			x = sc.nextInt();
			
			System.out.print("Nhap vi tri can chen: ");
			k= sc.nextInt();
			
			for(int i=k-1; i <= n+1; i++)
				newArr[i] = newArr[i+1];
			newArr[k-1] = x;
			
			return newArr;
		}
		
		// 4
		public static void Xoa() {
			System.out.print("Nhap vi tri can xoa:");
			int k = sc.nextInt();
			for(int i=k-1; i<n-1; i++) 
				arr[i] = arr[i+1];
			n --;
			Xuat();
			System.out.println("");
		}
		
		// 5
		public static void DaoNguoc() {
			System.out.print("Hien thi mang dao nguoc: ");
			for(int i=n; i>0; i--) {
				System.out.print(arr[i] + "  ");
			}
			System.out.println("");
		}
		
		// 6
		public static void HienThiPT2() {
			System.out.println("A[1]= " + arr[1]);
			System.out.print("Cac so chia het chia A[1]: ");
			for(int i=0; i<n; i++) {
				if(arr[i] % arr[1] == 0) System.out.print(arr[i] + "  ");
			}
			System.out.println("");
		}
		
		// 7 
		public static void TongSNT() {
			int sum = 0 ;
			for(int i=2; i*i < n; i++) {
				if(n % arr[i] == 0) sum += arr[i];
			}
			System.out.println("Tong cac so nguyen to: " + sum);
		}
		
}
