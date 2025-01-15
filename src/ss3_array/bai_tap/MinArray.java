package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MinArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        System.out.println("Nhập vào độ dài mảng");
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        while (size < 0) {
            System.out.println("Nhập lại độ dài mảng");
            size = scanner.nextInt();
        }
        arr = new int[size];
        for (int j = 0; j < size; j++) {
            System.out.println("Nhập phần tử thứ: " + (j + 1));
            arr[j] = scanner.nextInt();
        }
        System.out.println("Mảng vừa nhập là " + Arrays.toString(arr));
        int min = arr[0];
        for (int j = 1; j < arr.length; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
        }
        System.out.println("Giá trị nhỏ nhất trong mảng: " + min);
    }
}
