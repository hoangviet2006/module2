package ss3_array.thuc_hanh;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class NumberArray {
    public static void main(String[] args) {
        int[] arr;
        int size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào độ dài mảng");
        size = scanner.nextInt();
        while (size > 20){
            System.out.println("Nhập lại độ dài mảng phải nhỏ hơn 20");
            size = scanner.nextInt();
        }
        arr = new int[size];
        int i = 0;
        for (int j = 0; j <size; j++) {
            System.out.println("Nhập vào phần tử thứ "+ (i+1));
            arr[j] = scanner.nextInt();
        }
        int max = arr[0];
        boolean check = false;
        int index = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j]> max){
                max = arr[j];
                index = j;
                check =true;
            }
        }
        System.out.println(Arrays.toString(arr));
        if (check){
            System.out.println("Phần tử có giá trị lớn nhất mảng là: "+ max +" va ở vị trí "+ index);
        }
    }
}
