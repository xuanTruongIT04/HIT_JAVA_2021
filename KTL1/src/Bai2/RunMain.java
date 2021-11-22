package Bai2;
import java.util.*;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<Book> book = new ArrayList<>() ;
        int choose;
        do {
            System.out.println("1. Add book ");
            System.out.println("2. Edit book by id");
            System.out.println("3. Delete book by id");
            System.out.println("4. Sort books by name (ascending)");
            System.out.println("5. Sort books by price (descending)");
            System.out.println("6. Show all books");
            System.out.println("7. Exit !");
            System.out.println("Nhập lựa chọn của bạn:");
            choose = sc.nextInt();
        }
        switch(choose){
            case 1:
                System.out.print("Add book: ");
                add
            case 2:
                System.out.print("Edit book by id: ");
            case 3:
                System.out.print("Delete book by id: ");
            case 4:
                System.out.print("Sort books by name (ascending): ");
            case 5:
                System.out.print("Sort books by price (descending): ");
            case 6:
                System.out.print("Show all books: ");
            case 7:
                System.out.print("Exit: ");
                break;
        }
    }
}
