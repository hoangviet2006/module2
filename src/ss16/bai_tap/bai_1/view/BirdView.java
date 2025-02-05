package ss16.bai_tap.bai_1.view;

import Animal.model.Animal;
import ss16.bai_tap.bai_1.model.Bird;

import java.util.List;
import java.util.Scanner;

public class BirdView {
    private static Scanner scanner = new Scanner(System.in);

    public static Bird inputBird() {
        System.out.println("nhập tên loài chim");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi tên loài chim phải là chữ!, Nhập lại");
            }
        }
        System.out.println("nhập cân nặng  (g)");
        int weight;
        while (true){
            try {
                weight = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi cân nặng phải là số!, Nhập lại");
            }
        }
        System.out.println("nhập chiều dài (cm)");
        int length;
        while (true){
            try {
                length = Integer.parseInt(scanner.nextLine());
                break;
            }catch (NumberFormatException numberFormatException){
                System.out.println("Lỗi chiều phải là số!, Nhập lại");
            }
        }
        Bird bird = new Bird(weight, name, length);
        return bird;
    }

    public static String inputName() {
        System.out.println("nhập tên loài chim");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi tên loài chim phải là chữ!, Nhập lại");
            }
        }
        return name;
    }  public static String inputNameEdit() {
        System.out.println("nhập tên loài chim cần chỉnh sửa");
        String name;
        while (true) {
            try {
                name = scanner.nextLine();
                break;
            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("Lỗi tên loài chim phải là chữ!, Nhập lại");
            }
        }
        return name;
    }

    public static void displaySearchAnimals(List<Bird> listBird) {
        if (listBird.size() > 0) {
            for (int i = 0; i < listBird.size(); i++) {
                System.out.println(listBird.get(i).toString());
            }
        } else {
            System.out.println("Không có tên trong danh sách");
        }
    }

}
