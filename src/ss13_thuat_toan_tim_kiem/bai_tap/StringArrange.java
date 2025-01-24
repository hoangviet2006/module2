package ss13_thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class StringArrange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Vào Một Chuỗi:");
        String string = scanner.next();
        List<String> max = new LinkedList<>();
        String[] array = string.split("");
        for (int i = 0; i < array.length; i++) {
            List<String> stringList = new ArrayList<>();
            stringList.add(array[i]);
            for (int j = i + 1; j < array.length; j++) {
                if (array[j].compareTo(stringList.get(stringList.size() - 1)) > 0) {
                    stringList.add(array[j]);
                }
            }
            if (stringList.size() > max.size()) {
                max.clear();
                max.addAll(stringList);
            }
            stringList.clear();
        }
        for (String ch : max) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

