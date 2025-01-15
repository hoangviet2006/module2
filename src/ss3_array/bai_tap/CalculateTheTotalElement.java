package ss3_array.bai_tap;

public class CalculateTheTotalElement {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };
        for (int i = 0; i < arr.length; i++) {
                sum += arr[i][0];
        }
        System.out.println(sum);
    }
}
