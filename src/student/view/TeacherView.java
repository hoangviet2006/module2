package student.view;

import student.model.Teacher1;

import java.util.Scanner;

public class TeacherView {
    public static Scanner scanner = new Scanner(System.in);

    public static void displayMenu(Teacher1[] teachers) {
        for (int i = 0; i < teachers.length; i++) {
            if (teachers[i] != null) {
                System.out.println(teachers[i]);
            }
        }
    }

    public static Teacher1 inputDataForTeacher() {
        System.out.println("-----Nhập tên------");
        String name = scanner.nextLine();
        System.out.println("----Nhập id------");
        int id = Integer.parseInt(scanner.nextLine());
        Teacher1 teacher = new Teacher1(name, id);
        return teacher;
    }

    public static int idTeacher(){
        System.out.println("----Nhập id cần xóa-----");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }

    public static String searchTeach(){
        System.out.println("------Nhập tên cần tìm----");
        String name = scanner.nextLine();
        return name;
    }
}
