package ss3_array.thuc_hanh;

public class MinArray {
    public static void main(String[] args) {
        int[] arr = {3,5,6,9,8,4,6,1,1,3,5};
        int min = minArray(arr);
        System.out.println("phần tử nhỏ nhất trong mảng là: " + min);
    }

    public static int minArray(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }
}
