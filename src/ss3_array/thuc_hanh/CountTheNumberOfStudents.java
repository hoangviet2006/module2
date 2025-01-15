package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class CountTheNumberOfStudents {
    public static void main(String[] args) {
        int count = 0;
        int[] arr;
        int number;
        System.out.println("Nhập vào độ dài mảng");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        while (number > 30 || number < 0) {
            System.out.println("Nhập lại độ dài mảng, mảng có độ dài lớn hơn 0 và nhỏ hơn 30");
            number = scanner.nextInt();
        }
        arr = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Nhập vào điểm của học viên: " + (i + 1));
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 5 && arr[i] <= 10) {
                count++;
            }
        }
        System.out.println("Số lượng học viên pass: " + count);
    }
}
