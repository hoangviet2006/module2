package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        float weight;
        float height;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập Chiều rộng");
        weight = scanner.nextFloat();
        System.out.println("Nhập vào chiều cao");
        height = scanner.nextFloat();
        float area = weight*height;
        System.out.println("Diện tích : "+ area);
    }
}
