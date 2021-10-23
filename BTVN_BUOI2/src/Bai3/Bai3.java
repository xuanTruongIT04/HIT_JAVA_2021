package Bai3;
import java.util.Scanner;

public class Bai3 {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = new String();
		int d = 0;
		float sum = 0;
		System.out.print("Nhap chuoi bat ki: ");
		s = sc.next();
		for(int i=0; i< s.length(); i++)
		{
			if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
				d ++;
				sum += s.charAt(i) - 48;
			}
		}
		if(d!=0) {
			System.out.println("TRUE");
			System.out.println("TBC: " + (sum/d));
		}
		else System.out.print("FALSE");
	}
}
