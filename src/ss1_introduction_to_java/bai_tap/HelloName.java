package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        System.out.println("Nhập vào tên của bạn: ");
        String name = scanner.nextLine();
        System.out.println("Hello "+ name);
    }
}
