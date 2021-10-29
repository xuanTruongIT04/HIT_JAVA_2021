package Bai2;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Array arr1 = new Array();
        Array arr2 = new Array();
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập thông tin mảng 1: ");
        arr1.InputDate();
        System.out.println("Nhập flag 1: ");
        Boolean flag = sc.nextBoolean();
        arr1.Filter(flag);
        System.out.println("\n");
// =============================================

        System.out.println("Nhập thông tin mảng 2: ");
        arr2.InputDate();
        System.out.println("Nhập flag 2: ");
        flag = sc.nextBoolean();
        arr2.Filter(flag);
        System.out.println("\n");
// =============================================

        double TBCArr1 = arr1.Sum() / arr1.getN();
        double TBCArr2= arr2.Sum() / arr2.getN();

        if(TBCArr1 > TBCArr2)       System.out.println("TBC mảng 1 lớn hơn TBC mảng 2");
        else if (TBCArr1 <TBCArr2)  System.out.println("TBC mảng 2 lớn hơn TBC mảng 1");
        else                        System.out.println("Bye");
    }
}
