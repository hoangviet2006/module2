package ss11_stack_queue.bai_tap.bai3_chuoi_palindrome;

import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println("Nhập vào một chuỗi");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] strings = str.split("");
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < strings.length; i++) {
            stack.add(strings[i]);
            queue.add(strings[i]);
        }
        boolean check = true;
        while (!queue.isEmpty()) {
            if (!queue.poll().equals(stack.pop())) {
               check = false;
               break;
            }
        }
        if (check){
            System.out.println(Arrays.toString(strings) +" là chuỗi Palindrome");
        }else {
            System.out.println(Arrays.toString(strings)+ " không phải chuỗi Palindrome");
        }
    }
}
