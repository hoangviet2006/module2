package ss3_array.bai_tap;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class DeleteIndex {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(Arrays.toString(arr));
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa");
        int number = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (number == arr[i]) {
                index = i;
                break;
            }
        }
        if (index == -1) {
            System.out.println("Phần tử vừa nhập không có trong mảng");
        } else {
            int[] newArr = new int[arr.length - 1];
            for (int i = 0, k = 0; i < arr.length; i++) {
                if (number == arr[i]) {
                    continue;
                }
                newArr[k++] = arr[i];
            }
            System.out.println("Mảng sau khi xóa: " + Arrays.toString(newArr));

        }
    }
}
