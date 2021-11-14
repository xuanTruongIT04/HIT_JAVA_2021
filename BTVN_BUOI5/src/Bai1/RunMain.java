package Bai1;

import java.util.Scanner;
import java.util.ArrayList;

public class RunMain {

    public static void HangE(ArrayList<DieuHoa> dieuHoa){
        int dem = 0;
        for(int i=0; i< dieuHoa.size(); i++){
            if(dieuHoa.get(i).getTenHangSX().equals("Electrolux")){
                dieuHoa.get(i).Xuat();
                dem++;
            }

            if(dem==0) System.out.println("Không tồn tại");
        }
    }

    public static void giaThapNhat(ArrayList<DieuHoa> dieuHoa) {
        double min = dieuHoa.get(0).getGiaBan();
        for (int i = 0; i < dieuHoa.size(); i++)
            if (min > dieuHoa.get(i).getGiaBan()) min = dieuHoa.get(i).getGiaBan();

        for (int i = 0; i < dieuHoa.size(); i++) {
            if (min == dieuHoa.get(i).getGiaBan())
                dieuHoa.get(i).Xuat();
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Nhập số lượng điều hoà: ");
        n = sc.nextInt();
        ArrayList<DieuHoa> dieuHoa = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            DieuHoa dh = new DieuHoa();
            dh.Nhap();
            dieuHoa.add(dh);
            System.out.println();
        }

        System.out.printf("%-15s %-25s %-35s %-15s %-15s %-15s\n", "Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Hãng", "Ngày Nhập", "Công Suất", "Giá Bán");
        for (int i = 0; i < n; i++) {
            dieuHoa.get(i).Xuat();
        }

        System.out.println("\nDanh sách các điều hoà có hãng sản xuát Electrolux:");
        System.out.printf("%-15s %-25s %-35s %-15s %-15s %-15s\n", "Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Hãng", "Ngày Nhập", "Công Suất", "Giá Bán");
        HangE(dieuHoa);

        System.out.println("\nCác sản phẩm có giá bán thấp nhất:");
        System.out.printf("%-15s %-25s %-35s %-15s %-15s %-15s\n", "Mã Sản Phẩm", "Tên Sản Phẩm", "Tên Hãng", "Ngày Nhập", "Công Suất", "Giá Bán");
        giaThapNhat(dieuHoa);
    }




}