package ss3_array.bai_tap;

import java.util.Arrays;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        for (int i = 0; i < arr.length; i++) {
                sum +=arr[i][i];
                sum +=arr[i][arr.length - 1 - i];
        }

        System.out.println(" Tổng các phần tử trong hai đường chéo: "+sum);
    }
}
