package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Interest {
    public static void main(String[] args) {
        double money;
        int month;
        double interest;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số tiền muốn gửi:");
        money = scanner.nextDouble();

        System.out.println("Nhập vào số tháng gửi:");
        month = scanner.nextInt();

        System.out.println("Nhập vào lãi % lãi xuất:");
        interest = scanner.nextDouble();

        double interestRate = 0;
        for (int i = 1; i <= month; i++) {
            interestRate += money * (interest / 100)/12 * month;
        }
        System.out.println(interestRate + " số tiền lãi sau " + month + " tháng");
    }
}
