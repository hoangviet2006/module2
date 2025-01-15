package ss3_array.bai_tap;

import java.util.Arrays;
import java.util.Scanner;

public class AddIndex {
    /* public static void main(String[] args) {
         int[] arr = {1, 2, 3, 4, 5, 6, 4};
         System.out.println( "Mảng ban đầu "+Arrays.toString(arr));
         System.out.println("Nhập phần tử muốn thêm vào mảng:");
         Scanner scanner = new Scanner(System.in);
         int number = scanner.nextInt();
         int[] newArr = new int[arr.length + 1];
         for (int i = 0; i < arr.length; i++) {
             newArr[i] = arr[i];
         }
         newArr[arr.length] = number;
         System.out.println("Mảng sau khi thêm phần tử mới "+Arrays.toString(newArr));
     }*/
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] newArr = new int[arr.length + 1];
        System.out.println("Mảng ban đầu: "+ Arrays.toString(arr));
        System.out.println("Nhập phần tử muốn thêm vào mảng:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Nhập vị trí muốn thêm phần tử đó vào mảng:");
        int index = scanner.nextInt();
        if (index < 0 || index > arr.length - 1) {
            System.out.println("Vị trí không phù hợp");
        } else {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
                newArr[index] = number;
            }
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
            System.out.println("Mảng sau khi thêm phần tử: "+Arrays.toString(newArr));
        }
    }
}
