package ss3_array.test;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[7];
        for (int i = 0; i < array.length; i++) {
            while (true) {
                System.out.println("Nhập array[" + (i + 1) + "]: ");
                try {
                    array[i] = Integer.parseInt(scanner.nextLine());
                    break;
                } catch (NumberFormatException numberFormatException) {
                    System.out.println("Lỗi không phải là số! Nhập lại");
                }
            }
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
