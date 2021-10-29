package Bai1;
import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("Nguyễn Tiến Dũng", 18, "Nam", "Code");
        p1.setName("Nguyễn Xuân Trường");
        p1.setAge(19);
        p1.setGender("Men lì");
        p1.setHobby("Chạy pộ");
        System.out.println(p2);
        System.out.println("\nTên: " + p1.getName() + "\n" + "Tuổi: " + p1.getAge() + "\n" + "Giới tính: " + p1.getGender() + "\n" + "Sở thích: " + p1.getHobby() + " !");
    }
}

