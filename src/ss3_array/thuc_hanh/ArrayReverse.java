package ss3_array.thuc_hanh;

import java.util.Scanner;

public class ArrayReverse {
    public static void main(String[] args) {
        int size;
        int[] arr;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng:");
        size = scanner.nextInt();
        while (size > 20) {
            System.out.println("Nhập lại độ dài mảng phải nhỏ hơn 20");
            size = scanner.nextInt();
        }
        arr = new int[size];
        int i = 0;
        for (int j = 0; j < size; j++) {
            System.out.println("Nhập phần tử thứ " + (i + 1)+":");
            arr[j] = scanner.nextInt();
        }
        for (i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        System.out.println("Mảng sau khi đảo ngược:");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
