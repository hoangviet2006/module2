package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class ConVert {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double USD;
        double VND = 23000;
        System.out.println("Nhập vào số USD muốn đổi sang  VND: ");
        USD = scanner.nextDouble();
        double Doi = VND*USD;
        System.out.println(Doi);
    }
}
