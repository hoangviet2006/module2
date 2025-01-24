package ss15_exception.thuc_hanh;

import java.util.Scanner;

public class ExceptionTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check = false;
        int id;
        System.out.println("Nhập vào một số nguyên");
        while (!check) {
            try {
                id = Integer.parseInt(scanner.nextLine());
                check = true;
            } catch (Exception e) {
                System.out.println("Nhập lại bạn vừa nhập không phải  số nguyên");
                check = false;
            }
        }
    }
}
