package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        int a;
        int b;
        double UCLN =1;
        boolean check = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("nhập vào số b: ");
        b = scanner.nextInt();
        if (a > b) {
            for (int i = 1; i <= b; i++) {
                if (a % i == 0 && b % i == 0) {
                    UCLN = i;
                    check = true;
                }
            }
        }else {
            for (int i = 1; i <= a; i++) {
                if (a % i == 0 && b % i == 0) {
                    UCLN = i;
                    check = true;
                }
            }
        }
        if (check){
            System.out.println("Ước chung lớn nhất của "+ a + " và "+ b + " là "+ UCLN);
        }
    }
}
