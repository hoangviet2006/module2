package student.view;

import student.model.Student;

import java.util.Scanner;

public class StudentView {
    private static Scanner scanner = new Scanner(System.in);

    public static void display(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] != null) {
                System.out.println(students[i]);
            }
        }
    }

    public static Student inputDataForStudent() {
        System.out.println("-----Nhập id------");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("-------nhập tên------");
        String name = scanner.nextLine();
        Student students1 = new Student(id, name);
        return students1;
    }


    public static int inputId() {
        System.out.println("-----Nhập id------");
        int id = Integer.parseInt(scanner.nextLine());
        return id;
    }
    public static String inputName(){
        System.out.println("----Nhập tên-----");
        String name = scanner.nextLine();
        return name;
    }


}
