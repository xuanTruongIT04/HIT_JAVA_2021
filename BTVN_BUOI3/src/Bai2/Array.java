package Bai2;
import java.util.Scanner;

public class Array {
    public int[] a;
    public int n;
    static Scanner sc = new Scanner(System.in);
    public Array(){
        a = null;
        n = 0;
    }

    public Array(int []a, int n){
        this.n = n;
        this.a = a;
    }

    public int getN(){
        return n;
    }

    public int[] getA(){
        return a;
    }

    public void setN(int n){
        this.n = n;
    }

    public void setA(int[] a){
        this.a = a;
    }

    public void InputDate(){
        System.out.print("Nhập số lượng phần tử mảng: ");
        n = sc.nextInt();
        a = new int[n];
        for(int i=0; i<n; i++)
        {
            System.out.print("A["+i+"]= ");
            a[i] = sc.nextInt();
        }
        System.out.println();
    }

    public void Show(){
        System.out.println("Hiển thị các phần tử mảng: ");
        for(int x : a ){
            System.out.print(x + "  ");
        }
        System.out.println();
    }

    public int Sum(){
        int sum = 0;
        for(int i=0; i<n; i++){
            sum += a[i];
        }
        return sum;
    }

    public void Filter(Boolean flag) {
        if (flag == true) {
            System.out.println("Các phẩn tử chẵn trong mảng: ");
            for (int i = 0; i < n; i++)
                if (a[i] % 2 == 0)
                    System.out.print(a[i] + "  ");
        } else {
            System.out.println("Các phẩn tử lẻ trong mảng: ");
            for (int i = 0; i < n; i++)
                if (a[i] % 2 != 0)
                    System.out.println(a[i] + "  ");
        }
        System.out.println();
    }

}
