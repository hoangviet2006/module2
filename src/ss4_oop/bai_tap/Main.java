package ss4_oop.bai_tap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticequation = new QuadraticEquation(a, b, c);

        double delta = quadraticequation.getDiscriminant();
        if (delta < 0.0) {
            System.out.println(quadraticequation.getRootString());
        } else if (delta >= 0) {
            System.out.println(quadraticequation.getRoot1() + "\n" + quadraticequation.getRoot2());
        } else {
            System.out.println(quadraticequation.getRoot1());
        }

    }
}
// System.currentTimeMillis(); 2424343343433443434, số milisecond tính từ 1970 đến thời tian hiện tại
