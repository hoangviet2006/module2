package ss15_exception.bai_tap;

import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0;
        int b = 0;
        int c = 0;
        boolean check = false;
        while (!check) {
            try {
                System.out.println("nhập vào cạnh a: ");
                a = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                check = false;
            }
        }
        while (!check) {
            try {
                System.out.println("nhập vào cạnh b: ");
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                check = false;
            }
        }
        while (!check) {
            try {
                System.out.println("nhập vào cạnh c: ");
                c = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                check = false;
            }
        }
        if ((a + b) > c && (a + c) > b && (b + c) > a) {
            System.out.println("Đây là một tam giác");
        }else {
            System.out.println("Đây không phải một tam giác");
        }
    }
}
