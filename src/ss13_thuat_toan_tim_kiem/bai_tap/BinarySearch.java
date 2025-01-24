package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Nhập phần tử thứ: " + i);
            array[i] = Integer.parseInt(scanner.nextLine());
        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int value = 7;
        int result = binarySearch(array, 0, array.length, value);
        if (result != -1) {
            System.out.println("Phần tử " + value + " được tìm thấy tại chỉ mục " + result);
        } else {
            System.out.println("Phần tử " + value + " không tồn tại trong mảng");
        }
    }

    public static int binarySearch(int[] array, int left, int right, int value) {
        if (left <= right) {
            int middle = (left + right) / 2;
            if (array[middle] == value) {
                return middle;
            }
            if (value < array[middle]) {
                return binarySearch(array, left, middle - 1, value);
            }
            return binarySearch(array, middle + 1, right, value);
        }
        return -1;

    }

}
