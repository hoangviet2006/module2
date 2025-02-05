package ss15_exception.bai_tap;

import java.util.Scanner;
import java.util.SortedMap;

public class ExceptionTamGiac {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;
        System.out.println("Nhập vào cạnh a");
        while (true) {
            try {
                a = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println(" không phải là số, nhập lại cạnh a");
            }
        }
        System.out.println("Nhập vào cạnh b");
        while (true) {
            try {
                b = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Bạn vừa nhập không phải là số,nhập lại cạnh b");
            }
        }
        System.out.println("Nhập vào cạnh c");
        while (true) {
            try {
                c = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Bạn vừa nhập không phải là số,nhập lại cạnh c");
            }
        }
        if (a + b > c ||a + c > b ||b + c > a){
            System.out.println("đây là một tam giác");
        }else {
            System.out.println("Đây không phải một tam giác");
        }
    }
}