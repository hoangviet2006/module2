package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class MergeArrays {
    public static void main(String[] args) {
        int[] arr;
        int size;
        int[] arr1;
        int size1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng 1");
        size = scanner.nextInt();
        while (size <= 0) {
            System.out.println("Nhập lại độ dài mảng");
            size = scanner.nextInt();
        }
        arr = new int[size];
        for (int j = 0; j < size; j++) {
            System.out.println("Nhập vào phần tử thứ " + (j + 1));
            arr[j] = scanner.nextInt();
        }
        System.out.println("Nhập vào độ dài mảng 2");
        size1 = scanner.nextInt();
        while (size1 <= 0) {
            System.out.println("Nhập lại độ dài mảng");
            size1 = scanner.nextInt();
        }
        arr1 = new int[size1];
        for (int j = 0; j < size1; j++) {
            System.out.println("Nhập vào phần tử thứ " + (j + 1));
            arr1[j] = scanner.nextInt();
        }
        System.out.println("Mảng 1: " + Arrays.toString(arr));
        System.out.println("Mảng 2: " + Arrays.toString(arr1));
        int[] arr2 = new int[arr.length + arr1.length];
        for (int j = 0; j < arr.length; j++) {
            arr2[j] = arr[j];
        }
        for (int j = 0; j < arr1.length; j++) {
            arr2[arr.length + j] = arr1[j];
        }
        System.out.println(Arrays.toString(arr2));

    }
}
