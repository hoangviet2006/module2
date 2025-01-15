package ss3_array.bai_tap;

import java.util.Scanner;

public class CountTheNumberOfOccurrences {
    public static void main(String[] args) {
        String str = "fdsjjskdfjjjj";
        int count = 0;
        System.out.println("Nhập vào một kí tự");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (s.charAt(0)==str.charAt(i)){
                count++;
            }
        }
        System.out.println("Số lần xuất hiện của kí tự "+ s+ " trong "+ str+ " là: "+ count+ " lần");
    }
}
