package ss2_loop.thuc_hanh;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một số:");
        int number = scanner.nextInt();
        boolean check = true;
        if (number < 2) {
            System.out.println(number + " Không phải  số nguyên số");
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
            }
        }
        if (check){
            System.out.println(number+" Là số nguyên tố");
        }else{
            System.out.println(number+" không phải số nguyên tố");
        }
    }
}
