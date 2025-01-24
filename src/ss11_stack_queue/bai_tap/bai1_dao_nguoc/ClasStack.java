package ss11_stack_queue.bai_tap.bai1_dao_nguoc;

import java.util.Arrays;
import java.util.Stack;

public class ClasStack {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            stack.push(arr[i]);
        }
        int size = stack.size();
        for (int i = 0; i < size; i++) {
            arr[i] = stack.pop();
        }
        System.out.println(Arrays.toString(arr));

        String word = "Hoàng Đình Việt";
        String[] strings = word.split("");
        Stack<String> stringStack = new Stack<>();
        for (int i = 0; i < strings.length; i++) {
            stringStack.push(strings[i]);
        }
        int size1 = stringStack.size();
        for (int i = 0; i < size1; i++) {
            strings[i] = stringStack.pop();
        }
        System.out.println(Arrays.toString(strings));
    }
}
