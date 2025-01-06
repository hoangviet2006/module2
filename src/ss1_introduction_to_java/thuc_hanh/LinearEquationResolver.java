package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LinearEquationResolver {
    public static void main(String[] args) {
        System.out.println("Trình Giải Phương Trình Bậc Nhất");
        System.out.println("Phương trình  có dạng a * x+ b = c, Nhập  vào các hằng số");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập vào b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập vào c: ");
        double c = scanner.nextDouble();
        if (a!=0){
            double x = (b-c)/a;
            System.out.println(x);
        }else {
            if (b==c){
                System.out.println("Khong co giai phap");
            }else {
                System.out.println("Vô Lý");
            }
        }
    }
}
