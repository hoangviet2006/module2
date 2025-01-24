package ss11_stack_queue.bai_tap.bai2_so_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class StackNhiPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------Nhập vào một số------");
        int num = Integer.parseInt(scanner.nextLine());
        Stack<Integer> stack = new Stack<>();
        while (num > 0) {
            int sum = num % 2;
            stack.push(sum);
            num /= 2;
        }

        int size = stack.size();
        String string = "";
        for (int i = 0; i < size; i++) {
            string += stack.pop();
        }
        System.out.print("Số nhị phân vừa tìm được l"+string);
    }
}
