package student.view;

import student.controller.StudentController;
import student.controller.TeacherController;

import java.util.Scanner;

public class Main {

    private static final int showStudent=1;
    private static final int showTeacher=2;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        StudentController studentController = new StudentController();
        TeacherController teacherController = new TeacherController();


        while (true) {
            System.out.println("--------Chọn chức năng-----------" +
                    "\n 1. Quản lý học viên" +
                    "\n 2. Quản lý giáo viên" +
                    "\n 3. Thoát");
            System.out.println("-------Chọn chức năng--------");

            int count = Integer.parseInt(scanner.nextLine());
            switch (count) {
                case showStudent:
                    studentController.displayMenu();
                    break;
                case showTeacher:
                    teacherController.displayMenu();
                    break;
                default:
                    System.exit(0);

            }
        }
    }
}
