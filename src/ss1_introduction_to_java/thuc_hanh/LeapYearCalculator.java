package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class LeapYearCalculator {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào năm cần kiểm tra");
        year = scanner.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Năm vừa nhập là năm nhuận " + year);
                } else {
                    System.out.println("Năm vừa nhập không phải là năm nhuận " + year);
                }
            } else {
                System.out.println("Năm vừa nhập là năm nhuận " + year);
            }
        } else {
            System.out.println("Năm vừa nhập không phải là năm nhuận " + year);
        }
    }


}

