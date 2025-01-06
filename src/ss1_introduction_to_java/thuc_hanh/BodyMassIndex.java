package ss1_introduction_to_java.thuc_hanh;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double height, weight, bmi;
        System.out.println("Nhập vào cân nặng (kilogam) : ");
        weight = scanner.nextDouble();
        System.out.println("Nhập vào chiều cao(cm) : ");
        height = scanner.nextDouble();
        height = height / 100;
        bmi = weight / (height * height);
        if (bmi < 18) {
            System.out.println("Underweight");
        } else if (bmi < 25) {
            System.out.println("Normal");
        } else if (bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
