package Bai4;

import java.util.Scanner;

public class RunMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Sum<Integer> sumI = new Sum<Integer>(16, 06);
        System.out.println("Sum Integer: " + (sumI.getSoA() + sumI.getSoB()));

        Sum<Long> sumL = new Sum(1616161616L, 0606060606L);
        System.out.println("Sum Long: " + (sumL.getSoA() + sumL.getSoB()));

        Sum<Float> sumF = new Sum<Float>(1.6f, 0.6f);
        System.out.println("Sum Float: " + (sumF.getSoA() + sumF.getSoB()));

        Sum<Double> sumD = new Sum(1.606, 2.002);
        System.out.println("Sum Double: " + (sumD.getSoA() + sumD.getSoB()));



    }
}
